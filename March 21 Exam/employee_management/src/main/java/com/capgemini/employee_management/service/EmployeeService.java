package com.capgemini.employee_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employee_management.Dto.EmployeeDto;
import com.capgemini.employee_management.Dto.LoginDto;
import com.capgemini.employee_management.Dto.LoginResponseDto;
import com.capgemini.employee_management.globalexception.NotFoundException;
import com.capgemini.employee_management.model.EmpType;
import com.capgemini.employee_management.model.Employee;
import com.capgemini.employee_management.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public Employee save(Employee emp) {
        validateEmployee(emp);

        if (employeeRepo.existsByEmail(emp.getEmail())) {
            throw new RuntimeException("Employee already exists with email: " + emp.getEmail());
        }

        return employeeRepo.save(emp);
    }

	public List<Employee> showAll() {
		// TODO Auto-generatedo method stub
		return employeeRepo.findAll();
	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).orElseThrow(() -> new NotFoundException("Employee not found with id:" + id));

	}
	

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Employee employee = findById(id);
        employeeRepo.delete(employee);
	}
	

	public Employee updateEmployee(int id, EmployeeDto updatedEmployee) {
		// TODO Auto-generated method stub
		Employee existing = findById(id);
		if (updatedEmployee.getName() != null) {
			existing.setName(updatedEmployee.getName());
		}
		if (updatedEmployee.getEmail() != null) {
			existing.setEmail(updatedEmployee.getEmail());
		}
		if (updatedEmployee.getMobile() != null) {
			existing.setMobile(updatedEmployee.getMobile());
		}
		if(updatedEmployee.getSalary() != null) {
			existing.setSalary(updatedEmployee.getSalary());
		}
		
		
		return save(existing);
	}
	public Employee findByEmail(String email) {
        return employeeRepo.findByEmail(email)
                .orElseThrow(() -> new NotFoundException("Employee not found with email: " + email));
    }

    public List<Employee> findByRole(EmpType role) {
        return employeeRepo.findByRole(role);
    }

    private void validateEmployee(Employee emp) {
        if (emp.getName() == null || emp.getName().trim().isEmpty()) {
            throw new RuntimeException("Name is required");
        }

        if (emp.getEmail() == null || emp.getEmail().trim().isEmpty()) {
            throw new RuntimeException("Email is required");
        }

        if (emp.getMobile() == null || emp.getMobile().trim().isEmpty()) {
            throw new RuntimeException("Mobile is required");
        }

        if (emp.getSalary() < 0) {
            throw new RuntimeException("Salary cannot be negative");
        }

        if (emp.getRole() == null) {
            throw new RuntimeException("Role is required");
        }
    }
    
    private List<Employee> sortBySalary(){
    	return employeeRepo.findAllByOrderBySalaryDesc();
    }
    
    public LoginResponseDto login(LoginDto loginDto) {
        Employee employee = employeeRepo.findByEmail(loginDto.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));

        if (!employee.getPassword().equals(loginDto.getPassword())) {
            throw new RuntimeException("Invalid email or password");
        }

        return new LoginResponseDto(
                employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getRole(),
                "Login successful"
        );
    }
    
	
	
}
