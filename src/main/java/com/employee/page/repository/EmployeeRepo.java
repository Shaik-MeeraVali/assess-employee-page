package com.employee.page.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.page.payload.RegistrationRequest;

public interface EmployeeRepo extends JpaRepository<RegistrationRequest, Integer>{
}
