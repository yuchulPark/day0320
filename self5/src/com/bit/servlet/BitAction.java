package com.bit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BitAction {
	public String proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException; 
	/*
	 Front controller�� ���ؼ� ȣ��� ��ó�� ������� ��� Action���� ��ó���� ���Ͽ� �������̵� �ؾ��� �޼ҵ带 proRequest�� �Ϲ�ȭ�մϴ�.
	 ������ ������� ��ó�� ����ڵ��� ��� BitAction�� �ļ��� �ǵ��� �Ϸ��� �մϴ�. �� �޼ҵ�� FrontController�� ���� ȣ��� ���̹Ƿ� ����� ��û�� ��� request�� ������ ���� response�� �Ű������� ������ ��.
	 ��, ������ doGet, doPost �޼ҵ��� �ñ׳�ó�� (head) �����ϰ� ����
	 
	 */
}
