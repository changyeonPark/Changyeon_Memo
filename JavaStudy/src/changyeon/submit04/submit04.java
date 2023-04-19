package changyeon.submit04;

import java.util.Scanner;

public class submit04 {

	public static void main(String[] args) {
		// Q. 01
		// 로꾸꺼 로꾸꺼

		System.out.println("Q. 01");

		Scanner scan = new Scanner(System.in);
		System.out.print("거꾸로 뒤집을 문자열 입력: ");
		String rst = scan.nextLine();
		String empty = "";

		for (int i = rst.length() - 1; i >= 0; i--) {

			String rst1 = rst.substring(i, i + 1);

			empty = empty + rst1;

		}

		System.out.println("뒤집은 결과: " + empty);

		System.out.println("\n========================================\n");

		// Q. 02
		System.out.println("Q. 02");

		int eleA = 10;
		int eleB = 4;
		outer: while (true) {
			System.out.println("\n==================== 희영빌딩 엘레베이터 ====================\n");
			System.out.println("승강기 A의 현재 위치: " + eleA + "층");
			System.out.println("승강기 B의 현재 위치: " + eleB + "층");
			System.out.printf("몇층에 계시나요? [종료하시려면 q 또는 exit 입력]: ");

			Scanner floor = new Scanner(System.in);

			String call = floor.nextLine();
			
			if (call.equals("q")) {
				System.out.println("프로그램이 종료되었습니다.");
				break outer;

			} else if (call.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break outer;

			}
			int num = Integer.parseInt(call);
			System.out.println(call + "층에서 엘레베이터를 호출합니다.");

			if (Math.abs(eleA - num) > Math.abs(eleB - num)) {
				System.out.println("승강기 B가 " + call + "층으로 이동하였습니다.");
				eleB = num;
			} else if (Math.abs(eleB - num) > Math.abs(eleA - num)) {
				System.out.println("승강기 A가 " + call + "층으로 이동하였습니다.");
				eleA = num;
			} else if (Math.abs(eleB - num) == Math.abs(eleA - num)) {
				System.out.println("승강기 A가 " + call + "층으로 이동하였습니다.");
				eleA = num;
			}
		}

	}

}
