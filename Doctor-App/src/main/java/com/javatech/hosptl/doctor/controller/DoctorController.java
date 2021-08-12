package com.javatech.hosptl.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.lib.CommonUtils;

@RestController
public class DoctorController {
	
	@Autowired
	CommonUtils commonUtils;
	
	@GetMapping("/getVesrion")
	public String getAppVersion() {
		return commonUtils.getVersionName();
	}

}
