package changyeon.submit09;

import java.util.ArrayList;
import java.util.Collections;

import ch09_class.school.Student;

public class submit09 {

	public static void main(String[] args) {
		
		System.out.println(" Q.01 ");
		
		Product fidge = new Product("냉장고", 2000000);
		Product tv = new Product("TV", 1000000);
		Product conditioner = new Product("에어컨", 800000);
		Product computer = new Product("컴퓨터", 1300000);
		Product fan = new Product("선풍기", 100000);

		ArrayList<Product> prdList = new ArrayList<>();
		prdList.add(fidge);
		prdList.add(tv);
		prdList.add(conditioner);
		prdList.add(computer);
		prdList.add(fan);
		
		System.out.println("\n================ Collections.sort ================\n");
		
		Collections.sort(prdList, (prdA, prdB) -> prdA.getPrice() - prdB.getPrice());
		
		for(int i =0; i < prdList.size(); i++) {
			System.out.println(prdList.get(i));
		}
		
		System.out.println("\n================ indexOf() ================\n");
		
		
		// indexOf()
		// ArrayList<String> = ramen = [ "신라면, "안성탕면", "진라면"]
		// ArrayList<Integer> number = [ 10, 20, 30 ]
		// ranmen.indexOf("안성탄면") = 1
		
		// 현재상황
		// ArrayList<Product> prdList = [ Product 객체(냉장고), Product 객체(TV), ..... ]
		// prdList.indexOf("TV") =
		for(int i = 0; i < prdList.size(); i++) {
			if(prdList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		for (int k = 0; k < prdList.size() - 1; k++) {
			for (int i = 0; i < prdList.size() - 1; i++) {
				if (prdList.get(i).getPrice() > prdList.get(i + 1).getPrice()) {
					Product t = prdList.get(i);
					prdList.set(i, prdList.get(i + 1));
					prdList.set(i + 1, t);
				}
			}
		}
		
		for (int k = 0; k < prdList.size(); k++) {
			System.out.println(prdList.get(k));
		}
		
		for(int i = 0; i < prdList.size(); i++) {
			if(prdList.get(i).getName().equals("TV")) {
				System.out.println(prdList.indexOf(prdList.get(i)));
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
