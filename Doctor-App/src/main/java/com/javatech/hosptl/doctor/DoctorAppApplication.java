package com.javatech.hosptl.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javatech.lib.CommonUtils;

@SpringBootApplication
public class DoctorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorAppApplication.class, args);
	}

	
	@Bean
	public CommonUtils getCommonUtils() {
		return new CommonUtils();
	}
}
