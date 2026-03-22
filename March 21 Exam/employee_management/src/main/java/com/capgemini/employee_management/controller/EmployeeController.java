package com.capgemini.employee_management.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.employee_management.Dto.EmployeeDto;
import com.capgemini.employee_management.Dto.LoginDto;
import com.capgemini.employee_management.Dto.LoginResponseDto;
import com.capgemini.employee_management.model.EmpType;
import com.capgemini.employee_management.model.Employee;
import com.capgemini.employee_management.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.showAll();
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.findById(id);
	}

	@PatchMapping("/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody EmployeeDto updatedEmployee) {
		return employeeService.updateEmployee(id, updatedEmployee);
	}
	
	@DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteById(id);
        return "Employee deleted successfully with id: " + id;
    }

    @GetMapping("/by-email")
    public Employee getEmployeeByEmail(@RequestParam String email) {
        return employeeService.findByEmail(email);
    }

    @GetMapping("/role/{role}")
    public List<Employee> getEmployeesByRole(@PathVariable EmpType role) {
        return employeeService.findByRole(role);
    }
    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginDto loginDto) {
        return employeeService.login(loginDto);
    }

}
