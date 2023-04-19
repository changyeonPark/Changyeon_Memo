package changyeon.submitProject;

import java.util.ArrayList;

public class StoreDB {
	
	
	String StoreName = "D-Day";
	int myMoney = 5000000;
	private ArrayList <Store> tList = new ArrayList<>();
	private ArrayList <Store> storeList = new ArrayList<>();
	
	private StoreDB () {
		tList.add(new Store(1, "애슬레틱져지 반팔", 22_000));
		tList.add(new Store(2, "절개스티치 반팔", 20_000));
		tList.add(new Store(3, "(세일) 프론트 반팔", 5_000));
		tList.add(new Store(4, "(세일) 네이밍 반팔", 5_000));
		tList.add(new Store(5, "(세일) 오리건 반팔", 5_000));
		tList.add(new Store(6, "(주문폭주) 어센틱 다잉", 19_000));
		tList.add(new Store(7, "위드버튼 반팔", 5_000));
		tList.add(new Store(8, "면분또 옆트임", 10_000));
		tList.add(new Store(9, "치즈 반팔티 20수", 9_000));
		tList.add(new Store(10, "무지카라 반팔티", 13_000));
		tList.add(new Store(11, "아크로 반팔티", 10_000));
	}
	
	static StoreDB instance = new StoreDB();
	
	public static StoreDB getInstance() {
		return instance;
	}
	
	public int makeTNum() {
		return storeList.size() + 1;
	}
	
	public void showStoreList() {
		for(int i = 0; i < storeList.size(); i++) {
			System.out.println(storeList.get(i));
		}
	}
	
	public void showTList() {
		for(int i = 0; i < tList.size(); i++) {
			System.out.println(tList.get(i));
		}
	}
	
	public void selectNum(int wantBuy) {
		System.out.println(tList.get(wantBuy-1).gettName() + "을 선택하셨습니다.");
		System.out.println("가격은 " + tList.get(wantBuy-1).gettPrice() + "입니다.");
	}
	
	public void howManyBuy(int wantBuy ,int howManyBuy) {
		for(int i = 0; i < howManyBuy; i++) {
			storeList.add(new Store(tList.get(wantBuy-1).gettName(), tList.get(wantBuy-1).gettPrice()));
			myMoney = myMoney - (tList.get(wantBuy-1).gettPrice());
		}
		System.out.println(myMoney);
	}
	
	// TODO 1부터 storList.size()까지 랜덤 숫자
	public void endDay() {
		int random = (int)(Math.random() * 20 ) + 1;
		for(int i = 0; i < random; i++) {
			int rand1 = (int)(Math.random() * 20 ) + 1;
			if(storeList.get(i).gettNum()==rand1) {
				myMoney += storeList.get(rand1).gettPrice();
				System.out.println("손님(" + (i+1) +")이 " + storeList.get(rand1).gettName() + " 을(를)" + 
									(int)(storeList.get(rand1).gettPrice() + (storeList.get(rand1).gettPrice() * 4 / 10))  + "원에" + "구매하셨습니다.");
			}
		}
		System.out.println("현재 잔액은: " + myMoney);
	}
	
}
