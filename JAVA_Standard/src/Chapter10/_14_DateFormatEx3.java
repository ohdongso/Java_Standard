package Chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _14_DateFormatEx3 {
	/*
	 	1, DateFormat으로 날짜형식 지정
	 	2, parse를 이용하여 DateFormat 클래스 타입을, Date로 변경
	 	3, 변경된 Date 타입의 변수를 DateFormat클래스의 format메서드를 활용해 형식을 지정한다.
	 */
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2015년 11월 23일");
			System.out.println(df2.format(d));
		} catch (Exception e) {}
	} // main
}