package ch09_class.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.commons.UtillClass;
import ch09_class.nextid.NextStudent;

public class SchoolMain {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학, 평균 점수를 가지는 학생 객체
		Student yesl = new Student("예슬", 85, 80, 87, (85 + 80 + 87) / 3.0);

		// 캡슐화 적용
		// 같은 폴더 내에 있는 클래스라면 private 빼곤 다 접근가능
		System.out.println(yesl);

		// avg에 대한 Setter 메소드를 Student 클래스 내부에서 지워
		// 평균을 수정할 수 없도록 한다.
//		yesl.setAvg(100);
		System.out.println(yesl);

		System.out.println(yesl.getkScore());
		System.out.println(yesl.getAvg());

		// 국어 점수 바꾸기
		yesl.setkScore(93);
		System.out.println(yesl);

		System.out.println("\n===================================================\n");

		Student hyera = new Student("혜라", 90, 80, 87, UtillClass.weRound((90 + 80 + 87) / 3.0, 1));
		System.out.println(hyera);

		hyera.seteScore(86);
		System.out.println(hyera);

		Student yujeong = new Student("유정", 92, 83, 78);
		System.out.println(hyera);

		System.out.println("\n===================================================\n");

		ArrayList<Student> stuList = new ArrayList<>(); // 학생들의 목록

		stuList.add(yesl);
		stuList.add(hyera);
		stuList.add(yujeong);
		stuList.add(new Student("준호", 80, 82, 77));
		stuList.add(new Student("성복", 78, 89, 87));

		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i)); // get (가진 값)
		}

		System.out.println("\n======================== for문 이용 내림차순 ========================\n");

		// 학생들의 평균을 이용해서
		// 1등. [혜라, 국어: 90, 영어: 86, 수학: 87, 평균: 87.7]
		// 2등. [예슬, 국어: 93, 영어: 80, 수학: 87, 평균: 86.7]
		for (int k = 0; k < stuList.size() - 1; k++) {
			for (int i = 0; i < stuList.size() - 1; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				// index 2번인 레벨과 비교 stuList.get(1)
				if (stuList.get(i).getAvg() < stuList.get(i + 1).getAvg()) {
					Student t = stuList.get(i);
					stuList.set(i, stuList.get(i + 1));
					stuList.set(i + 1, t);
				}
			}
		}

		for (int i = 0; i < stuList.size(); i++) {
			System.out.println((i + 1) + "등: " + stuList.get(i));
		}

		System.out.println("\n======================== Collectins.sort 리턴 ========================\n");

		// Collections.sort()
		Collections.sort(stuList, new Comparator<Student>() {
			@Override
			public int compare(Student stuA, Student stuB) {
				double diff = stuA.getAvg() - stuB.getAvg();
				// 양의 소수, 음의 소수
				if (diff > 0) {
					// 음의 정수
					return -1;
				} else if (diff <= 0) {
					return 1;
				}

				return (int) (stuA.getAvg() - stuB.getAvg());
			}

		});

		for (int i = 0; i < stuList.size(); i++) {
			System.out.println((i + 1) + "등: " + stuList.get(i));
		}

		System.out.println("\n======================== 람다식 Collectins.sort ========================\n");

		// 람다식은 삼항 연산자 사용
		Collections.sort(stuList, (stuA, stuB) -> (stuA.getAvg() - stuB.getAvg() > 0) ? (1) : (-1));

		for (int i = 0; i < stuList.size(); i++) {
			System.out.println((i + 1) + "등: " + stuList.get(i));
		}

	}
}
