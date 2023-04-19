package changyeon.submit02;

import java.util.Scanner;

public class submit002 {

	public static void main(String[] args) {

		// Q.01
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>>> ");
		String name = scan.nextLine();
		
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>>> ");
		String kor = scan.nextLine();
		int kScore = Integer.parseInt(kor);
		
		
		// Q. 02
		
		String idBack = "12341474";
		
		String first = idBack.substring(0,1);
		
		int num = Integer.parseInt(first);
		
		String gender = (num % 2 == 1) ? ("남") : ("여");
		
		
		
		
		
		
		
		
		
		
	}

}
