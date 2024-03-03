package com.dakr.EmployeeInvoiceApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmployeeTable")
public class Employee {

	@Id
	@Column(name="EmployeeId")
	private int empNo;
	private String empName;
	private double empSalary;
	private double ta;
	private double da;
	private double hra;
	private double pf;
	private double grassSalary;
	private double netSalary;
	
	
	
}
