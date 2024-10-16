package Chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _15_DateFormatEx4 {
	/*
	 	1, DateFormat으로 날짜형식 지정
	 	2, parse를 이용하여 DateFormat 클래스 타입을, Date로 변경
	 	3, 변경된 Date 타입의 변수를 DateFormat클래스의 format메서드를 활용해 형식을 지정한다.
	 */
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예:2015/12/31)");
		
		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력에:2015/12/31)");
			}
		} // while문 끝.
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
		
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
	} // main
}