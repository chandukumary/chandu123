package com.springcurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcurd.model.Login;
import com.springcurd.service.StudService;

@RestController
public class StudController 
{
	@Autowired
	StudService st;
	@PostMapping("/post")
	public void add(@RequestBody Login login)
	{
		//StudService st=new StudService();
		st.add(login);
		System.out.println("JenkinsTesting1234_new");
	}
	@GetMapping("/get")
	public List<Login> get()
	{
		return st.get();
	}
	@DeleteMapping("/delete/{id}")
	
	public void del(@PathVariable int id)
	{
		
		st.del(id);
	}
	}
