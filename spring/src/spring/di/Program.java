package spring.di;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;
import spring.entity.NewlecExam;

public class Program {
	public static void main(String[] args) {
		Exam exam = new NewlecExam();
		 ExamConsole console = new InlineExamConsole(exam); // 출력되는 모양이 Inline
		// ExamConsole console = new GridExamConsole(exam); // 출력되는 모양이 Grid
		console.print();
	}
}
