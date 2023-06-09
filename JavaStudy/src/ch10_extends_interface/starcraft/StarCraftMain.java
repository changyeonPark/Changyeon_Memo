package ch10_extends_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {

	public static void main(String[] args) {
		
		// 마린 생성
		// 마린 상태 확인 
		Marine marine = new Marine("마린", 6, 50, 0);
		System.out.println(marine);
		
		// 마린 100좌표, 200좌표 이동
		// 마린 스팀팩
		// 마린 상태확인
		marine.move(100, 200);
		marine.stimpack();
		System.out.println(marine);
		
		// 마린2 생성
		Marine marine2 = new Marine("마린", 6, 50, 0);
		System.out.println(marine2);
		
		// 질럿 생성
		Zealot zealot = new Zealot();
		System.out.println(zealot);
		
		// 질럿 10좌표, 5좌표 이동
		zealot.move(10, 5);
		
		// 질럿 5마리 생성
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		
		// 질럿을 드래그로 선택 후 한번에 이동 명령 내리기
		ArrayList <Zealot> protossList = new ArrayList<>();
		
		protossList.add(zealot);
		protossList.add(zealot2);
		protossList.add(zealot3);
		protossList.add(zealot4);
		protossList.add(zealot5);
		protossList.add(zealot6);
		
		for(int i = 0; i < protossList.size(); i++) {
			protossList.get(i).move(50, 70);
		}
		
		
		// 하이템플러 생성
		HighTemplar hightem = new HighTemplar();
		System.out.println(hightem);
		
		// 하이템플러 스톰
		// 하이템플러 상태 확인
		hightem.tthunderStrom();
		System.out.println(hightem);
		
		// 하이템플러도 같이 드래그해서 이동시키고 싶으나
		// ArrayList<Zealot> 에 담기지 않는다. 
		// 클래스가 다르기 때문에
//		protossList.add(hightem);
		
		// 이럴때 사용하는게 다형성이다.
		// 다형성( Polymorphism )
		// 하나의 객체가 여러 타입을 가질 수 있는 것
		
		// 자식 객체에서 부모 객체로 형변환이 가능하다.
		StarUnit hightem2 = new HighTemplar();
		// 자식에서 부모로 형변환은 자동 형변환이 된다.
		StarUnit hightem1 = hightem;
		
		Object obj = hightem2;
		Object temp = new Zealot();
		
		ArrayList<StarUnit> starList = new ArrayList<>();
		
		// starList는 StarUnit의 자식 객체들을 다 담을 수 있다.
		// 담기면서 자동형변환 되어 담김
		starList.add(zealot);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(hightem);
		starList.add(hightem2);
		starList.add(marine);
		
		for(int i = 0; i < starList.size(); i++) {
			starList.get(i).move(30, 50);
		}
		
		marine.attack(zealot6);
		System.out.println(zealot6);
		
		marine.attack(hightem);
		System.out.println(hightem);
		
		zealot.attack(marine2);
		System.out.println(marine2);
		
		System.out.println("\n==========================================================\n");
		
		// HighTemplar(자식)이 StarUnit(부모)로
		// 형변환이 되어 있기 때문에
		// 부모가 가지고 있지 않은 메소드는 사용불가.
		// tthunderStrom 메소드는 << - HighTemplar클래스에 있다.
//		starList.get(4).tthunderStorm();
		
		// 자식 -> 부모 상태인 객체를
		// 부모 -> 자식 형변환한 후 자식의 메소드 사용
		// 부모 -> 자식은 자동 형변환 불가
		HighTemplar welcome = (HighTemplar)starList.get(4);
		welcome.tthunderStrom();
		
		((HighTemplar)starList.get(4)).tthunderStrom();
		
		System.out.println("\n==========================================================\n");
		
		// 하이템플러 -> 스타유닛 -> 하이템플러 (가능)
		// 하이템플러 -> 스타유닛 -> 질럿, 마린 (불가)
//		((HighTemplar)starList.get(0)).move(5, 5);
		
		// for문을 돌려서 이 객체가 원래는 하이템플러였다면
		// 썬더스톰을 쓰도록 하기
		for(int i = 0; i < starList.size(); i++) {
			if(starList.get(i).getName().equals("하이템플러")) {
				((HighTemplar)starList.get(i)).tthunderStrom();
			}
			
			// 객체 instanceof 클래스
			// 좌측의 객체가 우측의 클래스로 형변환이 
			// 가능하다면 true, 불가능하면 fales 리턴
			if(starList.get(i) instanceof HighTemplar) {
				((HighTemplar)starList.get(i)).tthunderStrom();
			}
		}
		
		// 마린이면 stimpack() 쓰기
		for(int i = 0; i < starList.size(); i++) {
			if(starList.get(i) instanceof Marine) {
				((Marine)starList.get(i)).stimpack();
			}
		}
		
		// 부모 클래스의 객체 ( 마린, 질럿, 하이템플러 ) 기준
		StarUnit scv = new StarUnit("SCV", 5, 60, 0);
		
		// 일반적으로 부모 객체는 자식 객체로 형변환 할 수 없다.
		System.out.println(scv instanceof Zealot);
		
		// 자식 객체는 부모 객체로 형변환이 가능하다.
		System.out.println(zealot instanceof StarUnit);
		
		// 부모 객체로 형변환 되었던 자식 객체는
		// 다시 자식 타입으로 형변환이 가능하다.
		System.out.println(starList.get(0) instanceof Zealot);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
