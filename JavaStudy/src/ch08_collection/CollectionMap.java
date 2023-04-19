package ch08_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		
		// 맵 ( HashMap) 의 선언
		// Key와 Value의 한쌍인 데이터를 저장
		// 제너릭에 Key 타입과, Value타입을 적어줘야 한다.
		HashMap<String, String> stuMap = new HashMap<>();
		
		// !!!!!!!!!!!!!!!!!!!!!!!다형성을 이용한 선언 방법!!!!!!!!!!!!!!!!!!!!!!!
		Map<String, Integer> coinMap = new HashMap<>();  
		
		
		// 데이터 추가
		// ============================= .put( Key , Value ) =============================
		stuMap.put("첫째", "예슬");
		stuMap.put("둘째", "종현");
		stuMap.put("셋째", "서영");
		
		// 순서는 보장하지 않는다.              set과 같은 의미
		System.out.println(stuMap); 
		
		// 중복된 Key값을 허용하지 않는다.
		// 중복된 Key값을 추가하게 되면 기존 Value를 덮어쓴다.
		// (Key에 대한 Value를 수정하는 경우 Put을 이용)
		stuMap.put("첫째", "경호");
		System.out.println(stuMap);
		
		coinMap.put("비트코인", 36000000);
		coinMap.put("도지코인", 123);
		System.out.println(coinMap);
		
		System.out.println("\n=========================================\n");
		
		// ============================= .get(key) =============================
		// key에 대한 Value를 리턴
		System.out.println(stuMap.get("첫째")); // 첫째의 Value 값인 경호 출
		// 존재하지 않는 key값을 입력하면 
		System.out.println(stuMap.get("넷째")); // key이 없어서 null
		
		// ============================= .size =============================
		// Map 내에 저장된 데이터의 수 리턴
		
		System.out.println(stuMap.size());
		
		// ============================= .containsKey(값) =============================
		// Map 안에 있는 키(Key) 중에 괄호 안 값이 
		// 있다면 true, 없으면 fales
		System.out.println(stuMap.containsKey("첫째"));
		
		// ============================= .containsValue(값) =============================
		// Map 안에 있는 값(Value) 중에 괄호 안 값이
		// 있다면 true, 없으면 fales   &&
		System.out.println(stuMap.containsValue("종현"));
		
		// 데이터 삭제 
		// ============================= .remove(Key) =============================
		// 괄호 안 key값에 대한 데이터를 삭제한다.
		coinMap.remove("도지코인"); // 도지코인이라는 키값을 coinMap에서 삭제한다.
		System.out.println(coinMap);
		
		System.out.println("\n==========================================================\n");
		
		// ============================= Map 순회 =============================
		// 1. keySet 이용        
		// Map에 있는 key값들을 set에 담는다.
		// key값을 이용해 Value 값을 불러올수 있다.
		
		Set<String> keySet = stuMap.keySet();
		
		// 향상된 for문으로 Set을 순회
		// (    :    ) 
		for(String key : keySet) {
			System.out.println(key);
			System.out.println(stuMap.get(key));  // stuMap.get(key) 키값에대한 value
		}
		
		// 2. EntrySet 이용
		Set< Entry<String, String> > entrySet = stuMap.entrySet();
		
		// 향상된 for문 사용
		for(Entry<String,String> entry   : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		// 3. forEach ( 람다식 )
		stuMap.forEach( (key, value) -> System.out.println(key + ":" + value) );
		
		
		
		
		
	}

}
