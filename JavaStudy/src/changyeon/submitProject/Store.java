package changyeon.submitProject;

public class Store {
	
	private int tNum;
	private String tName;
	private int tPrice;
	
	public Store() {}
	
	public Store(String tName, int tPrice) {
		StoreDB stoDB = StoreDB.getInstance();
		this.tNum = stoDB.makeTNum();
		this.tName = tName;
		this.tPrice = tPrice;
	}
	
	public Store(int tNum, String tName, int tPrice) {
		super();
		this.tNum = tNum;
		this.tName = tName;
		this.tPrice = tPrice;
	}
	
	@Override
	public String toString() {
		return "상품번호: " + tNum + ", 상품이름: " + tName + ", 가격: " + tPrice + "원";
	}
	
	public int gettNum() {
		return tNum;
	}
	
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	
	public String gettName() {
		return tName;
	}
	
	public void settName(String tName) {
		this.tName = tName;
	}
	
	public int gettPrice() {
		return tPrice;
	}
	
	public void settPrice(int tPrice) {
		this.tPrice = tPrice;
	}
	
}
