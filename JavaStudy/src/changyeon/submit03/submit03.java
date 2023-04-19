package changyeon.submit03;

public class submit03 {
	public static void main(String[] args) {
		// Q. 01
		// 10팩토리얼 값을 출력하시오.
		int numO = 1;
		for (int i =10; i >= 1; i-- ) { 
			
			numO *= i;
		}
		
		System.out.println(numO);
		
		System.out.println("\n=====================================\n");
		
		
		
		// @ 15팩토리얼 값을 출력하시오.
		long num15 = 1;
		for(int i = 15; i >= 1; i--) {
			num15 *= i;
		}
		System.out.println(num15);
		
		System.out.println("\n========================================\n");
		
		
		
		
		// Q. 02
//		월리가 몇개 들어있는지 콘솔창에 출력해주세요.
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";

		int count = 0;
		for (int i = 0; i < findWally.length(); i+=2) {
			String str = findWally.substring(i,i+2);
			
			if (str.equals("월리")) {
				count ++;
				
			}
			
			
		}
		
		System.out.println("윌리수의갯수: " + count);
		
		System.out.println("\n=========================================\n");
		
		
		// Q. 03
//		String stars = "*****";
//		for문을 5번 반복하면서 stars를 아래와 같이 나오도록 잘라서 출력해보세요.
//		Hint
//		for문 내에서 .substring() 사용
		
		String stars = "*****";
		for(int i = 0; i < 5; i++) {
			System.out.println(stars);
			stars = stars.substring(0, stars.length()-1);
			
		}
		
		
		
	}
}
