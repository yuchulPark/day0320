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
       
       // 파일로 기록
       try {
    	   FileWriter fr = new FileWriter("c:/bit/bitman.txt");
    	   // FileWriter fw = new FileWriter("c:/bit/bitman", true); // 파일을 계속 추가하고자 할때
       
    	   fr.write(str);
    	   // fw.write(str + "\n"); // 파일을 계속 추가하고자 할때
    	   
    	   fr.close();
    	   
    	   
       }catch(Exception e) {
    	   e.printStackTrace();
       }
       
       
    }
	
}
/*
 css - 설정방법 : 선택자{
 				속성명1:값;
 				속성명2:값2;
 				...
 				}
 	- 선택자 선택 방법 - 태그 이름, #id이름, .클래스이름 : 그룹을 지정할 때 사용
 - <li> 태그에서 list-style:none;하면 점이 안나옴
 		display-inline;하면 세로로 나올게 가로로 나옴
 	- 적용 방법 : 인터널 방식 - 미리 <head>에 style을 설정해두고 사용하는 방식
 				인라인 방식 - 태그를 사용할때 <> 적용하는 방식
 				익스터널 방식 - 익스터널 방식 : 외부의 파일에 미리 스타일을 지정하는 방식
 		부모 노드에 css를 설정하면 자식 노드들에게 영향을 끼침
 		부모 노드에 css가 설정되었으나 자식 노드에서 css가 설정되었다면 우선순위는 자식노드의 css가 더 높음
 		동일한 선택자에 대하여 여러 차례 css를 설정하면 가장 나중에 설정한 css가 적용됨. 그러나 더 구체화한 설정이 있다면 그것이 우선순위가 더 높음
 		인라인 방식, (인라인 방식 안에서의 id지정자, 태그 지정자, class 지정자), 익스터널 방식으로 모두 설정이 되어있을때
 		우선순위가 높은 순서는 인라인 방식 > id지정자 > class 지정자 > 태그 지정자 > 익스터널 방식 순으로 우선순위가 높음
 		
 		margin : 바깥쪽 여백 (위 아래 오른쪽 왼쪽 모두 여백이 생김)
 		padding : 안쪽 여백 (위 아래 오른쪽 왼쪽 모두 여백이 생김)
 		border : 테두리 두께
 		<형제지간의 margin 병합현상>
 		- 형제지간에 margin-bottom과 margin-top,의 값이 서로 다르게 설정되어 있을때 그 중 큰 값의 하나의 값으로 설정됨
 		<부모자식간의 margin, padding 병합현상>
 - 부모노드에 margin과 madding이 설정되어 있지 않고, 자식노드에만 margin이 설정되어 있을때 부모노드의 margin도 같이 설정됨
 - 부모노드에 margin설정은 없고 padding이 설정되어 있고 자식 노드에 margin이 설정되어 있을때 간격은 그 중에 큰 값으로 설정됨
 - 부모노드에 margin이 설정되어 있고, 자식노드에도 margin이 설정되어 있다면 그 중에 큰 값으로 설정됨
 - 부모노드에 margin. padding이 설정되어 있고, 자식노드에 margin이 설정되어 있다면 부모와 자식간의 간격은 padding(부모노드) + margin(자식노드)
 
 -display - block : 줄이 바뀜
 			- inline : 줄이 안바뀜. 크기를 설정할 수 없음
 			- inline-block : 줄이 안바뀜. 크기를 설정할 수 있음
 
 position - 부모의 margin이 설정되지 않으면 자식의 margin이 설정됨
 			- static (디폴트 값) - 정지된 (2차원)
 								- 부모 자식간의 마진병합 현상이 있음
 								- 2차원이므로 위치 지정이 안됨 (left, top 등)
 								- 부모노드에 크기(width, height) 설정이 없을때 자식의 크기만큼 설정됨
 			- fixed - 고정 (3차원)
 					- 부모 자식간의 마진병합 현상이 없음
 					- 위치 지정 가능
 					- 스크롤을 내려도 언제나 컴퓨터 화면을 기준으로 그 자리에 고정
 					- 자식의 크기(width, height)가 부모노드에 영향을 주지 않음
 			- absolute - 절대적인 (3차원)
 						- fix랑 비슷함
 						- 스크롤을 내려도 위로 올라감. html문서를 기준으로 위치가 지정됨
 						- 자식의 크기(width, height)가 부모노드에 영향을 주지 않음
 			- relative - 상대적인 (2차원 + 3차원)
 			- 2차원의 특징 - 부모, 자식간에 마진병합 현상 (세로에만. 가로는 x)
 						- 자식의 크기가 부모의 크기에 영향을 끼침
 			- 3차원의 특징 - 위치설정 (left, top)을 할 수 있음
 			
 	z-index - 3차원일때 사용 가능
 			- 값이 큰 순서대로 위에 나타남

overflow:hidden - 부모노드에 설정하여 자식이 부모를 넘치는 경우에 보이지 않도록 설정
float:left - 왼쪽부터 채움 (정렬방식)
clear:both - float설정을 제거. float를 한번 설정하면 그 다음 노드들에게 영향을 끼치므로 원하지 않는 시작 노드에 clear:both를 설정하여 제거
block - 줄이 변경됨, 크기 설정 가능
inline - 줄이 변경되지 않음. 크기 설정 불가
옆으로 배치하되 크기도 설정하고 싶으면 display:inline-block을 설정하면 됨
display:block / display:inline 



 
 */
