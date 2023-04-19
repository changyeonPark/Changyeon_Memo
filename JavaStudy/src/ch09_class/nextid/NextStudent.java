package ch09_class.nextid;

public class NextStudent {
	
	// 클래스 만드는 순서
	// 1. 필드변수 선언
	// String 변수;
	// int 변수;
	
	// 2. 생성자 만들기 
	// 기본생성자 + 
	// 예시) public NextStudent(){}
	// 예시) public Scanner(){}
	// 생성자 만들기 [ Alt + Shift + S ] using
	
	// 3. 메소드 만들기 [ Alt + Shift + S ] to_string
	
	// 학생들의 상태 (state)를 필드 변수로 선언
	// 필드 변수의 값을 꼭 초기화( Init )하지 않아도 된다.
	String name;
	int age;
	int level = 1;
	int exp = 0;
	// 2. 생성자
		/** 기본생성자
		// 클래스 내에 생성자를 별도로 만들지 않으면
		// 생략된 상태로 존재한다.
		// 만약 생성자를 따로 만들어주었다면
		// 생략된 상태로 존재했던 기본 생성자가 제거된다.
		// 기본 생성자 사용을 위해 따로 만들어준다.
		// 생성자는 객체가 생성될 때 (= new 클래스())
		// 실행되는 메소드라 봐도 무방하다.*/
	public NextStudent() {
		System.out.println("기본 생성자로 객체 생성");
	}  // <<- 생성자 만들기 전에는 생략되어 있다.
			// 생성자 만들기
			// 단축키 [Alt + Shift + S]
			// 또는 마우스 우클릭 - Source
			// 이후 Generate Constructon using fields 클릭 
	public NextStudent(String name, int age, int level, int exp) {
		// this는 현재 객체를 의미한다.
		this.name = name;
		this.age = age;
		this.level = level;
		this.exp = exp;
	}
	/** 이름과 나이만 받고
		레벨과 경험치는 고정값으로 하는 메소드
		level과 exp 값을 받지 않는다면 lovel과 exp 기본값 출력*/
	public NextStudent(String name, int age) {
		this(name, age, 1, 0);
//		this.level = 1;
//		this.exp = 0;
		// 기본값 설정
	}
	// 3. 메소드
		// toString() 메소드
		// 단축키 [ Alt + Shift + S ]
		// Generate toString()
	@Override
	public String toString() {
		return "넥스트 3월반 [이름: " + name + ", 나이: " + age + ", 레벨: " + level + ", 겅험치: " + exp + "]";
	}
	// 하루가 지나는 이벤트에 대한 메소드
	public void endDay() {
		
		// 20 ~ 60 사이의 랜덤 숫자
		int rand = (int)(Math.random() * 41 ) + 20;
		exp += rand;
		System.out.println(name + "의 현재 경험치: " + exp);
		
		if(exp >= 100) {
			System.out.println(name + "레벨업!!");
			level++;
			System.out.println(name + "의 현재 레벨: " + level);
			exp -= 100;
		}
	}



	
	
	
	
	
	
	
	
	
	
}
