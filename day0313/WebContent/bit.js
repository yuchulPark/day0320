function nextRandomInteger(limit){
	return Math.round(Math.random() * limit); // 랜덤한 정수 생성
}
var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
function randomAlphabet(){ // 랜덤한 알파벳을 리턴하는 함수
	return alphabet.charAt(nextRandomInteger(25))
}
function randomSpeed(maxSpeed){ // 양몸으로 랜덤한 속도를 생성하는 함수
	return Math.random() * maxSpeed - Math.random() * maxSpeed;
}
var canvasWidth = 700;
var canvasHeight = 500;
function MovingTest(){ // 생성자 함수를 만들음
	// 위치와 속도 속성
	this.x = nextRandomInteger(canvasWidth);
	this.y = nextRandomInteger(canvasHeight);
	this.vX = randomSpeed(10); // x축으로 이동하는 속도
	this.vY = randomSpeed(10); // y축으로 이동하는 속도
	// 문서 객체 생성
	this.h1 = document.createElement("h1")
	this.h1.innerHTML = randomAlphabet();
	this.h1.style.position = "absolute";
	this.h1.style.left = this.x + "px";
	this.h1.style.top = this.y + "px";
	// 문서 객체를 document.body에 추가
	document.body.appendChild(this.h1);
}
MovingTest.prototype.move = function(){
	// 범위 검사
	if(this.x < 0 || this.x > canvasWidth){
		this.vX = this.vX * -1;
	}
	if(this.y < 0 || this.y > canvasHeight){
		this.vY = this.vY * -1;
	}
	// 이동
	this.x = this.x + this.vX;
	this.y = this.y + this.vY;
	// 화면에 이동 표시
	this.h1.style.left = this.x + "px";
	this.h1.style.top = this.y + "px";
}