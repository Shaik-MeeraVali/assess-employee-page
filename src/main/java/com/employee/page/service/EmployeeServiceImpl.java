package com.employee.page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.page.payload.RegistrationRequest;
import com.employee.page.repository.EmployeeRepo;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	@Override
	public List<RegistrationRequest> getRegisteredEmployees() {
		return employeeRepo.findAll();
	}
	
	

}
