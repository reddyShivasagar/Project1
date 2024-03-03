package com.dakr.EmployeeInvoiceApplication.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dakr.EmployeeInvoiceApplication.entity.Employee;
import com.dakr.EmployeeInvoiceApplication.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpliments implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee saveEmp(Employee employee) {

		Employee employee2= new Employee();
		
		int empNo = employee.getEmpNo();
		String empName = employee.getEmpName();
		double empSalary = employee.getEmpSalary();
		double ta = employee.getTa();
		double da = employee.getDa();
		double hra = employee.getHra();
		double pf= employee.getPf();
		double grassSalary = employee.getGrassSalary();
		double netSalary = employee.getNetSalary();
		
		if(empSalary<30000) {
			ta=empSalary*0.7;
			da=empSalary*0.9;
			hra=empSalary*0.11;
			pf = empSalary*0.15;
		}
		else if(empSalary>=30000 && empSalary<=50000) {
			ta=empSalary*0.12;
			da=empSalary*0.13;
			hra=empSalary*0.17;
			pf = empSalary*0.22;
		
		}
		else if(empSalary>=50000) {
			ta=empSalary*0.17;
			da=empSalary*0.19;
			hra=empSalary*0.21;
			pf = empSalary*0.25;
		
		}
		
		grassSalary=empSalary+ta+da+hra;
		netSalary=grassSalary-pf;
		
		employee2.setEmpNo(empNo);
		employee2.setEmpName(empName);
		employee2.setEmpSalary(empSalary);
		employee2.setTa(ta);
		employee2.setDa(da);
		employee2.setHra(hra);
		employee2.setPf(pf);
		employee2.setGrassSalary(grassSalary);
		employee2.setNetSalary(netSalary);
		
		return repository.save(employee2);
	}

	@Override
	public void deleteEmp(Integer Id) {

		repository.deleteById(Id);
	}

	@Override
	public Employee getEmp(Integer Id) {

		Employee employee=repository.findById(Id).get();
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmp() {

		List<Employee> list=repository.findAll();
		return list;
	}

	@Override
	public Employee updateEmp(Employee employee, Integer Id) {
		
		Employee employee2=repository.findById(Id).get();
		
		int empNo = employee.getEmpNo();
		String empName = employee.getEmpName();
		double empSalary = employee.getEmpSalary();
		double ta = employee.getTa();
		double da = employee.getDa();
		double hra = employee.getHra();
		double pf= employee.getPf();
		double grassSalary = employee.getGrassSalary();
		double netSalary = employee.getNetSalary();
		
		if(empSalary<30000) {
			ta=empSalary*0.7;
			da=empSalary*0.9;
			hra=empSalary*0.11;
			pf=empSalary*0.15;
		}
		else if(empSalary>=30000 && empSalary<=50000) {
			ta=empSalary*0.12;
			da=empSalary*0.13;
			hra=empSalary*0.17;
			pf=empSalary*0.22;
		
		}
		else if(empSalary>=50000) {
			ta=empSalary*0.17;
			da=empSalary*0.19;
			hra=empSalary*0.21;
			pf=empSalary*0.25;
		
		}
		
		grassSalary=empSalary+ta+da+hra;
		netSalary=grassSalary-pf;
		
		employee2.setEmpNo(empNo);
		employee2.setEmpName(empName);
		employee2.setEmpSalary(empSalary);
		employee2.setTa(ta);
		employee2.setDa(da);
		employee2.setHra(hra);
		employee2.setPf(pf);
		employee2.setGrassSalary(grassSalary);
		employee2.setNetSalary(netSalary);
		
		
		return repository.save(employee2);
	}

	@Override
	public List<Employee> getEmpSal(double empSal) {
	
		return repository.findByEmpSalary(empSal);
	}

	

}
