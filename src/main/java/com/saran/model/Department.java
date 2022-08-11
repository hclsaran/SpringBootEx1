package com.saran.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component//<bean id="obj" class="com.saran.model.Department/>
public class Department {
	
	private String deptName;

}
