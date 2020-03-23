package com.bit.action;

import java.io.FileWriter;
import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Application Lifecycle Listener implementation class Lt
 *
 */
@WebListener
public class Lt implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public Lt() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
       String uri = ((HttpServletRequest)arg0.getServletRequest()).getRequestURI();
       String ip = ((HttpServletRequest)arg0.getServletRequest()).getRemoteAddr();
       Date date = new Date();
       String str = uri + "/" + ip + "/" + date;
       System.out.println(str);
       
       // ���Ϸ� ���
       try {
    	   FileWriter fr = new FileWriter("c:/bit/bitman.txt");
    	   // FileWriter fw = new FileWriter("c:/bit/bitman", true); // ������ ��� �߰��ϰ��� �Ҷ�
       
    	   fr.write(str);
    	   // fw.write(str + "\n"); // ������ ��� �߰��ϰ��� �Ҷ�
    	   
    	   fr.close();
    	   
    	   
       }catch(Exception e) {
    	   e.printStackTrace();
       }
       
       
    }
	
}
/*
 css - ������� : ������{
 				�Ӽ���1:��;
 				�Ӽ���2:��2;
 				...
 				}
 	- ������ ���� ��� - �±� �̸�, #id�̸�, .Ŭ�����̸� : �׷��� ������ �� ���
 - <li> �±׿��� list-style:none;�ϸ� ���� �ȳ���
 		display-inline;�ϸ� ���η� ���ð� ���η� ����
 	- ���� ��� : ���ͳ� ��� - �̸� <head>�� style�� �����صΰ� ����ϴ� ���
 				�ζ��� ��� - �±׸� ����Ҷ� <> �����ϴ� ���
 				�ͽ��ͳ� ��� - �ͽ��ͳ� ��� : �ܺ��� ���Ͽ� �̸� ��Ÿ���� �����ϴ� ���
 		�θ� ��忡 css�� �����ϸ� �ڽ� ���鿡�� ������ ��ħ
 		�θ� ��忡 css�� �����Ǿ����� �ڽ� ��忡�� css�� �����Ǿ��ٸ� �켱������ �ڽĳ���� css�� �� ����
 		������ �����ڿ� ���Ͽ� ���� ���� css�� �����ϸ� ���� ���߿� ������ css�� �����. �׷��� �� ��üȭ�� ������ �ִٸ� �װ��� �켱������ �� ����
 		�ζ��� ���, (�ζ��� ��� �ȿ����� id������, �±� ������, class ������), �ͽ��ͳ� ������� ��� ������ �Ǿ�������
 		�켱������ ���� ������ �ζ��� ��� > id������ > class ������ > �±� ������ > �ͽ��ͳ� ��� ������ �켱������ ����
 		
 		margin : �ٱ��� ���� (�� �Ʒ� ������ ���� ��� ������ ����)
 		padding : ���� ���� (�� �Ʒ� ������ ���� ��� ������ ����)
 		border : �׵θ� �β�
 		<���������� margin ��������>
 		- ���������� margin-bottom�� margin-top,�� ���� ���� �ٸ��� �����Ǿ� ������ �� �� ū ���� �ϳ��� ������ ������
 		<�θ��ڽİ��� margin, padding ��������>
 - �θ��忡 margin�� madding�� �����Ǿ� ���� �ʰ�, �ڽĳ�忡�� margin�� �����Ǿ� ������ �θ����� margin�� ���� ������
 - �θ��忡 margin������ ���� padding�� �����Ǿ� �ְ� �ڽ� ��忡 margin�� �����Ǿ� ������ ������ �� �߿� ū ������ ������
 - �θ��忡 margin�� �����Ǿ� �ְ�, �ڽĳ�忡�� margin�� �����Ǿ� �ִٸ� �� �߿� ū ������ ������
 - �θ��忡 margin. padding�� �����Ǿ� �ְ�, �ڽĳ�忡 margin�� �����Ǿ� �ִٸ� �θ�� �ڽİ��� ������ padding(�θ���) + margin(�ڽĳ��)
 
 -display - block : ���� �ٲ�
 			- inline : ���� �ȹٲ�. ũ�⸦ ������ �� ����
 			- inline-block : ���� �ȹٲ�. ũ�⸦ ������ �� ����
 
 position - �θ��� margin�� �������� ������ �ڽ��� margin�� ������
 			- static (����Ʈ ��) - ������ (2����)
 								- �θ� �ڽİ��� �������� ������ ����
 								- 2�����̹Ƿ� ��ġ ������ �ȵ� (left, top ��)
 								- �θ��忡 ũ��(width, height) ������ ������ �ڽ��� ũ�⸸ŭ ������
 			- fixed - ���� (3����)
 					- �θ� �ڽİ��� �������� ������ ����
 					- ��ġ ���� ����
 					- ��ũ���� ������ ������ ��ǻ�� ȭ���� �������� �� �ڸ��� ����
 					- �ڽ��� ũ��(width, height)�� �θ��忡 ������ ���� ����
 			- absolute - �������� (3����)
 						- fix�� �����
 						- ��ũ���� ������ ���� �ö�. html������ �������� ��ġ�� ������
 						- �ڽ��� ũ��(width, height)�� �θ��忡 ������ ���� ����
 			- relative - ������� (2���� + 3����)
 			- 2������ Ư¡ - �θ�, �ڽİ��� �������� ���� (���ο���. ���δ� x)
 						- �ڽ��� ũ�Ⱑ �θ��� ũ�⿡ ������ ��ħ
 			- 3������ Ư¡ - ��ġ���� (left, top)�� �� �� ����
 			
 	z-index - 3�����϶� ��� ����
 			- ���� ū ������� ���� ��Ÿ��

overflow:hidden - �θ��忡 �����Ͽ� �ڽ��� �θ� ��ġ�� ��쿡 ������ �ʵ��� ����
float:left - ���ʺ��� ä�� (���Ĺ��)
clear:both - float������ ����. float�� �ѹ� �����ϸ� �� ���� ���鿡�� ������ ��ġ�Ƿ� ������ �ʴ� ���� ��忡 clear:both�� �����Ͽ� ����
block - ���� �����, ũ�� ���� ����
inline - ���� ������� ����. ũ�� ���� �Ұ�
������ ��ġ�ϵ� ũ�⵵ �����ϰ� ������ display:inline-block�� �����ϸ� ��
display:block / display:inline 



 
 */
