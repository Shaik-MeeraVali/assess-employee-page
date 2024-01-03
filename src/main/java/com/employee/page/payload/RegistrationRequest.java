package com.employee.page.payload;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RegistrationRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regId;
	private String userId;
	private String assessment;
	private String date;
	
	//public boolean isValid()

}
