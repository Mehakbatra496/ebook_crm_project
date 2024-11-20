package com.example2.service;

import com.example2.entity.Employee;
import java.util.List;
import com.example2.repository.EmpRepository;

public  interface  EmpService
{
	public Employee login(String email);
	public boolean addEmployeeService(Employee emp);
	public List<Employee> getAllEmployeesService();
//	public boolean getAllEmployeesService();
	
}

