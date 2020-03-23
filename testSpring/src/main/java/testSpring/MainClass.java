package testSpring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		TranspotationWalk transpotationWalk = new TranspotationWalk();
//		transpotationWalk.move();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml"); // 컨테이너에 접근하기 위한 데이터 타입
		TranspotationWalk transpotationWalk = ctx.getBean("tWalk",TranspotationWalk.class);
		transpotationWalk.move();
		ctx.close();
	}

}
