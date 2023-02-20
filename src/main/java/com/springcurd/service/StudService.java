package com.springcurd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcurd.dao.StudDao;
import com.springcurd.model.Login;

@Service
public class StudService
{
	@Autowired
	StudDao sd;
	public void add(Login login)
	{
		sd.add(login);
	}
	public List<Login> get()
	{
		return sd.get();
	}
	public void del(int id)
	{
		sd.del(id);
	}
}
