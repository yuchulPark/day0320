package com.bit.controller;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Ss implements InitializingBean, DisposableBean{

	
	@Override
	public void destroy() throws Exception {
		System.out.println("按眉 家戈");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("按眉 积己");
	}
}
