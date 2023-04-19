package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class CollectionList {

	public static void main(String[] args) {
		// 리스트의 선언 (ArrayList)
		// 1. 
		ArrayList<String> students = new ArrayList<String>();
		// <> 안에 타입을 적어준다 예시) String, integer
		
		// <String> 이 부분을 제너릭(Generic)이라고 부른다.
		
		// 2. 오른쪽에 제너릭은 생략 가능
		ArrayList<String> strList = new ArrayList<>();
		
		// Collection 들은 객체만 담을 수 있다.
		// 참조타입들이 객체이다.
		// int는 기본타입이므로 담을 수 없다.
		ArrayList<Integer> intList = new ArrayList<>();
		
		// Wrapper Class 예시) Byte, Integer, Long, .....
		// 기본 타입의 데이터를 객체(참조타입)로
		// 사용해야 하는 경우 사용한다.
		
		int num = 12;
		
		// 기본타입의 데이터를 Wrapper 클래스 객체로 변환
		// 기본타입을 Wrapper로 변환하는 것 = 박싱(boxing)
		Integer numClass = new Integer(num);
		System.out.println(numClass);
		
		// 오토 박싱 (auto boxing)
		Integer autoNum = num;
		System.out.println(autoNum);
		
		// 언 박싱 (unboxing)
		// Wrapper 클래스 객체에 저장 된 값을 
		// 기본 타입의 데이터로 꺼내기
		int temp = autoNum.intValue();
		System.out.println(temp);
		
		// 오토 언박싱 (autoUnboxing)
		int autoTemp = autoNum;
		
		// 한줄 요약
		// 오토 박싱과 언박싱이 알아서 잘 되므로
		// 우리가 Wrapper 클래스를 사용하는데 불편함은 없다.
		
		System.out.println("\n======================================================\n");
		
		// .size()             Wrapper 클래스의 담고 있는 수 리턴
		System.out.println(intList.size());
		
		// .add()                    리스트에 값 담기
		// ArrayList에 값 담기
		intList.add(5);
		System.out.println(intList.size());
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		// syso에 컬렉션 객체를 넣으면, 자동으로 내부 값이 출력된다.
		System.out.println(intList);
		
		students.add("이자영");
		students.add("백민기");
		students.add("최성복");
		students.add("박창연");
		students.add("박혜라");
		
		System.out.println(students);
		
		// 제너릭 타입 안에 다른 타입은 들어올 수 없다.
		// 제너릭<> 타입과 일치하는 데이터만 추가 가능
//		students.add(13); String 타입에 int 을 넣어서 들어갈 수 없다.
		
		System.out.println("\n=================================================\n");
		
		// 데이터를 넣었으니 데이터를 꺼낼 수 있다.
		// .get(인덱스)
		// 해당 인덱스의 값을 리턴
		System.out.println(students.get(3));
		
		// .set(인덱스, 값)          =         .replace(str1, str2)
		// 해당 인덱스의 값을 괄호 안 값으로 교체 한다.
		students.set(2, "장유정");     // 인덱스 2번인 최성복에서 장유정으로 교체
		System.out.println(students);
		
		// .contains(값)             = 해당 데이터를 찾는다.
		// 리스트 안에 해당 값이 존재하면 true 리턴
		// 존재하지 않으면 false 리턴
		System.out.println(students.contains("최성복"));
		System.out.println(students.contains("장유정"));
		
		// .indexOf(값)
		// 리스트 안에 해당 값이 인덱스 몇 번에 존재하는지 리턴
		// 존재하면 해당 인덱스 리턴.
		// 존재하지 않는다면 -1 리턴.
		// -1 리턴 여부로 contains처럼 사용 가능
		System.out.println(students.indexOf("최성복"));
		System.out.println(students.indexOf("박창연"));
		System.out.println(students.indexOf("준호") != -1); // != 같지 않다. == 같다.
		
		// .isEmpty()
		// 리스트가 비어 있는지 체크한다.
		// 비어있다면 true, 한개라도 들어 있다면 fales
		// .size() == 0 닮고있는 데이터가 0 이냐와 같다.
		System.out.println(students.isEmpty()); // 값이 들어 있기때문에 fales
		System.out.println(students.size() == 0 );
		
		// .remove(인덱스)
		// 해당 인덱스의 값을 삭제한다.
		students.remove(3);               // 인덱스의 3번에 있던 "박창연"을 삭제한다.
		System.out.println(students);     // [이자영, 백민기, 장유정, 박혜라]
		
		// .remove(값)
		// 리스트의 해당 값이 있으면 삭제
		students.remove("박혜라");        // "박혜라"라는 값이 있기 때문에 삭제
		System.out.println(students);     // [이자영, 백민기, 장유정]
		students.remove("장유정");        // "장유정"라는 값 삭제
		System.out.println(students);     // [이자영, 백민기]
		
		// 해당 값이 없는 경우 아무 일도 일어 나지 않는다.
		students.remove("아무말");        
		
		// .clear()
		// 리스트를 비운다. (size가 0이 된다.)
		students.clear();                 // students의 값을 비운다.
		System.out.println(students);     // 사이즈가 0 이 된다. []
		
		// 초기화를 해도 리스트를 비울 수 잆다.
		intList = new ArrayList<>();
		System.out.println(intList);
		
		students.add("이자영");
		students.add("백민기");
		students.add("최성복");
		students.add("박창연");
		students.add("박혜라");
		
		System.out.println(students);
		
		// for문으로 리스트 내 데이터 처리
		// 모든 요소에 넘버링 추가 
		// 1. 이자영
		// 2. 백민기
		// 3. 최성복
		for(int i = 0; i < students.size(); i++) {
			students.set(i, (i+1) + ". " + students.get(i));
		}
		System.out.println(students);
		
		// 리스트 복사
		ArrayList<String> copyList = new ArrayList<>();
		// students의 모든 값들이 copyList에 담긴다.
		copyList.addAll(students);
		System.out.println(copyList);
		
		// 리스트 복사 2
		ArrayList<String> copyList2 = new ArrayList<>(students);
		System.out.println(copyList2);
		
		// 리스트 복사 3
		ArrayList<String> copyList3 = new ArrayList<>();
		for(int i = 0; i < students.size(); i++) {
			
			copyList3.add(students.get(i));
		}
		System.out.println(copyList3);
		
		System.out.println("\n==============================================\n");
		
		// 향상된 for문
		// (= 일반적으로 말하는 foreach문)
		for(  String stu    :   students   ) {
			System.out.println(stu);
		}
		
		// 인덱스가 존재하는 ArrayList에서는 
		// 향상된 for문의 사용이 큰 메리트가 있지는 않다.
		
		System.out.println("\n==================================================\n");
		
		// 자바의 forEach문 (우엑)
		students.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// 람다식으로 사용하기 
		students.forEach(t -> System.out.println(t));
		
		// 람다식인데 명령어가 여러줄이면 
		// 중괄호 블록을 만들어 주어야 한다.
		
		students.forEach(t -> {
			System.out.println(t);
			System.out.println(t);
		});
		
		System.out.println("\n============================================\n");
		
		// 값을 주면서 리스트 선언
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30, 23, 1, 44, 52));
		System.out.println(numbers);
		
		// 정렬 
		// 오름차순 Collection.sort
		Collections.sort(numbers);
		System.out.println(numbers);
		
		// 내림차순
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
		// 버블정렬
		for (int k = 0; k < numbers.size() - 1; k++) {
			for (int i = 0; i < numbers.size() -1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if (numbers.get(i) > numbers.get(i+1)) {
					int t = numbers.get(i);
					numbers.set(i, numbers.get(i+1));
					numbers.set(i+1, t);
				}
			}
		}
		System.out.println(numbers);
		
		
		

	}

}
