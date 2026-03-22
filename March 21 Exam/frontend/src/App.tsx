import { useEffect, useMemo, useState } from 'react'
import {
  createEmployee,
  deleteEmployee,
  getEmployeeByEmail,
  getEmployeesByRole,
  login,
  updateEmployee,
} from './api'
import type {
  CreateEmployeePayload,
  Employee,
  EmpType,
  LoginPayload,
  LoginResponse,
  UpdateEmployeePayload,
} from './types'
import type { FormEvent } from 'react'
import './App.css'

type RoleFilter = 'ALL' | EmpType

const initialCreateForm: CreateEmployeePayload = {
  name: '',
  email: '',
  mobile: '',
  role: 'EMPLOYEE',
  salary: 0,
  password: '',
}

function App() {
  const [authUser, setAuthUser] = useState<LoginResponse | null>(null)
  const [employees, setEmployees] = useState<Employee[]>([])
  const [isLoading, setIsLoading] = useState(false)
  const [message, setMessage] = useState('')
  const [error, setError] = useState('')

  const [roleFilter, setRoleFilter] = useState<RoleFilter>('ALL')
  const [emailSearch, setEmailSearch] = useState('')

  const [loginForm, setLoginForm] = useState<LoginPayload>({
    email: '',
    password: '',
  })

  const [createForm, setCreateForm] = useState<CreateEmployeePayload>(initialCreateForm)

  const [editId, setEditId] = useState<number | null>(null)
  const [editForm, setEditForm] = useState<UpdateEmployeePayload>({
    name: '',
    email: '',
    mobile: '',
    salary: 0,
  })

  const totalSalary = useMemo(
    () => employees.reduce((sum, employee) => sum + Number(employee.salary || 0), 0),
    [employees],
  )

  useEffect(() => {
    if (authUser) {
      void fetchEmployeesByRole('ALL')
    }
  }, [authUser])

  async function fetchEmployeesByRole(role: RoleFilter) {
    try {
      setError('')
      setMessage('')
      setIsLoading(true)
      const data = await getEmployeesByRole(role)
      setEmployees(data)
      setRoleFilter(role)
      setMessage(`Loaded ${data.length} employee(s)`)
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Failed to load employees')
    } finally {
      setIsLoading(false)
    }
  }

  async function handleLogin(event: FormEvent<HTMLFormElement>) {
    event.preventDefault()
    try {
      setError('')
      setMessage('')
      const user = await login(loginForm)
      setAuthUser(user)
      setMessage(user.message)
      setLoginForm({ email: '', password: '' })
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Login failed')
    }
  }

  async function handleCreateEmployee(event: FormEvent<HTMLFormElement>) {
    event.preventDefault()
    try {
      setError('')
      setMessage('')
      const created = await createEmployee({
        ...createForm,
        salary: Number(createForm.salary),
      })
      setCreateForm(initialCreateForm)
      setMessage(`Employee created: ${created.name}`)
      await fetchEmployeesByRole(roleFilter)
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Create employee failed')
    }
  }

  function startEdit(employee: Employee) {
    setEditId(employee.id)
    setEditForm({
      name: employee.name,
      email: employee.email,
      mobile: employee.mobile,
      salary: employee.salary,
    })
  }

  function cancelEdit() {
    setEditId(null)
    setEditForm({ name: '', email: '', mobile: '', salary: 0 })
  }

  async function handleUpdateEmployee(id: number) {
    try {
      setError('')
      setMessage('')
      const payload: UpdateEmployeePayload = {
        name: editForm.name?.trim() || undefined,
        email: editForm.email?.trim() || undefined,
        mobile: editForm.mobile?.trim() || undefined,
        salary: editForm.salary === undefined ? undefined : Number(editForm.salary),
      }
      await updateEmployee(id, payload)
      setMessage('Employee updated successfully')
      cancelEdit()
      await fetchEmployeesByRole(roleFilter)
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Update employee failed')
    }
  }

  async function handleDeleteEmployee(id: number) {
    const shouldDelete = window.confirm(`Delete employee with id ${id}?`)
    if (!shouldDelete) {
      return
    }

    try {
      setError('')
      setMessage('')
      const resultMessage = await deleteEmployee(id)
      setMessage(resultMessage)
      await fetchEmployeesByRole(roleFilter)
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Delete employee failed')
    }
  }

  async function handleSearchByEmail(event: FormEvent<HTMLFormElement>) {
    event.preventDefault()

    if (!emailSearch.trim()) {
      await fetchEmployeesByRole(roleFilter)
      return
    }

    try {
      setError('')
      setMessage('')
      setIsLoading(true)
      const employee = await getEmployeeByEmail(emailSearch.trim())
      setEmployees([employee])
      setMessage('Found employee by email')
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Search failed')
      setEmployees([])
    } finally {
      setIsLoading(false)
    }
  }

  function handleLogout() {
    setAuthUser(null)
    setEmployees([])
    setMessage('Logged out')
    setError('')
  }

  return (
    <main className="page">
      <section className="hero">
        <p className="eyebrow">Capgemini Suite</p>
        <h1>Employee Management Portal</h1>
        <p className="hero-copy">A full React frontend connected to your Spring Boot backend.</p>
      </section>

      {!authUser ? (
        <section className="panel login-panel">
          <h2>Login</h2>
          <form className="form-grid" onSubmit={handleLogin}>
            <label>
              Email
              <input
                type="email"
                value={loginForm.email}
                onChange={(event) => setLoginForm((prev) => ({ ...prev, email: event.target.value }))}
                required
              />
            </label>
            <label>
              Password
              <input
                type="password"
                value={loginForm.password}
                onChange={(event) => setLoginForm((prev) => ({ ...prev, password: event.target.value }))}
                required
              />
            </label>
            <button type="submit" className="btn primary">Sign In</button>
          </form>
        </section>
      ) : (
        <>
          <section className="panel topbar">
            <div>
              <h2>Welcome, {authUser.name}</h2>
              <p>{authUser.email} | Role: {authUser.role}</p>
            </div>
            <button type="button" className="btn" onClick={handleLogout}>Logout</button>
          </section>

          <section className="stats-grid">
            <article className="panel stat-card">
              <h3>Total Employees</h3>
              <p>{employees.length}</p>
            </article>
            <article className="panel stat-card">
              <h3>Total Salary</h3>
              <p>{totalSalary.toLocaleString()}</p>
            </article>
            <article className="panel stat-card">
              <h3>Role Filter</h3>
              <p>{roleFilter}</p>
            </article>
          </section>

          {authUser.role === 'MANAGER' ? (
            <section className="panel">
              <h2>Add Employee</h2>
              <form className="form-grid form-grid-3" onSubmit={handleCreateEmployee}>
                <label>
                  Name
                  <input
                    value={createForm.name}
                    onChange={(event) => setCreateForm((prev) => ({ ...prev, name: event.target.value }))}
                    required
                  />
                </label>
                <label>
                  Email
                  <input
                    type="email"
                    value={createForm.email}
                    onChange={(event) => setCreateForm((prev) => ({ ...prev, email: event.target.value }))}
                    required
                  />
                </label>
                <label>
                  Mobile
                  <input
                    value={createForm.mobile}
                    onChange={(event) => setCreateForm((prev) => ({ ...prev, mobile: event.target.value }))}
                    required
                  />
                </label>
                <label>
                  Role
                  <select
                    value={createForm.role}
                    onChange={(event) => setCreateForm((prev) => ({ ...prev, role: event.target.value as EmpType }))}
                  >
                    <option value="EMPLOYEE">EMPLOYEE</option>
                    <option value="MANAGER">MANAGER</option>
                  </select>
                </label>
                <label>
                  Salary
                  <input
                    type="number"
                    min="0"
                    value={createForm.salary}
                    onChange={(event) => setCreateForm((prev) => ({ ...prev, salary: Number(event.target.value) }))}
                    required
                  />
                </label>
                <label>
                  Password
                  <input
                    type="password"
                    value={createForm.password}
                    onChange={(event) => setCreateForm((prev) => ({ ...prev, password: event.target.value }))}
                    required
                  />
                </label>
                <button type="submit" className="btn primary">Create Employee</button>
              </form>
            </section>
          ) : (
            <section className="panel">
              <h2>Access</h2>
              <p>Only managers can create employees.</p>
            </section>
          )}

          <section className="panel">
            <h2>Employee Controls</h2>
            <div className="toolbar">
              <div className="toolbar-group">
                <button className="btn" type="button" onClick={() => fetchEmployeesByRole('ALL')}>All</button>
                <button className="btn" type="button" onClick={() => fetchEmployeesByRole('EMPLOYEE')}>EMPLOYEE</button>
                <button className="btn" type="button" onClick={() => fetchEmployeesByRole('MANAGER')}>MANAGER</button>
              </div>
              <form className="toolbar-search" onSubmit={handleSearchByEmail}>
                <input
                  type="email"
                  placeholder="Search by email"
                  value={emailSearch}
                  onChange={(event) => setEmailSearch(event.target.value)}
                />
                <button className="btn primary" type="submit">Search</button>
              </form>
            </div>

            {isLoading ? <p>Loading employees...</p> : null}

            <div className="table-wrap">
              <table>
                <thead>
                  <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Mobile</th>
                    <th>Role</th>
                    <th>Salary</th>
                    <th>Actions</th>
                  </tr>
                </thead>
                <tbody>
                  {employees.length === 0 ? (
                    <tr>
                      <td colSpan={7}>No employees found.</td>
                    </tr>
                  ) : (
                    employees.map((employee) => {
                      const isEditing = editId === employee.id

                      return (
                        <tr key={employee.id}>
                          <td>{employee.id}</td>
                          <td>
                            {isEditing ? (
                              <input
                                value={editForm.name ?? ''}
                                onChange={(event) =>
                                  setEditForm((prev) => ({ ...prev, name: event.target.value }))
                                }
                              />
                            ) : (
                              employee.name
                            )}
                          </td>
                          <td>
                            {isEditing ? (
                              <input
                                type="email"
                                value={editForm.email ?? ''}
                                onChange={(event) =>
                                  setEditForm((prev) => ({ ...prev, email: event.target.value }))
                                }
                              />
                            ) : (
                              employee.email
                            )}
                          </td>
                          <td>
                            {isEditing ? (
                              <input
                                value={editForm.mobile ?? ''}
                                onChange={(event) =>
                                  setEditForm((prev) => ({ ...prev, mobile: event.target.value }))
                                }
                              />
                            ) : (
                              employee.mobile
                            )}
                          </td>
                          <td>{employee.role}</td>
                          <td>
                            {isEditing ? (
                              <input
                                type="number"
                                min="0"
                                value={editForm.salary ?? 0}
                                onChange={(event) =>
                                  setEditForm((prev) => ({ ...prev, salary: Number(event.target.value) }))
                                }
                              />
                            ) : (
                              employee.salary
                            )}
                          </td>
                          <td>
                            <div className="actions">
                              {isEditing ? (
                                <>
                                  <button
                                    type="button"
                                    className="btn primary"
                                    onClick={() => void handleUpdateEmployee(employee.id)}
                                  >
                                    Save
                                  </button>
                                  <button type="button" className="btn" onClick={cancelEdit}>Cancel</button>
                                </>
                              ) : (
                                <>
                                  <button type="button" className="btn" onClick={() => startEdit(employee)}>Edit</button>
                                  <button
                                    type="button"
                                    className="btn danger"
                                    onClick={() => void handleDeleteEmployee(employee.id)}
                                  >
                                    Delete
                                  </button>
                                </>
                              )}
                            </div>
                          </td>
                        </tr>
                      )
                    })
                  )}
                </tbody>
              </table>
            </div>
          </section>
        </>
      )}

      {message ? <p className="feedback success">{message}</p> : null}
      {error ? <p className="feedback error">{error}</p> : null}
    </main>
  )
}

export default App
