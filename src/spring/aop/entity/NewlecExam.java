package spring.aop.entity;

public class NewlecExam implements Exam {

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
	
		int result = kor + math + eng + com;

		if(kor > 100) throw new IllegalArgumentException("유효하지 않은 점수 입니다."); 
		
		return result;
	}

	@Override
	public float avg() {

		float result = total() / 4.0f;

		return result;
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
