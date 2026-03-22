export type EmpType = 'EMPLOYEE' | 'MANAGER'

export interface Employee {
  id: number
  name: string
  email: string
  mobile: string
  role: EmpType
  salary: number
  password?: string
}

export interface CreateEmployeePayload {
  name: string
  email: string
  mobile: string
  role: EmpType
  salary: number
  password: string
}

export interface UpdateEmployeePayload {
  name?: string
  email?: string
  mobile?: string
  salary?: number
}

export interface LoginPayload {
  email: string
  password: string
}

export interface LoginResponse {
  id: number
  name: string
  email: string
  role: EmpType
  message: string
}