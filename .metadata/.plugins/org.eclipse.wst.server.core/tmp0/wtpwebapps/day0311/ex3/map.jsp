<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d24b45a0cda3b0e29fc1ea1a3fa5d8f1"></script>
<script>
	window.onload = function() {
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		mapOption = {
			center : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
			level : 3
		// 지도의 확대 레벨
		};

		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

		// 마커가 표시될 위치입니다 
		var markerPosition = new kakao.maps.LatLng(33.450701, 126.570667);

		// 마커를 생성합니다
		var marker = new kakao.maps.Marker({
			position : markerPosition
		});

		// 마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);

		// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
		// marker.setMap(null);

		document.getElementById("btnHome").onclick = function() {
			// 이동할 위도 경도 위치를 생성합니다 
			var moveLatLon = new kakao.maps.LatLng(37.494501, 126.685067);

			// 지도 중심을 이동 시킵니다
			map.setCenter(moveLatLon);

			// 마커를 생성합니다
			var marker = new kakao.maps.Marker({
				position : moveLatLon
			});

			// 마커가 지도 위에 표시되도록 설정합니다
			marker.setMap(map);
		}
		document.getElementById("btnKtutle").onclick = function() {
			// 이동할 위도 경도 위치를 생성합니다 
			var moveLatLon = new kakao.maps.LatLng(37.494501, 126.685067);

			// 지도 중심을 이동 시킵니다
			map.setCenter(moveLatLon);

			// 마커를 생성합니다
			var marker = new kakao.maps.Marker({
				position : moveLatLon
			});

			// 마커가 지도 위에 표시되도록 설정합니다
			marker.setMap(map);
		}
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="map" style="width: 100%; height: 350px;"></div>
	<button id="btnKtutle">거구장</button>
	<button id="btnHome">우리집</button>
</body>
</html>