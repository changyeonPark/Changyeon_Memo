package changyeon.submit01;

public class Submit01 {

	public static void main(String[] args) {
		// Q.01 
		
		String name = "홍길동";
		int age = 30;
		double height = 181.3;
		String phone = "01073987332";
		String email = "akow283@gmail.com";
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("연락처: " + phone);
		System.out.println("이메일: " + email);
		
		System.out.println("\n============================\n");
		
		// Q.02
		String enigma = "너오구늘리뭐너먹구지리"; 
		
		// 너, 구, 리
		// 너 제거
		String tryOne = enigma.replace("너", "");
		System.out.println(tryOne);
		
		// 구 제거
		String tryTwo = tryOne.replace("구", "");
		System.out.println(tryTwo);
		
		// 리 제거
		String tryThree = tryTwo.replace("리", "");
		System.out.println(tryThree);
		
		// 한줄로 한방에 처리
		enigma = enigma.replace("너", "").replace("구", "").replace("리", "");
		System.out.println(enigma);
		
		System.out.println("\n=============================\n");
		
		// Q.03 각자리수 더하기
		int example = 278;
		
		// 숫자를 문자열로 변환
		String strEx = example + "";  // "278"
		
		// 문자열을 각 자리수마다 자른다.
		// substring 추천
		String str1 = strEx.substring(0, 1);  // "2"
		String str2 = strEx.substring(1, 2);  // "7"
		String str3 = strEx.substring(2, 3);  // "8"
		
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int int3 = Integer.parseInt(str3);
		
		// 한줄로 끝내기 도전 !!
		int result = Integer.parseInt(strEx.substring(0, 1)) 
				+ Integer.parseInt(strEx.substring(1, 2)) 
				+ Integer.parseInt(strEx.substring(2, 3));
		System.out.println(result);
		
		
	}

}
