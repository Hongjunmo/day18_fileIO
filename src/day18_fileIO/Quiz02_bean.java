package day18_fileIO;

import java.io.Serializable;

public class Quiz02_bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3212123053556111655L;
	private String name;
	private int stdnum, kor, eng, math, sum;
	double avg;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getStdnum() {
		return stdnum;
	}

	public void setStdnum(int stdnum) {
		this.stdnum = stdnum;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}
