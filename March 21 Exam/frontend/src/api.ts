import type {
  CreateEmployeePayload,
  Employee,
  EmpType,
  LoginPayload,
  LoginResponse,
  UpdateEmployeePayload,
} from './types'

const API_BASE = '/employees'

async function request<T>(path: string, init?: RequestInit): Promise<T> {
  const response = await fetch(`${API_BASE}${path}`, {
    headers: {
      'Content-Type': 'application/json',
      ...init?.headers,
    },
    ...init,
  })

  if (!response.ok) {
    const errorText = await response.text()
    throw new Error(errorText || 'Request failed')
  }

  const contentType = response.headers.get('content-type')
  if (contentType && contentType.includes('application/json')) {
    return (await response.json()) as T
  }

  return (await response.text()) as T
}

export function login(payload: LoginPayload) {
  return request<LoginResponse>('/login', {
    method: 'POST',
    body: JSON.stringify(payload),
  })
}

export function getAllEmployees() {
  return request<Employee[]>('', { method: 'GET' })
}

export function getEmployeeByEmail(email: string) {
  return request<Employee>(`/by-email?email=${encodeURIComponent(email)}`, { method: 'GET' })
}

export function getEmployeesByRole(role: EmpType | 'ALL') {
  if (role === 'ALL') {
    return getAllEmployees()
  }
  return request<Employee[]>(`/role/${role}`, { method: 'GET' })
}

export function createEmployee(payload: CreateEmployeePayload) {
  return request<Employee>('', {
    method: 'POST',
    body: JSON.stringify(payload),
  })
}

export function updateEmployee(id: number, payload: UpdateEmployeePayload) {
  return request<Employee>(`/${id}`, {
    method: 'PATCH',
    body: JSON.stringify(payload),
  })
}

export function deleteEmployee(id: number) {
  return request<string>(`/${id}`, { method: 'DELETE' })
}