package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;

public class Program {

	public static void main(String[] args) {

		/*
		 * Exam exam = new NewlecExam();
		 * 
		 * // ExamConsole console = new InlineExamConsole(exam); ExamConsole console =
		 * new GridExamConsole();
		 * 
		 * console.setExam(exam);
		 */
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDIConfig.class);
//		Exam exam = context.getBean(Exam.class);
//		ExamConsole console = (ExamCons ole) context.getBean("console");
//		System.out.println(exam.toString());
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
		
		ExamConsole console = context.getBean(ExamConsole.class);
//		
//		for(Exam e : exams) {
//			System.out.println(e);
//		}
//		
		console.print();
	}

}
