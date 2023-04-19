package changyeon.submit03;

public class submint003 {

	public static void main(String[] args) {
		// Q.01 팩토리얼
		
		// 팩토리얼
		// 10 x 9 x 8 x ....
		int rst = 1;
		for(int i = 1; i <= 10; i++) {
			rst *= i;
		}
		System.out.println(rst);
		long lrst = 1;
		for(int i = 1; i <= 15; i++) {
			lrst *= i;
		}
		System.out.println(lrst);
		
		System.out.println("\n===================================\n");
		
		
		// Q. 02
		// 월리를 찾아라!!
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
//		System.out.println(findWally.length());
//		System.out.println(findWally.substring(58, 60)); 
		
		
		int count = 0;
		for(int i= 0; i < findWally.length()-1; i++) {
			String str = findWally.substring(i, i+2);
			
			if(str.equals("월리")) {
				count++;
			}
		}
		
		System.out.println("월리의 갯수: " + count);
		
		System.out.println("\n=============================================\n");
		
		// Q.03 거꾸로 트리
		
		String stars = "*****";
		
		// i 가 	0, 1, 2, 3, 4 일때
		// stars 는 5, 4, 3, 2, 1 
		// stars.substring(????) 의 결과가 5, 4, 3, 2, 1
		
		for(int i = 0; i < 5; i++) {
			System.out.println(stars.substring(i)); // 0가 0일때 stars의 인덱스 값부터 잘라서 출력.
			
			
		}
		
		
	}

}
