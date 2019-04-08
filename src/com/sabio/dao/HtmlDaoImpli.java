package com.sabio.dao;

import org.springframework.stereotype.Repository;

import com.sabio.Login;
import com.sabio.Registration;
@Repository
public interface HtmlDaoImpli {
	public String registrationdao(Registration registration);
	public String logindao(Login login);
	public String forgotdao(Registration reg);

}
