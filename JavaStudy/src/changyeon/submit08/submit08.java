package changyeon.submit08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class submit08 {

	public static void main(String[] args) {

		System.out.println("Q. 01");

		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);

		System.out.println("Q. 02");

//		사용자가 아이디와 비밀번호를 파라미터로 넣었을때, 
//		infoMap의 Key(아이디)와 Value(비밀번호)와 비교하여
//
//		아이디와 비밀번호가 infoMap 내에 존재하는 데이터와 일치하면 로그인 성공 출력
//		아이디가 존재하지 않으면, 존재하지 않는 아이디입니다. 출력 
//		아이디는 존재하지만 비밀번호가 일치하지 않으면 비밀번호가 틀렸습니다. 출력

//		infoMap의 Key는 사용자의 아이디, Value는 사용자의 비밀번호라고 했을 때 아래와 같이 데이터를 추가해주세요.

		HashMap<String, String> infoMap = new HashMap<>();

		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");

		Scanner scan = new Scanner(System.in);

		System.out.println("아이디를 입력해주세요.");
		System.out.print(">>> ");
		String id = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		System.out.print(">>> ");
		String pass = scan.nextLine();

		if(infoMap.containsKey(id)) {
			if(infoMap.get(id).equals(pass)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	} // main 끝 지점

	public static ArrayList<Integer> makeLotto() {

		HashSet<Integer> numberSet = new HashSet<Integer>();
		ArrayList<Integer> numberList = new ArrayList<Integer>();

		outer: while (true) {
			int rand = (int) (Math.random() * 45 + 1);
			numberSet.add(rand);
			if (numberSet.size() == 6) {
				break outer;
			}
		}
		numberList.addAll(numberSet);
		Collections.sort(numberList);
		return numberList;

	}

}
