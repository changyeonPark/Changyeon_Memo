package ch10_extends_interface.simple;

public class SimpleMain {

	public static void main(String[] args) {
		
		Parent papa = new Parent("아빠", 50);
		System.out.println(papa);
		
		Child baby = new Child();
		Parent parent = baby;
		
		baby.setName("아기");
		baby.setAge(3);
		baby.sayHello();
		
		System.out.println(baby);
		
		// 다형성
		// (정처기, 면접에 자주 나옴)
		// 오른쪽에 입력한 클래스의 값이 출력된다.
		Parent nami = new Child("나미", 17);
		
		System.out.println(nami);
		System.out.println(nami.getClass());
		nami.sayHello();
		
		
		
		
	}

}
