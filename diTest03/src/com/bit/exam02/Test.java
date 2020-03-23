
package com.bit.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam02/beans.xml");
		SystemMonitor mon = (SystemMonitor)context.getBean("mon");
		mon.monitor();
	}
}
