package com.example2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.entity.Employee;
import com.example2.repository.EmpRepository;



@Service
public class EmpServiceImpl implements EmpService
{
	
	@Autowired
	EmpRepository empRepository;
	
	@Override
	public Employee login(String email)
	{
		Employee emp=empRepository.findByEmail(email);
		return emp;
		
	}
	
	
	public boolean addEmployeeService(Employee emp)
	{
		boolean status = false;
		try
		{
			empRepository.save(emp);
			 status=true;
		}
		catch(Exception e)
		{
			status= false;
			e.printStackTrace();
		}
		return status;
	}
	
	@Override
	public List<Employee> getAllEmployeesService()
//	public boolean getAllEmployeesService()
	{
		
		
		return empRepository.findAll();
		
 
	}
	
}