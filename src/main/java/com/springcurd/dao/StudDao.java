package com.springcurd.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcurd.model.Login;
import com.springcurd.repository.StudRepository;

@Component
public class StudDao 
{
	@Autowired
	StudRepository sr;
		public void add(Login login) 
		{
			sr.save(login);
		}
		public List<Login> get()
		{
			return sr.findAll();
		}
		public void  del(int id)
		{
			sr.deleteById(id);
		}
}
