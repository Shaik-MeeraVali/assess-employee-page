package com.employee.page.service;

import java.util.List;

import com.employee.page.payload.RegistrationRequest;

public interface EmployeeService {
	
	public List<RegistrationRequest> getRegisteredEmployees();

}
