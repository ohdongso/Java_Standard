package Chapter10;

import java.util.Calendar;

public class _07_CalendarEx7 {
	/*
		1, 커맨드라인으로 년과 월을 입력하면 달력을 출력하는 예제이다.
		2, sDay.set(년, 월, 일); set은 3개의 매개변수를 넣어주면 (년,월,일)을 세팅한다.
	 */
	public static void main(String[] args) {
		// System.out.println("args.length : " + args.length); ==> length는 "2"다.
		if(args.length != 2) {
			System.out.println("Usage : Java CalendarEx7 2024 9");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		// 월의 경우 0 부터 11까지의 값을 가지므로 1을 뺴워야한다.
		// 예를 들어, 2004년 11월 1일은 sDay.set(2004, 10, 1);과 같이 해줘야 한다.
		sDay.set(year, month-1, 1); // (sDay == 2024년 9월 1일)
		
		// 입력월의 말일로 설정한다.
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE)); // (eDay == 2024년 9월 30일)		
		
		// 1일이 속한 주의 일요일로 날짜설정
		// sDay.get(Calendar.DAY_OF_WEEK) ==> sDay의 요일을 반환한다. 일요일(1)
		// sDay.get(Calendar.DATE) ==> sDay의 일을 반환한다.
		
		// ex) (1, -5 + 1)
		// add메서드에서 DATE에서 8월1일 - 4를 통해 이전 날짜 28~31을 첫 주에 출력
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
		
		// 말일이 속한 주의 토요일로 날짜설정
		// 30, 7(월~일) - 2(월요일)
		// 30일이 월요일이기 때문에 7-2를 통해 30일 이후 날짜를 출력해준다. ==> 1~5
		eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("       " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// 시작 일부터 마지막 일까지(sDay <= eDay) 1일씩 증가시키면서 일(Calendar.DATE)을 출력
		// n은 한주를 표현하기위한 변수, sDay가 eDay와 같아 질때까지 "sDay"를 +1 해준다.
		for(int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) { // 증감식을 이렇게 표현 할 수 있네 오호!
			int day = sDay.get(Calendar.DATE); // 1일부터~30일까지
			System.out.print((day < 10) ? "  " + day : " " + day );
			if(n++ % 7 == 0) System.out.println(); // 7일치를 찍고 나서 줄을 바꾼다.
		}
	} // main
}