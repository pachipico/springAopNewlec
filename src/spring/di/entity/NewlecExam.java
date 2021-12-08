package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class NewlecExam implements Exam {

	@Value("50")
	private int kor;

	private int math;

	private int eng;

	private int com;

	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public NewlecExam(int kor, int math, int eng, int com) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}



	@Override
	public int total() {
		return kor + math + eng + com;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}



	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", math=" + math + ", eng=" + eng + ", com=" + com + "]";
	}
	
	

}
