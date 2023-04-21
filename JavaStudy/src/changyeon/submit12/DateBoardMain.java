package changyeon.submit12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class DateBoardMain {

	private static final String Date = null;

	public static void main(String[] args) throws ParseException {
		
		
		
		// dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for (int i = 0; i < 100; i++) {
			int randDay = (int) (Math.random() * 365) + 1; // 1~365
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, randDay * -1);

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i + 1) + "번째 생성된 글", strDate));
		}

		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}

		// TODO 코드작성 시작 ~!
		System.out.println("Q. 03");
		
		System.out.println("날짜별로 정렬 후 출력(최신순)");
		for (int k = 0; k < dbList.size(); k++) {
			for (int i = 0; i < dbList.size(); i++) {
				String diffA = dbList.get(i).getDate().substring(0, 10).replace(".", "");
				String diffB = dbList.get(k).getDate().substring(0, 10).replace(".", "");
				int a = Integer.parseInt(diffA);
				int b = Integer.parseInt(diffB);
				if (a - b < 0) {
					DateBoard t = dbList.get(i);
					dbList.set(i, dbList.get(k));
					dbList.set(k, t);
				}
			}
		}
		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println("\n=============================================\n");
		
		System.out.println("날짜별로 정렬 후 출력(오래된 순)");
		
		for (int k = 0; k < dbList.size(); k++) {
			for (int i = 0; i < dbList.size(); i++) {
				String diffA = dbList.get(i).getDate().substring(0, 10).replace(".", "");
				String diffB = dbList.get(k).getDate().substring(0, 10).replace(".", "");
				int a = Integer.parseInt(diffA);
				int b = Integer.parseInt(diffB);
				if (a - b > 0) {
					DateBoard t = dbList.get(i);
					dbList.set(i, dbList.get(k));
					dbList.set(k, t);
				}
			}
		}
		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println("\n=============================================\n");
		
		System.out.println("Q. 04");
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		Calendar calToday = Calendar.getInstance();
		Date dateToday = new Date();
		String abc = sdf.format(dateToday);
		Date dateCurr = sdf.parse(abc);
		
		
		for(int i = 0; i < dbList.size(); i++) {
			Date a = sdf.parse(dbList.get(i).getDate());
			long diffMillSec = dateCurr.getTime() - a.getTime();
			long diffDay = diffMillSec / (1000 * 60 * 60 * 24);
			if(diffDay < 30) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n=============================================\n");
		
		System.out.println("한달 작성 된 게시글 출력");
		
		// 한달 전 날짜로 세팅
		// Calendar 객체 사용
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		
		// Date 객체 사용
		Date today = new Date(); // 현재 날짜 
		long diff = today.getTime() - (1000 * 60 * 60 * 24 * 30L); // 한달 전 날짜
		
		
		for(int i = 0; i < dbList.size(); i++) {
			Date temp = sdf.parse(dbList.get(i).getDate());
//			System.out.println(cal.get(i)-temp.getTime());
			// temp를 밀리초로 나타낸 것이
			// 한달 전 날짜를 밀리초로 나타낸 것보다 크면
			// 최근 한달 내 데이터를 의미한다. 
			if (temp.getTime() > cal.getTime().getTime()) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("=================이번 달 게시글=================");
		Calendar toMonth = Calendar.getInstance();
		
		int year = toMonth.get(Calendar.YEAR);
		int month = toMonth.get(Calendar.MONTH);
		
		System.out.println(year);
		System.out.println(month);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date temp = sdf.parse(dbList.get(i).getDate());
			Calendar tempCal = Calendar.getInstance();
			tempCal.setTime(temp);
			
			int tempYear = tempCal.get(Calendar.YEAR);
			int tempMonth = tempCal.get(Calendar.MONTH);
			
			if(year == tempYear && month == tempMonth) {
				System.out.println(dbList.get(i));
			}
		}
//			System.out.println("=================이번 달 게시글=================");
//			
//			Calendar toMonth = Calendar.getInstance();
//			
//			int year = toMonth.get(Calendar.YEAR);
//			int month = toMonth.get(Calendar.MONTH);
//			
//			System.out.println(year);
//			System.out.println(month);
//			
//			for(int i = 0; i < dbList.size(); i++) {
//				Date temp = sdf.parse(dbList.get(i).getDate());
//				Calendar tempCal = Calendar.getInstance();
//				tempCal.setTime(temp);
//				
//				int tempYear = tempCal.get(Calendar.YEAR);
//				int tempMonth = tempCal.get(Calendar.MONTH);
//				
//				if(year == tempYear && month == tempMonth) {
//					System.out.println(dbList.get(i));
//				}
//			
//			
//		}
		
		String toStr = "2023. 03. 21";
		String fromStr = "2023. 02. 14";
		
		Date fromDate = sdf.parse(fromStr);
		Date toDate = sdf.parse(toStr);
		
		
		
		
	}

}
