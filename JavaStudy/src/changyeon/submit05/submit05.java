package changyeon.submit05;

public class submit05 {

	public static void main(String[] args) {
		
		// Q. 01 
		// 트리 5개 7개 만들기
		
		System.out.println("Q. 01");
		
		makeTree(7);
		
		System.out.println("\n==================================\n");
		
		// Q. 02
		// 로꾸꺼 거꾸로 메소드 만들
		System.out.println("Q. 02");
		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
		
		System.out.println("\n=================================\n");
		
		// Q.03
		// 십진수를 이진수(String)타입으로 리턴 해주는
		// makeBinary(int 타입) 함수를 만드세요.
		
		String makeBinaryStr = makeBinary(23);
		System.out.println(makeBinaryStr);
		
		
	} 
	
	public static String makeBinary(int num) {
		String empty = "";
		for(int i = num; i >= 1; i/=2) {
			empty += i%2;
		}
		
		String result = reverseStr(empty);
		
		return result;
	}
	
	/**
	 * Q. 01
	 * 별 트리 만드는 메소드
	 */
	public static void makeTree(int num) {
		
		for(int i = 0; i < num; i++) {
			String space = "";
			for(int k = 0; k < (num-1)-i; k++) {
				space += " ";
			}
			
			String star = "";
			for(int k = 0; k < (i*2)+1; k++) {
				star += "*";
			}
			
			System.out.println(space + star);
			
		}
		
	} // main
	
	/**
	 * Q. 02
	 * 로꾸꺼 로꾸꺼를 
	 * 거꾸로 거꾸로 출력하는 문자열 메소드
	 */
	public static String reverseStr(String example) {
		
		String result = "";
		
		for(int i = example.length(); i >= 1; i--) {
			String str = example.substring(i-1, i);
			result += str;
			
		}
		return result;
		
	}
	
	
	
}
