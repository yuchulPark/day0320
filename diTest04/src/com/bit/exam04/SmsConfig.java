package com.bit.exam04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfig {
	@Bean
	public SmsSender sender() {
		SmsSender s= new SmsSender();
		s.setFrom("ȫ�浿");
		s.setTo("�̼���");
		return s;
	}
}
