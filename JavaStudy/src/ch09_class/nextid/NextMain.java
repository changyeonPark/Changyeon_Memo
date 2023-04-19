package ch09_class.nextid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import ch09_class.school.Student;

// main 메소드를 보유하고 있는 클래스 ( 실행의 주체가 된다. )
public class NextMain {

	public static void main(String[] args) {
		// 학생 상태 관리
		String changyeonName = "창연";
		int changyeonAge = 30;
		int changyeonLevel = 2;
		int changyeonExp = 80;
		
		// 하루가 지나면 경험치를 얻고 ( 20 ~ 60 ) 사이
		// 경험치가 100이 넘으면 레벨 1 올려준다.
		int rand = (int)(Math.random() * 41 ) + 20;
		changyeonExp += rand;
		
		
		if(changyeonExp >= 100) {
			System.out.println("창연 레벨업!!");
			changyeonLevel++;
			System.out.println("창연의 현재 레벨: " + changyeonLevel);
			changyeonExp -= 100;
			System.out.println("창연의 현재 경험치: " + changyeonExp);
		}
		
		System.out.println("\n=======================================\n");
		
		String minkiName = "민기";
		int minkiAge = 28;
		int minkiLevel = 3;
		int minkiExp = 70;
		
		// 하루가 지났다.
		rand = (int)(Math.random() * 41 ) + 20;
		minkiExp += rand;
		
		
		if(minkiExp >= 100) {
			System.out.println("민기 레벨업!!");
			minkiLevel++;
			System.out.println("민기의 현재 레벨: " + minkiLevel);
			minkiExp -= 100;
			System.out.println("민기의 현재 경험치: " + minkiExp);
		}
		
		System.out.println("\n====================================================\n");
		
		// 클래스를 통한 객체 생성
		NextStudent junho = new NextStudent();
		
		// 클래스에 선언된 필드 변수들을 가지고 있다.
		System.out.println(junho.name);		// null
		System.out.println(junho.age);		// 0
		System.out.println(junho.level);	// 0
		System.out.println(junho.exp);		// 0
		
		System.out.println("\n====================================\n");
		
		// 필드 변수의 값에는 
		// 기본적으로 기본값(디폴트)이 들어있다.
		// 기본타입: 숫자(0), boolean(false)
		// 참조타입: null
		
		// 객체의 필드 변수에 
		// 값 넣기
		junho.name = "준호";
		junho.age = 30;
		junho.level = 2;
		junho.exp = 70;
		
		// 출력하기 
		System.out.println(junho.name);
		System.out.println(junho.age);
		System.out.println(junho.level);
		System.out.println(junho.exp);
		
		// 하루가 지났다.
		rand = (int)(Math.random() * 41 ) + 20;
		junho.exp += rand;
		System.out.println("준호의 현재 경험치: " + junho.exp);
		
		if(junho.exp >= 100) {
			System.out.println("준호 레벨업!!");
			junho.level++;
			System.out.println("준호의 현재 레벨: " + junho.level);
			junho.exp -= 100;
		}
		
		System.out.println("\n================================================\n");
		
		// 태윤씨도 추가
		// 클래스 추가 Scanner랑 방식 같음 
		NextStudent taeyoon = new NextStudent();
		taeyoon.name = "태윤";
		taeyoon.age = 28;
		taeyoon.level = 3;
		taeyoon.exp = 70;
		
		// 하루가 지났다.
		taeyoon.endDay();
		junho.endDay();
		
		System.out.println("\n==========================================\n");
		
		/**
		 * 지혜  
		 * 객체를 생성하면서 필드 변수 값 채우기
		 * 생성자의 파라미터 순서에 유의해서 필드 변수의 값을 넣는다.*/
		NextStudent jihye = new NextStudent("지혜", 28, 3, 40);
		System.out.println(jihye.name);
		System.out.println(jihye.age);
		System.out.println(jihye.level);
		System.out.println(jihye.exp);
		
		System.out.println("\n==============================================\n");
		
		// 객체의 상태를 한번에 보고싶다!!
		// 클래스 내에 toString() 메소드 오버라이딩
		// syso 내에 객체를 넣게 되면, toString()의 실행 결과가 
		// 콘솔창에 실행된다.
		System.out.println(jihye);
		System.out.println(jihye.toString());
		
		System.out.println("\n========================================\n");
		
		// 여러분들의 짝궁에 대해 객체로 만들어 주시오.
		// 레벨과 경험치는 1과 0으로 고정해서 만들어보세요.
		// 2명이상 
		
		NextStudent seongbok = new NextStudent("성복", 21, 1, 0);
		NextStudent jayeong = new NextStudent("자영", 20, 1, 0);
		
		System.out.println(seongbok);
		System.out.println(jayeong);
		
		// 레벨과 경험치는 1과 0으로 고정
		// 객체를 생성할때, 레벨과 경험치를 건드리지 않는다.
		// 이름과 나이만 입력받는 생성자로 객체를 생성하고자 한다.
		NextStudent junha = new NextStudent("준하", 27);
		System.out.println(junha);
		
		System.out.println("\n===============================================\n");
		
		// 객체 복사
		// 같은 필드 변수 값을 가지는 새로운 객체 생성
//		NextStudent junhaBot = junha; 
//		콜바이레퍼런로 준하와 준하봇이 같은 힙영역을 본다.
		NextStudent junhaBot = new NextStudent(junha.name, junha.age, junha.level, junha.exp);
		junhaBot.name = "준하봇";
		System.out.println(junhaBot);
		System.out.println(junha);
		
		// 하루가 지났다.
		jihye.endDay();
		junha.endDay();
		seongbok.endDay();
		jayeong.endDay();
		
		System.out.println("\n====================================\n");
		
		//다수의 객체를 다루기 위해서 ArrayList에 담기
		ArrayList<NextStudent> stuList = new ArrayList<>();
		
		stuList.add(jihye);
		stuList.add(junha);
		stuList.add(seongbok);
		stuList.add(jayeong);
		
		for(int i = 0; i < stuList.size(); i++) {
			stuList.get(i).endDay();
		}
		
		// 향상된 for 문
		// 왼쪽 객체이름<> String, Integer, NextStudent, ... + 담을 변수명
		// 오른쪽 = 담고있는 객체들의 Set이나 List의 변수명이 온다.
		for( NextStudent stu : stuList ) {
			stu.endDay();
		}
		
		System.out.println("\n====================================\n");
		
		// 객체를 생성하면서 ArrayList에 담기
		NextStudent jayoung = new NextStudent("자영", 25);
		stuList.add(new NextStudent("자영", 25));
		
		System.out.println(stuList.size());
		
		// 16일이 지났다.
		// 16번 반복하는 for문을 만들고
		// 그안에 하루 지난 조건을 넣어주면 된다.
		
		for(int i = 0; i < 16; i++) {
			for( NextStudent stu : stuList ) {
				stu.endDay();
			}
		}
		
		System.out.println("\n=====================================\n");
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		// 레벨을 이용하여 정렬하기
		// 문자 또는 숫자만 갖고 있는 문자열일때 Collections.sort
		// 정렬 기준을 모르면 sort에 빨간색 줄이 뜬다.
//		Collections.sort(stuList); 
		
		System.out.println("\n================================================\n");
		
		// 버블정렬을 이용하여 정렬하기
		// 변수명이나 함수명 한번에 바꾸기 단축키
		// [ Alt + Shift + R ]
		// stuList [지혜] [준하] [성복] [자영]
		for (int k = 0; k < stuList.size() - 1; k++) {
			for (int i = 0; i < stuList.size() -1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				// index 2번인 레벨과 비교 stuList.get(1)
				if (stuList.get(i).level < stuList.get(i+1).level) {
					NextStudent t = stuList.get(i);
					stuList.set(i, stuList.get(i+1));
					stuList.set(i+1, t);
				}
			}
		}
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등: " + stuList.get(i));
		}
		
		System.out.println("\n================== Collecions.sort() 오름차순 ==================\n");
		
		// 정렬 기준을 알려주면
		// Collections.sort()를 사용할 수 있다
		
		// 람다식 사용
		// stuA - stuB 는 오름차순
		Collections.sort(stuList, (stuA, stuB) -> stuA.level - stuB.level);
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등: " + stuList.get(i));
		}
		
		System.out.println("\n================== Collecions.sort() 오름차순 ==================\n");
		
		// stuB - stuA 는 내림차순
		Collections.sort(stuList, (stuA, stuB) -> stuB.level - stuA.level);
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등: " + stuList.get(i));
		}
		
		Student temp = new Student();
		
		
	}

}
