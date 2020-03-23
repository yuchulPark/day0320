package com.bit.exam;

import java.sql.Connection;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		WriterArticleServiceImpl ws = (WriterArticleServiceImpl)context.getBean("ws");
		ws.pro();
		
		/* spring MVC�� �ֿ� ���� ���
		
		DispatcherServelet - Ŭ���̾�Ʈ�� ��û�� ���޹޾� ��Ʈ�ѷ����� Ŭ���̾�Ʈ�� ��û�� �����ϰ� ��Ʈ�ѷ��� ������ ������� view�� �����Ͽ� �˸��� ������ �����ϵ��� ��
		HandlerMapping - Ŭ���̾�Ʈ�� ��û URL�� � ��Ʈ�ѷ��� ó�������� ����
		��Ʈ�ѷ� (controller) - Ŭ���̾�Ʈ��  ��û�� ó���ѵ�, �� ����� DispatcherServlet���� �˷��ش�.
							- ��Ʈ������ action�� ������ ������ ����
		ModelAndView - ��Ʈ�ѷ��� ó���� ��� ���� �� �� ���ÿ� �ʿ��� ������ ��´�.
		ViewResolver - ��Ʈ�ѷ��� ó�� ����� ������ �並 ����
		�� (view) ��Ʈ�ѷ��� ó�� ��� ȭ���� ����
		
		
		
		
		
		
		*/
	}
}
