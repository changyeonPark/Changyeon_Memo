package ch09_class.school;

import ch09_class.commons.UtillClass;

public class Student {
	// 클래스 만드는 순서
	// 1. 필드 변수 선언
	// 접근 제어자
	// public : 공개, 프로젝트 내부 어디서든 접근 가능
	// private : 비공개, 현재 클래스 내에서만 접근 가능
	// (default) : 같은 폴더 내에 있는 클래스에서만 접근 가능
	// 캡슐화는 필드 변수 접근제어자를 전부 pivate 로 만든다.
	private String name;
	private int kScore;
	private int eScore;
	private int mScore;
	private double avg;
	
	// 보통 우리만의 메소드는 필드 선언과 생성자 만드는 중간에 만든다.
	// 변경 된 점수에 대해 평균을 고치는 메소드
	// 현재 클레스 내부에서만 사용되므로 private 으로 한다.
	private void setAvg() {
		avg = UtillClass.weRound((kScore+eScore+mScore) / 3.0, 1);
	}
	
	
	
	// 2. 생성자 만들기(+ 기본생성자)
	public Student() {}  // <- 기본생성
	
	public Student(String name, int kScore, int eScore, int mScore) {
		this.name = name;
		this.kScore = kScore;
		this.eScore = eScore;
		this.mScore = mScore;
		setAvg();
	}
	
	
	// Alt + Shift + S 에 유징 
	public Student(String name, int kScore, int eScore, int mScore, double avg) { 
		this.name = name;
		this.kScore = kScore;
		this.eScore = eScore;
		this.mScore = mScore;
		this.avg = avg;
	}
	
	// 3. toString() 추가
	// Alt + Shift + S 에 toString() 
	@Override
	public String toString() {
		return "[" + name + ", 국어: " + kScore + ", 영어: " + eScore + ", 수학: " + mScore + ", 평균: "
				+ avg + "]";
	}


	// private 으로 접근을 막은 필드 변수에 대해
	// Getters and Setters로 접근을 허용한다.
	// 단축키 [ Alt + Shift + S ] Generate Getters and Setters..
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getkScore() {
		return kScore;
	}

	public void setkScore(int kScore) {
		this.kScore = kScore;
		setAvg();
	}

	public int geteScore() {
		return eScore;
	}

	public void seteScore(int eScore) {
		this.eScore = eScore;
		setAvg();
	}

	public int getmScore() {
		return mScore;
	}

	public void setmScore(int mScore) {
		this.mScore = mScore;
		setAvg();
	}

	public double getAvg() {
		return avg;
	}
	
	
	
}
