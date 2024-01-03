package com.employee.page.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.page.payload.RegistrationRequest;
import com.employee.page.service.EmployeeService;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {
	
	RestTemplate restTemplate = new RestTemplate();	
	@Autowired
	EmployeeService employeeService;
	
	@Value("${server.port}")
	private String port;
	@Value("${spring.application.name}")
	public String name;
	
	
	String baseurlString="http://localhost:8888/";
	String ownUrlString="http://localhost:7777/";
	
	@GetMapping("/technical-test")
	public ResponseEntity<String> technicalAssessmentForm() {
		System.out.println("employee test port number"+ port);
		return new ResponseEntity<String>("technical-test", HttpStatus.OK);
	}

	@GetMapping("/technical-success")
	public ResponseEntity<String> technicalAssessmentSuccessForm() {
		System.out.println(port+name);
		System.out.println("employee  success port number"+ port);
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
	
	@GetMapping("/behavioural-success")
	public ResponseEntity<String> behaviouralAssessmentSuccessForm() {
		
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
	
//	@PostMapping("/technical-test")
//	public RegistrationRequest technicalAssessmentReg(RegistrationRequest registrationRequest) {
////		String urlString=ownUrlString+"technical";
////		ResponseEntity<String> technicalPage= restTemplate.postForEntity(urlString, registrationRequest, String.class);
//	RegistrationRequest technicalPage= employeeService.registerEmployee(registrationRequest);
//		//return new ResponseEntity<String>(technicalPage, HttpStatus.CREATED);
//	System.out.println(technicalPage);
//	return technicalPage;
//	}
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<RegistrationRequest>> getallEmployees(){
		System.out.println("Original service--->"+employeeService.getRegisteredEmployees());
		return new ResponseEntity<List<RegistrationRequest>>(employeeService.getRegisteredEmployees(), HttpStatus.OK);
	}
	
}
