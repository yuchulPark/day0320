package spring.entity;

import spring.di.entity.Exam;

public class NewlecExam implements Exam {
	private int kor;
	private int eng;
	private int math;
	private int com; // 4���� ������ ������ ����
	

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	@Override
	public double avg() {
		// TODO Auto-generated method stub
		return total() / 4.0;
	}

}
