package com.bit.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Front Controller�� ���ؼ� 
// ȣ��� ��ó�� ������� ��� Action���� 
// ��ó���� ���Ͽ� ��������� �ؾ��� �޼ҵ带 
// proRequest�� �Ϲ�ȭ �մϴ�.
// ������ ������� ��ó�� ����ڵ��� ��� BitAction�� �ļ��� 
// �ǵ��� �Ϸ��� �մϴ�.
// �̸޼ҵ�� Front Controller�� ���� ȣ�� �� ���̹Ƿ�
// ����� ��û�� ��� request�� ������ ���� response�� �Ű������� 
// ������ �մϴ�.  �� ������ doGet, doPost�޼ҵ��� �ñ׳��Ŀ� 
// �����ϰ� �����մϴ�.
public interface BitAction {
	public String proRequest( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}











