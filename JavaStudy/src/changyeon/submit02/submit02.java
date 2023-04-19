package changyeon.submit02;

import java.util.Scanner;

public class submit02 {

	public static void main(String[] args) {

		// Q. 01
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		System.out.printf(">>> ");
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.printf(">>> ");
		String kScore = scan.nextLine();
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.printf(">>> ");
		String eScore = scan.nextLine();
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.printf(">>> ");
		String mScore = scan.nextLine();
		
		int kint = Integer.parseInt(kScore);
		int eint = Integer.parseInt(eScore);
		int mint = Integer.parseInt(mScore);
		int totalScore = kint + eint + mint;
		double kem = 3.0;
		double averAge = totalScore / kem;
		
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kScore);
		System.out.println("영어: " + eScore);
		System.out.println("수학: " + mScore);
		System.out.printf("평균:%.2f " , averAge );
		System.out.println("");
		
//		String grade = (averAge >=90) ? ("A") : ((averAge < 90)) ? ("B") : 1;
		
		
		// Q.02
		
		String idBack = "1231476";
		String str1 = idBack.substring(0,1);
		int checkNum = Integer.parseInt(str1);
		int nam = checkNum % 2;
		String str2 = (nam == 1) ? ("남") : ("");
		
		System.out.println(str2);
		
		
		
		
		
	}
	
}
