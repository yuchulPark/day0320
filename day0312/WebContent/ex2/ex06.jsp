<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btnTeam1").click(function(){
			$(".student").css("background", "white");
			$(".team1").css("background", "yellow");
		});
		$("#btnTeam2").click(function(){
			$(".student").css("background", "white");
			$(".team2").css("background", "yellow");
		});
		$("#btnMgr").click(function(){
			$(".student").css("background", "white");
			$(".manager").css("background", "yellow");
		});
		$("#btnMgr1").click(function(){
			$(".student").css("background", "white");
			$(".manager.team1").css("background", "yellow");
		});
		$("#btnMgr2").click(function(){
			$(".student").css("background", "white");
			$(".manager.team2").css("background", "yellow");
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p class="student team1">1.이종호</p>
	<p class="student team1">2.홍수지</p>
	<p class="student team2">3.곽설아</p>
	<p class="student team2">4.김혜선</p>
	<p class="student team1">5.박유철</p>
	<p class="student team1 manager">6.이동현</p>
	<p class="student team1">7.서동욱</p>
	<p class="student team2">8.고요한</p>
	<p class="student team1">9.김정규</p>
	<p class="student team2">10.하지연</p>
	<p class="student team2">11.박도형</p>
	<p class="student team1">12.전은진</p>
	<p class="student team2 manager">13.이근희</p>
	<p class="student team2">14.유현성</p>
	<button id="btnTeam1">팀1의 구성원</button>
	<button id="btnTeam2">팀2의 구성원</button>
	<button id="btnMgr">모든 관리자</button>
	<button id="btnMgr1">팀1의 관리자</button>
	<button id="btnMgr2">팀2의 관리자</button>
</body>
</html>