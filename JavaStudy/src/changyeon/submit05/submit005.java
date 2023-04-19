package changyeon.submit05;

public class submit005 {

	public static void main(String[] args) {
		// Q.01 n층 트리 메소드
		makeTree(5);
		makeTree(7);
		
		// Q. 02
		// 로꾸꺼 거꾸로 메소드 만들
		System.out.println("Q. 02");
		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
		
		// Q. 03 십진수를 이진수로 변환
		// (자바에서 이진수, 16진수 등등은 문자열)
		// 10진수 17 >>> "10001"
		String binaryString = Integer.toBinaryString(17);
		
		System.out.println("\n==============================\n");
		
		binaryString = makeBinary(23);
		System.out.println(binaryString);
		
		
		
		
	} //main 끝
	
	public static String makeBinary(int num) {
		// num에 17이 들어왔다.
		// 17을 2로 나눠서 나머지는 1 / 몫은 8
		//  8을 2로 나눠서 나머지는 0 / 몫은 4
		//  4를 2로 나눠서 나머지는 0 / 몫은 2
		//  2를 2로 나눠서 나머지는 0 / 몫은 1
		//  1을 2로 나눠서 나머지는 1 / 몫은 0  <<< (stop)
		// 17 % 2 = 1 , 17 / 2 = 8
		//  8 % 2 = 4 ,  8 % 2 = 4 ....
		
		// 반복 횟수와 기준이 애매하면 while(true) 문 사용
		// 반복 되었을 때 들어갈 문자열 하나 만들어 준다 result
		String result = "";
		while(num > 0) {
			result += num % 2;
			num = num / 2;
			
			
		}
		
		return reverseStr(result);
	}
	
	
	public static String reverseStr(String example) {
		String result = "";
		
		for(int i = example.length(); i >= 1; i--) {
			String str = example.substring(i-1, i);
			result += str;
			
		}
		return result;
	}
	
	public static void makeTree(int num) {

		for (int i = 0; i < num; i++) {
			String space = "";
			for (int k = 0; k < (num - 1) - i; k++) {
				space += " ";
			}
			String star = "";
			for (int k = 0; k < (i * 2) + 1; k++) {
				star += "*";
			}
			System.out.println(space + star);

		}
	}
	
	
	
	
}
