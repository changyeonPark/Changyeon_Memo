package changyeon.submit12;

public class AudioBoard extends Board {
	
	private String mp3;
	
	public AudioBoard() {}

	public AudioBoard(int num, String title, String date, String content, String mp3) {
		super(num, title, date, content);
		this.mp3 = mp3;
	}

	@Override
	public String toString() {
		return "AudioBoard [mp3=" + mp3 + "]";
	}

	public String getMp3() {
		return mp3;
	}

	public void setMp3(String mp3) {
		this.mp3 = mp3;
	}
	
	
	
}
