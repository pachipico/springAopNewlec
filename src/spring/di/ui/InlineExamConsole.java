package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component
public class InlineExamConsole implements ExamConsole {
	
	@Autowired
	private Exam exam;

	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	public Exam getExam() {
		return exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;

	}

}
