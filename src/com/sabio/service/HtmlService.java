package com.sabio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabio.Login;
import com.sabio.Registration;
import com.sabio.dao.HtmlDao;
import com.sabio.dao.HtmlDaoImpli;
@Service
public class HtmlService implements HtmlServiceImpli {

	@Autowired
	HtmlDaoImpli dao;
	@Override
	public String registrtionservice(Registration registration)
	{
		String s=dao.registrationdao(registration);
		return s;
		
	}
	@Override
	public String loginservice(Login login)
	{
	
		String s=dao.logindao(login);
		return s;
		
	}
	@Override
	public String forgotservice(Registration reg) {
		String s=dao.forgotdao(reg);
		return s;
	}
	
	
	
}
