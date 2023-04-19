package ch07_array;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		// 배열(Array)

		String samjang = "삼장";
		String woogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";

		// 문자열 배열 String[]
		// 배열의 선언 방법
		// 숫자 4는 첨자를 의미하며, 배열의 크기를 정한다.
		// 배열의 크기는 바뀌지 않는다. (핵트롤)
		// 배열 종류 [] 배열이름 = new + 배열종류 [배열크기]
		String[] seougi = new String[4];

		// 문자열의 .length() 는 괄호가 있는데
		// 배열의 .length 는 괄호 없이 배열의 길이를 리턴(메소드는 아님)
		System.out.println(seougi.length);
//		System.out.println(saojeong.length());

		// 배열 내 요소(element) 확인하기
		// 인덱스를 사용한다. (문자열 번호) 인덱싱이라고 한다.
		System.out.println(seougi[0]);

		// 처음 생성된 배열 내에는 기본값(default)이 들어있다.
		// 기본타입 : 숫자와 true, fales 외 >> 참조타입:null
		// 기본타입 : 숫자면 0, boolean면 false
		int[] numbers = new int[3]; // 0, 0, 0
		System.out.println(numbers[0]);

		boolean[] bools = new boolean[5]; // false, false, false, ...
		System.out.println(bools[0]);

		System.out.println("\n=============================\n");

		// 배열에 값 넣기
		seougi[0] = samjang;
		// 현재 seougi[0]번에 삼장문자열을 담았다.
		// 그럼 현재 seougi문자배열에는 "삼장", null, null, null
		System.out.println(seougi[0]);
		seougi[1] = woogong; // 현재 seougi[0]번에 삼장문자열을 담았다.
		System.out.println(seougi[1]);
		seougi[2] = saojeong;
		seougi[3] = palgye;

		System.out.println(seougi);

		// for문을 이용해서 0부터 array.lenth 미만까지
		// 인덱스를 순회하면 배열의 모든 요소에 접근이 가능하다.
		// 서유기의 인덱스 >> 0, 1, 2, 3

		for (int i = 0; i < seougi.length; i++) {
			System.out.println(seougi[i]);
		}

		// 배열 요소를 조회하는 메소드 만들기
		printArray(seougi); // 출력결과 >>>> 삼장, 오공, 사오정, 저팔계

		System.out.println("\n============================\n");

		// 배열의 단점
		// 크기가 고정됨 (핵토파스칼 트롤)
		// 늘어나지도, 줄어들지도 않으며
		// 값을 추가하거나 제거하지도 못한다.

		// 코드 편집기에서 빨간줄 쫙 그이는 에러는
		// 컴파일 에러로, 실행을 안해봐도 이클립스가 캐치를 한다.

		// 실행했을 때 발생하는 에러는 런타임 에
//		seougi[4] = "크리링";

		// 배열의 장점
		// for문을 이용하여 배열에 담긴 모든 요소들을
		// 한번에 처리 할 수 있다. (데이터 처리 같은 경우)
		for (int i = 0; i < seougi.length; i++) {
			seougi[i] = "서유기 " + seougi[i];
		}
		printArray(seougi);

		// 배열 내 특정 요소에 접근하여 처리를 할 수 있다.
		// 서유기 오공 -> 드래곤볼 오공
		for (int i = 0; i < seougi.length; i++) {
			// 오공이 포함되어 있으면 true
			if (seougi[i].contains("오공")) {
				seougi[i] = seougi[i].replace("서유기", "드래곤볼");
			}
		}
		printArray(seougi);

		System.out.println("\n===================================================\n");

		int[] intArray = new int[6];

		// 기존 값 넣는 방식
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;

		printArray(intArray);

		for (int i = 0; i < intArray.length; i++) {
			// 로또 번호
			// 1 ~ 45 사이의 랜덤 숫자
			// Math.random() -> 0 ~ 1 사이의 랜덤 소수
			// 0, 0.1, 0.9
			// Math.random() * 5 -> 0 ~ 5 미만의 랜덤 소수
			// 0, 0.5, 4.5
			// 정수로 바꿔준다 -> (int)(Math.random() * 5) -> 0 ~ 4 사이의 랜덤 정수
			// (int)(Math.random() * 45) -> 0 ~ 44 사이의 랜덤 정수
			// (int)(Math.random() * 45) + 1 -> "1 ~ 45사이의 랜덤 정수"
			intArray[i] = (int) (Math.random() * 45) + 1;

		}

		printArray(intArray);

		System.out.println("\n=============================================\n");

		// 값을 넣으면서 배열 선언 ->
		String[] students = { "홍민경", "유동윤", "박진영", "김대일" };

		printArray(students);

		System.out.println("\n=======================================================\n");

		// 문자열 나누기
		String subjects = "자바, SQL,자바스크립트 , JSP";

		// .split(문자열)
		// 괄호안 문자열을 기준 왼쪽으로부터 해당 문자열을 나누어
		// 문자열 배열로 리턴한다.
		String[] subjectArray = subjects.split(",");

		System.out.println(subjectArray.length);
		System.out.println(subjectArray[1]);

		// 데이터가 잘 정돈되어 있지 않다면
		// , 로 일단 나누고 양쪽 공백을 제거해주면 된다. trim -> 공백제거
		for (int i = 0; i < subjectArray.length; i++) {
			subjectArray[i] = subjectArray[i].trim();
		}
		printArray(subjectArray);

		System.out.println("\n===================================================\n");

		// 배열의 복사
		String[] sinSeougi = seougi;
		printArray(sinSeougi);

		sinSeougi[0] = "강호동";
		sinSeougi[1] = "이수근";

		printArray(sinSeougi);
		printArray(seougi); // 기존 배열에도 영향을 미친다.

		// @ 앞은 객체의 타입
		// @ 뒤에 붙은건 hashCode를 16진수로 나타낸 것
		// hashCode 는 메모리와 관련이 있다.
		System.out.println(seougi);
		System.out.println(sinSeougi);

		System.out.println(seougi.hashCode());
		System.out.println(sinSeougi.hashCode());
		// 숫자를 16진수로 변환(Integer.toHexString());
		System.out.println(Integer.toHexString(seougi.hashCode()));

		// 해쉬코드(hashcode)
		// 객체의 메모리 주소값을 이용해서
		// 해쉬를 적용한 코드

		// 해쉬(hash)
		// 해쉬함수(암호와 알고리즘)를 이용해서
		// 데이터를 암호화하는 기법(대표 SHA-256)

		String password = "1q2w3e4";

		String encryptPw = encrypt(password);
		System.out.println(encryptPw);

		String loginPw = "1q2w3e4";
		encryptPw = encrypt(loginPw);
		System.out.println(encryptPw);

		System.out.println("\n==================================================\n");

		// 올바른 배열 복사 .clone();
		String[] newSeougi = seougi.clone();

		printArray(seougi);
		printArray(newSeougi);

		newSeougi[2] = "은지원"; // newSeougi의 인덱스 2번을 은지원으로 바꿈

		printArray(newSeougi);
		printArray(seougi);

		System.out.println("\n=============================================\n");

		// .clone을 까먹었다.
		// seougi 의 똑같은 값을 담을 배열을 만들고
		// new String[닮은 문자열의.length
		String[] copy = new String[seougi.length];
		// copy의 각 인덱스에, seougi의 각 인덱스 값을 넣어준다.
		for (int i = 0; i < seougi.length; i++) {
			copy[i] = seougi[i];
		}
		printArray(copy);

		System.out.println("\n====================================================\n");

		// 숫자(형) 배열
		int[] numArray = { 23, 456, 213, 32, 464, 1, 2 };

		System.out.println(numArray[0]);
		System.out.println(numArray[1]);

		// 인덱스 2번 값과 인덱스 5번 값의 위치를 바꿔본다.
		int temp = numArray[5];
		numArray[5] = numArray[2];
		numArray[2] = temp;

		printArray(numArray);

		swap(0, 1, numArray);
		printArray(numArray);

		// 가끔 면접에서 묻는 문제
		// Call by Value 와 Call by Reference 구분
		// 기본타입 변수에 대해서는 Call by Value로 동작
		// 참조타입 변수에 대해서는 Call by Reference로 동작
		int a = 10;
		int b = a;

		System.out.println(b);

		a = 20;
		System.out.println(b);

		swap(a, b);

		System.out.println(a);
		System.out.println(b);

		System.out.println("\n====================================================\n");

		// 다차원 배열
		// 1D -> x축
		// 2D -> x축, y축
		// 3D -> x축, y축, z축
		// 4D -> x축, y축, z축, t

		// 1D 배열
		int[] oneDir = { 1, 2, 3 };

		// 2D 배열은 1차원 배열 내에 1차원 배열들이 존재하는 경우
		// 행렬로 나타낸다면
		// 1 2 3
		// 4 5 6
		// 7 8 9
		int[][] twoDir = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// twoDir으로부터 {7, 8, 9} 배열을 꺼내고 싶다면
		// twoDir[]의 인덱스 2번이 {7, 8, 9}
		int[] tempArray = twoDir[2];
		printArray(tempArray);

		// twoDir으로부터 6을 꺼내고 싶다.
		int six = twoDir[1][2];
		System.out.println(six);

		// 3차열 배열은 일차원 배열 내에 2차원 배열들이 존재
		int[][][] threeDir = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
				{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };

		// 0층의 행렬
		// 1 2 3
		// 4 5 6
		// 7 8 9
		// 1층의 행렬
		// 10 11 12
		// 13 14 15
		// 16 17 18
		// 2층의 행렬
		// 19 20 21
		int abc = threeDir[2][0][2];
		System.out.println(abc);

		System.out.println("\n============================================\n");

		// 정렬
		int[] numberArray = { 23, 452, 13, 1, 67, 54 };
		Arrays.sort(numberArray);

		// Arrays.sort(배열)
		// 해당 배열을 오름차순 정렬

		printArray(numberArray);

		// 내림차순 정렬
		// 이 방법은 참조타입 객체를 담은 배열일 경우에만 가능
//		Arrays.sort(numArray, Collections.reverseOrder());

		// 현재 1, 2, 23, 32, 213, 456, 464
		// 내림차순이면

		// numberArray에 모든 요소에 -1을 곱함
		// -1, -13, -23,
		// Arrays.sort(numberArray) 적용
		// numberArray에 모든 요소에 -1을 곱

		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = numberArray[i] * -1;
		}
		Arrays.sort(numberArray);
		printArray(numberArray);

		System.out.println("\n==============================================\n");

		for (int k = 0; k < numberArray.length - 1; k++) {
			for (int i = 0; i < numberArray.length-1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if (numberArray[i] > numberArray[i + 1]) {
					int t = numberArray[i];
					numberArray[i] = numberArray[i + 1];
					numberArray[i + 1] = t;
				}
			}
			printArray(numberArray);
		}

	} // main 끝 지점
	
	

	public static void swap(int p_a, int p_b) {
		int temp = p_a;
		p_a = p_b;
		p_b = temp;
	}

	// 자리 바꾸기 메소드 만들기
	public static void swap(int idxA, int idxB, int[] numArray) {
		int temp = numArray[idxA];
		numArray[idxA] = numArray[idxB];
		numArray[idxB] = temp;
	}

	// 메소드 오버로딩
	// 배열의 종류가 다를 때 (문자열, 정수)
	public static void printArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			// i 마지막 일때에는 뒤에 콤마(,)를
			// 붙이지 않고, 추가로 개행문자도 넣는다.
			if (i == intArray.length - 1) {
				System.out.println(intArray[i]);
				break;
			}
			System.out.print(intArray[i] + ", ");
		}
	}

	public static void printArray(String[] strArry) {
		for (int i = 0; i < strArry.length; i++) {
			// i 마지막 일때에는 뒤에 콤마(,)를
			// 붙이지 않고, 추가로 개행문자도 넣는다.
			if (i == strArry.length - 1) {
				System.out.println(strArry[i]);
				break;
			}
			System.out.print(strArry[i] + ", ");
		}
	}

	public static String encrypt(String text) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(text.getBytes());

		return bytesToHex(md.digest());
	}

	private static String bytesToHex(byte[] bytes) {
		StringBuilder builder = new StringBuilder();
		for (byte b : bytes) {
			builder.append(String.format("%02x", b));
		}
		return builder.toString();
	}
}
