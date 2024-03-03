package com.dakr.EmployeeInvoiceApplication.service;

import java.util.List;

import com.dakr.EmployeeInvoiceApplication.entity.Employee;

public interface EmployeeService {

	public Employee saveEmp(Employee employee);
	
	public void deleteEmp(Integer Id);
	
	public Employee getEmp(Integer Id);
	
	public List<Employee> getAllEmp();
	
	public Employee updateEmp(Employee employee,Integer Id);
	
	public List<Employee> getEmpSal(double empSal);
}
