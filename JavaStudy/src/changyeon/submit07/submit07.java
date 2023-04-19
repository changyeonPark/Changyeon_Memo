package changyeon.submit07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class submit07 {

	public static void main(String[] args) {

		// Q.01
		
		System.out.println("Q. 01");
		ArrayList<Integer> randomList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 10) + 10;
			randomList.add(num);
		}

		System.out.println("10~20 랜덤숫자: " + randomList);
		
		ArrayList<Integer> randomList2 = new ArrayList<>();
		int idx = 0;
		outer: while (true) {
			int rand = (int) (Math.random() * 11) + 10;

			// rand가 result 배열 안에 없는 숫자라면 담기
			// 10이상만 담는다.
			// 있으면 담지 않기.
			// 10이상만 담는다.
			for (int i = 0; i < randomList2.size(); i++) {
				if (randomList2.get(i) == rand) {
					continue outer;
				}
			}
			randomList2.add(rand);
			idx++;
				if (idx == 10) {
				break outer;
			}
			
		}
		System.out.println("10~20 중복제거: " + randomList2);
		
		Collections.sort(randomList2);
		
		System.out.println("10~20 오름차순: " + randomList2);
		
		Collections.reverse(randomList2);
		
		System.out.println("10~20 내림차순: " + randomList2);
		
		// Q. 02
		
		System.out.println("Q. 02");
		
		ArrayList<String> wifeBuyList = new ArrayList<>(Arrays.asList("냉장고","로봇청소기","세탁기","에어컨"));
		
		ArrayList<String> husBuyList = new ArrayList<>(Arrays.asList("노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"));
		
		ArrayList<String> buyList = new ArrayList<>();
		
		for(int i = 0; i < wifeBuyList.size(); i++) {
			for(int k = 0; k < husBuyList.size(); k++) {
				if(wifeBuyList.get(i) == husBuyList.get(k)) {
					buyList.add(wifeBuyList.get(i));
				}
			}
		}
		System.out.println("서로 사고 싶은 목록: " + buyList);
		
		ArrayList<String> withBuyList = new ArrayList<>();
		
		for(int i = 0; i < wifeBuyList.size(); i++) {
			withBuyList.add(wifeBuyList.get(i));
		}
		for(int k = 0; k < husBuyList.size(); k++) {
			if(wifeBuyList.contains(husBuyList.get(k))) {
				continue;
			}else {
				withBuyList.add(husBuyList.get(k));
			}
		}
		System.out.println("사고 싶은 목록 " + withBuyList);
	}

}