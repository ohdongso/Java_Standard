package Chapter10;

import java.text.DecimalFormat;

public class _11_DecimalFormatEx2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.###");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			/*
			 	Number Class는 Byte, Double, Float, Integer, Short, Long 클래스의 부모 클래스입니다.
			 	Number 클래스는 추상 클래스 입니다. 그리고 4개의 추상 메서드를 가지고 있습니다.
			 	
			 	public abstract int intValue();
				public abstract long longValue();
				public abstract float floatValue();
				public abstract double doubleValue();
				
			 	value메서드들은 원하는 클래스로 형변환을 할 수 있습니다.
			 */
			Number num = df.parse("1,234,567.89"); // 문자열로부터 각 데이터 타입으로 형 변환
			System.out.print("1,234,567.89" + " -> ");
			
			double d = num.doubleValue(); // num을 double형으로 형변환
			System.out.print(d + " -> ");
			
			/*
				숫자와 날짜를 원하는 형식으로 쉽게 출력이 가능하다. (숫자, 날짜 -> 형식 문자열)
				형식 문자열에서 숫자와 날짜를 뽑아내는 기능(형식 문자열->숫자, 날짜)
			 */
			System.out.println(df2.format(num));
		} catch (Exception e) {}
	} // main
}