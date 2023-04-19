package changyeon.submitProject;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreMain {

	public static void main(String[] args) {
		
		StoreDB stoDB = StoreDB.getInstance();
		// 1. 구매
		// 수량을 입력받으면
		// 1) 상품의 이름을 총 x장 구매하셨습니다. 
		// 2) 현재 남은 잔액은 총 자본금 - 상품의 가격 * 상품의 수량
		// 2. 판매
		// 3. 종료
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("행동을 입력해주세요.");
			System.out.println("1. 구매 | 2. 판매 | 4. 재고 목록 | 5. 종료");
			System.out.print(">>> ");
			int commend = Integer.parseInt(scan.nextLine());
			
			if(commend == 1) {
				stoDB.showTList();
				System.out.println("구매 원하는 상품의 번호를 입력해주세요.");
				System.out.print(">>> ");
				int tNum = Integer.parseInt(scan.nextLine());
				int wantBuy = tNum;
				stoDB.selectNum(wantBuy);
				System.out.println("몇장을 구매 하시겠습니까?");
				System.out.print(">>> ");
				int howManyT = Integer.parseInt(scan.nextLine());
				int howManyBuy = howManyT;
				stoDB.howManyBuy(wantBuy, howManyT);
			} if(commend == 4) {
				stoDB.showStoreList();
			} if(commend == 2) {
				System.out.println("영업이 시작되었습니다.");
				System.out.println("손님이 상품을 구매중입니다.");
				stoDB.endDay();
			}
			
		}
		
		
	}

}
