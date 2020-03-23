package com.bit.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfig {
	@Bean
	public SmsSender sender() {
		SmsSender s = new SmsSender();
		s.setFrom("¹Ú");
		s.setTo("À¯Ã¶");
		
		return s;
	}
}
