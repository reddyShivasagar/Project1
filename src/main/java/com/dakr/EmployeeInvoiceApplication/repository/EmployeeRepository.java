package com.dakr.EmployeeInvoiceApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.EmployeeInvoiceApplication.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	List<Employee> findByEmpSalary(double empSal);

}
