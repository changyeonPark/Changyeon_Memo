package changyeon.submit06;

public class submit06 {

	public static void main(String[] args) {
		System.out.println(" Q.01 ");

		String[] nameList = { "이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민",
				"최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬" };

		int count = 0;
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].contains("이")) {
				count++;
			}
		}
		System.out.println("이씨 성을 가진 배우가 총 " + count + "명 있습니다.");

		System.out.println("\n=====================================\n");

		System.out.println("Q. 02");

		// 최댓값, 최솟값 구하기
		// for문을 이용해 inArr의 최댓값과 최솟값을 출력해주세요.
//		Hint
//		for문 바깥에 int 변수 하나 선언해둔 뒤, 
//		for문을 돌리면서 각각의 요소가 int 변수보다 큰지 비교
//		크다면 int 변수에 해당 요소의 값 저장

		int[] intArry = { 23, 456, 213, 32, 464, 1, 2, 4 };
		int max = 0; // 최댓값
		int min = 0; // 최솟값

		for (int i = 0; i < intArry.length - 1; i++) {
			int numA = 0;
			if (intArry[i] > intArry[i + 1]) {
				numA = intArry[i]; // 0 = 23
				intArry[i] = intArry[i + 1]; // 23 = 456
				intArry[i + 1] = numA; // 456 = 23
			}
			max = numA;
		}

		for (int i = 0; i < intArry.length - 1; i++) {
			int numA = 0;
			if (intArry[i] < intArry[i + 1]) {
				numA = intArry[i];
				intArry[i] = intArry[i + 1];
				intArry[i + 1] = numA;
			}
			min = numA;
		}

		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);

		System.out.println("\n==========================================\n");
//		int[] myLotto = makeLotto();
//		
//		for(int i = 0 ; i < myLotto.length; i++) {
//		System.out.println(myLotto[i] + " ");
//		}
		
//		// 배열 6 숫자만큼 반복한다.
//		// 랜덤한 숫자를 담는다.
//		int [] empty = new int[6];
//		for (int i = 0; i < empty.length; i++) {
//			empty[i] = (int) (Math.random() * 45) + 1;
//		}
//		System.out.println(empty[0]);
		
		
//	public static int[] makeLotto(int[] myLotto) {
//		int[] empty = new int [6];
//		for (int i = 0; i < myLotto.length; i++) {
//			for (int k = 0; k < empty.length; k++) {
//				empty[k] = (int) (Math.random() * 45) + 1;
//			}
//		}
//			return empty;
//		
	}
}
