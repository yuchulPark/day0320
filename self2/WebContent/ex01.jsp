<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	자바스크립트 - js : 웹프로그래밍 언어 (클라이언트 실행)
			- jsp : 웹 프로그래밍 언어 (서버에서 실행)
	소스코드가 전부 노출되는 js는 웹 어플리케이션 초기에는 인기가 없었고, 서버로 보내기전에 사용자의 입력값을 검사하는 (유효성 검사) 용도로만 사용하는 추세였음
	현재의 웹은 사용자의 요구가 복잡해지고, jsp로 요청하게 되면 문서 전체를 읽어오게 되는데 필요한 부분을 (데이터) 서버로부터 데이터만 읽어오는 기술(ajax)이 필수로 웹 어플리케이션에 사용됨에 따라 이 ajax는 자바스크립트 기술이므로 현재는 js가 중요하게 사용되고 있음
	크롬 브라우저가 발표되면서(2008) 원래 js는 클라이언트(브라우저)에서 동작하는 것이었는데 js를 브라우저가 아닌 곳에서 동작하는 기술을 발표 (node.js)
	node.js를 사용하게 되면 더 이상 클라이언트 사이드라고 말할 수 없음
	node.js기반의 패키지 중 웹서버를 위한 패키지가 express라는 모듈이 있음. 이것을 이용하면 톰캣같은 서버설정 없이 단 몇줄이면 서버를 가동할 수 있음. 즉, js만으로 웹서비스가 가능함
	풀스택(mean스택) - MongoDB, express, angular, node.js 4개가 꾸며진 웹서비스
	(angular를 대신할 수 있는 것 : jquery, react, Vue.js (뷰 탬플릿))
	jquery나 angular는 ajax통신을 통해서 서버로부터 받아온 데이터를 받고 동적인 html노드를 쉽게 생성, 수정, 삭제하기 위한 기술
	{}는 객체를 표현
	 -->
	 <script type="text/javascript">
	 	name="홍길동";
	 	document.write("<h2>안녕하세요. " + name + "</h2>");
	 </script>
</body>
</html>