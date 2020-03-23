<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var arr; // 배열. 전역변수 선언. 선택한 행의 td들(자식노드들)을 바라볼 변수
		var input = document.getElementsByTagName("input"); // 배열. 전역에 선언. 이름, 국어, 영어, 수학을 입력하는 태그인 input
		var selTr; // 선택한 행을 바라볼 변수 (후에 삭제하기 위한)
		
		document.getElementById("delete").onclick = function(){ // 삭제
			document.getElementById("list").removeChild(selTr); // 테이블로부터 선택한 행(selTr)을 삭제
		}
		document.getElementById("update").onclick = function(){ // 수정
			var sum = 0;
			for(var i in input){ // input 태그의 수만큼 반복 실행
				arr[i].innerHTML = input[i].value; // 입력 내용으로 td의 내용을 바꾼다.
				if(i != 0){ // 총점을 누적한다. (0번째는 이름이니까 제외)
					sum += eval(input[i].value); // 입력양식의 내용은 문자로 취급하므로 계산할 수 있는 형태로 변경하여 누적
				}
				if(i == 3){ // i=4랑 i=5는 돌 필요가 없으므로 3인상태에서 종료
					break;
				}
			}
			// 총점과 평균을 담는다.
			var avg = sum/3;
			arr[4].innerHTML = sum;
			arr[5].innerHTML = avg;
		} 
		document.getElementById("btn").onclick = function() { // 추가
			var tr = document.createElement("tr"); // tr노드  생성
			tr.onclick = function(){ // 생성된 tr에 클릭 이벤트를 설정하여 선택한 행의 정보를 각각의 입력창에 출력
				selTr = this; // 지정한게 자신이라는 뜻. 후에 삭제할때를 위해 적어줌 (선택한 tr(자기 자신)을 selTr에 설정)
				var trList = document.getElementsByTagName("tr"); // 모든 tr의 배경을 흰색으로 설정
				for(var i = 0; i < trList.length; i++){
					trList[i].style.background = "white"; 
				} 
				this.style.background = "yellow"; // 선택한 행에 css의 style을 설정하여 하이라이트 설정. 누른것만 노란색으로 전부가 칠해짐
				
				arr = this.childNodes; // 나의 자식노드들을 arr에 담음. 선택한 tr의 자식노드를 읽어옴. 그것은 곧 td들임
				for(var i in input){ // 선택한 행의 td중 이름, 국어, 영어, 수학만 입력창에 출력. for(var i = 0; i<input.length; i++)
					input[i].value = arr[i].innerHTML;
				}	
			}
			var sum = 0; // 총점을 누적하기 위한 변수 선언
			// input 태그들의 요소만큼 text노드를 생성
			for(var i = 0; i < input.length; i++){
				var td = document.createElement("td"); // td노드 생성
				var text = document.createTextNode(input[i].value);
				td.appendChild(text); // td에 텍스트노드를 담음
				tr.appendChild(td); // td를 tr에 추가
				if(i != 0){ // i가 0이면 이름이므로 제외하고 누적
					sum += eval(input[i].value); // 계산할 수 있는 숫자로 변환하여 누적
				}
			}
			// 총합과 평균을 계산
			var avg = sum/3;
			var textSum = document.createTextNode(sum); // 총점 위한 텍스트노드
			var textAvg = document.createTextNode(avg); // 평균 위한 텍스트노드
			var tdSum = document.createElement("td"); // 총점 위한 td태그
			var tdAvg = document.createElement("td"); // 평균 위한 td태그
			tdSum.appendChild(textSum); // 총점 위한 td태그에 텍스트노드를 담음
			tdAvg.appendChild(textAvg); // 평균 위한 td태그에 텍스트노드를 담음 
			tr.appendChild(tdSum); // 총점 위한 tr태그에 td를 담음
			tr.appendChild(tdAvg); // 총점 위한 tr태그에 td를 담음
			
			document.getElementById("list").appendChild(tr); // 생성된 tr을 테이블에 담음
			
			for(var i in input){
				input[i].value = "";
			}
		}
	}
</script>
</head>
<body>
	<table id="list" border="1" width="80%">
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>총점</td>
			<td>평균</td>
		</tr>
	</table>
	이름 : <input type="text"><br>
	국어 : <input type="text"><br>
	영어 : <input type="text"><br>
	수학 : <input type="text"><br>
	<button id="btn">등록</button> 
	<button id="update">수정</button>
	<button id="delete">삭제</button>
</body>
</html>