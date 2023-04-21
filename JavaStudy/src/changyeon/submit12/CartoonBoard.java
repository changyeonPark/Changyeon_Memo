package changyeon.submit12;

public class CartoonBoard extends Board {
	
	private String img;
	
	public CartoonBoard() {}

	public CartoonBoard(int num, String title, String date, String content, String img) {
		super(num, title, date, content);
		this.img = img;
	}

	@Override
	public String toString() {
		return super.toString() + "[img=" + img + "]";
	}

	public String getPng() {
		return img;
	}

	public void setPng(String png) {
		this.img = img;
	}
	
	
	
}
