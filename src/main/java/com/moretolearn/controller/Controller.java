package com.moretolearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moretolearn.repository.CustomRepository;
import com.moretolearn.repository.custom.CustomEmployeeRepository;
import com.moretolearn.repository.custom.CustomPersonRepository;


@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	CustomRepository cust;
	
	@Autowired
	CustomPersonRepository customPersonRepository;
	
	@Autowired 
//	@Qualifier("customRepository")
	CustomEmployeeRepository customEmployeeRepository;
	
	@Autowired 
//	@Qualifier("customEmployeeRepositoryImpl")
	CustomEmployeeRepository customEmployeeRepository2;

	@GetMapping(value = "/data")
	public List<?> getData() {
		return cust.getData();
	}
	
	@GetMapping(value = "/data1")
	public List<?> getData1() {
		return cust.getData1();
	}
	
	@GetMapping(value = "/data2")
	public List<?> getDatas() {
		return cust.getList();
	}
	
	@GetMapping(value = "/data3")
	public List<?> getDatas1() {
		return customPersonRepository.getPersonList();
	}
}
