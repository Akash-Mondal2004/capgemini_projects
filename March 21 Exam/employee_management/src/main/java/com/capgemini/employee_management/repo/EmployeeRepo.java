package com.capgemini.employee_management.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employee_management.model.EmpType;
import com.capgemini.employee_management.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	Optional<Employee> findByEmail(String email);

	boolean existsByEmail(String email);

	List<Employee> findByRole(EmpType role);

	List<Employee> findAllByOrderBySalaryDesc();
}
