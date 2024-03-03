package com.dakr.EmployeeInvoiceApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.EmployeeInvoiceApplication.entity.Employee;
import com.dakr.EmployeeInvoiceApplication.service.EmployeeServiceImpliments;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpliments serviceImpliments;
	
	
	@PostMapping("/Save")
	public Employee save(@RequestBody Employee employee) {
		
		return serviceImpliments.saveEmp(employee);
		
	}
	
	@DeleteMapping("/Delete/{Id}")
	public void delete(@PathVariable Integer Id) {
		
		serviceImpliments.deleteEmp(Id);
		
	}
	
	@GetMapping("/Get/{Id}")
	public Employee get(@PathVariable Integer Id) {
		return serviceImpliments.getEmp(Id);
		
	}
	
	@GetMapping("/GetAll")
	public List<Employee> getAll() {
		return serviceImpliments.getAllEmp();
		
	}
	
	@PutMapping("/Update/{Id}")
	public Employee update(@RequestBody Employee employee,@PathVariable Integer Id) {
		return serviceImpliments.updateEmp(employee, Id);
		
	}
	
	@GetMapping("/GetSal/{empSal}")
	public List<Employee> getEmpSal(@PathVariable double empSal) {
		
		return serviceImpliments.getEmpSal(empSal);
		
	}
	
}
