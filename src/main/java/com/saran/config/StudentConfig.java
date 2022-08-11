package com.saran.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.saran.model.Student;

@Configuration
public class StudentConfig {
	
	@Bean("studentBean")
	public Student stuBean() {
		return new Student();
	}

}
