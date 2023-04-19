package ch10_extends_interface.mysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.school.Student;

public class MysortMain {

	public static void main(String[] args) {
		
		ArrayList<Student> stuList = new ArrayList<>();
		
		stuList.add(new Student("준호", 88, 94, 75));
		stuList.add(new Student("동욱", 90, 95, 71));
		stuList.add(new Student("유정", 94, 85, 72));
		stuList.add(new Student("혜라", 91, 81, 83));
		stuList.add(new Student("현진", 76, 92, 84));
		stuList.add(new Student("민경", 81, 93, 95));
		
		// 이게 뭐지?? -> 콜백함수
		// 인터페이스(Comparator)의 추상메소드(compare)를 
		// 미리 다른 메소드(sort)에서 사용하고,
		// 추상메소드(compare)의 구현은 해당 메소드(sort)를
		// 실행하는 쪽에서 구현한다.
		Collections.sort(stuList, new Comparator<Student>() {

			@Override
			public int compare(Student stuA, Student stuB) {
				double diff = stuA.getAvg() - stuB.getAvg();
				return (diff < 0) ? 1 : -1;
			}
		});
		
		Collections.sort(stuList, (stuA, stuB) -> 
			(stuA.getAvg() - stuB.getAvg() < 0) ? 1 : -1);
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등. " + stuList.get(i));
		}
		
		System.out.println("\n======================================\n");
		
		MyCollections.mySort(stuList, new MyComparator<Student>() {

			@Override
			public boolean myCompare(Student stuA, Student stuB) {
				return stuA.getAvg() < stuB.getAvg();
			}
		});
		
		MyCollections.mySort(stuList, (stuA, stuB) -> stuA.getAvg() < stuB.getAvg());
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등. " + stuList.get(i));
		}
		
		
	}

}
