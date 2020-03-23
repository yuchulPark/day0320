package com.bit.exam;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/com/bit/exam/beans.xml")
public class SpringConfig {
	@Bean(autowire=Autowire.BY_TYPE)
	public WriterArticleServiceImpl ws() {
		return new WriterArticleServiceImpl();
	}
}
