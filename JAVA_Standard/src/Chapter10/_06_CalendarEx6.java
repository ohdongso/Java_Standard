package Chapter10;

import java.util.Calendar;

public class _06_CalendarEx6 {
	/*
	 	1, 커맨드라인으로 년과 월을 입력하면 달력을 출력하는 예제이다.
	 	2, sDay.set(년, 월, 일); set은 3개의 매개변수를 넣어주면 (년,월,일)을 세팅한다.
	 	3, 
	 */
	public static void main(String[] args) {
		// System.out.println("args.length : " + args.length); (2024, 9)입력시 "2"
		if(args.length != 2) {
			System.out.println("Usage : java CalendarEx8 2024 9");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝일
		
		// 월의 경우 0 부터 11까지의 값을 가지므로 1을 빼주어야 한다.
		// 예를 들어, 2015년 11월 1일은 sDay.set(2015, 10, 1);과 같이 해줘야 된다.
		sDay.set(year, month-1, 1); // 2024, 8, 1 ==> 년월일 세팅
		eDay.set(year, month, 1); // 2024, 9, 1 ==> 년월일 세팅
		
		// 다음달의 첫날에서 하루를 뺴면 현재달의 마지막 날이 된다.
		// 12월 1일에서 하루를 뺴면 11월 30일이 된다.
		eDay.add(Calendar.DATE, -1);
		
		// 첫 번째 요일이 무슨 요일인지 알아낸다.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 9월의 첫번째 요일, 1(일요일)을 반환한다.
		
		// eDay에 지정된 날짜를 얻어온다.
		END_DAY = eDay.get(Calendar.DATE); // 9월의 마지막 날짜를 반환한다.(30)
		
		System.out.println("       " + args[0] + "년 " + args[1] + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
		// 만일 1일이 수요일이라면 공백을 세 번 찍는다.(일요일부터 시작)
		for(int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("    ");
		}
		
		/*
			1, START_DAY_OF_WEEK(9월의 시작 요일) ==> 1(일요일)
			2, END_DAY(9월의 마지막 일) ==> (30일)
			3, i는 하루씩 증가하는 일을의미, n일 일주일을 의미
		*/
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10) ? "  " + i : " " + i);
			if(n % 7 == 0) { // 일주일이 지나면 한칸 띄어준다.
				System.out.println();
			}
		} // for문 끝.
	}
}