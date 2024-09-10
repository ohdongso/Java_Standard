package Chapter09;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _44_BigDecimalEx {
	/*
		
	 */
	public static void main(String[] args) throws Exception {
		BigDecimal bd1 = new BigDecimal("123.456");
		BigDecimal bd2 = new BigDecimal("1.0");
		
		System.out.print("bd1=" + bd1);
		System.out.print(",\tvalue=" + bd1.unscaledValue()); // 정수를 그대로 표현.
		System.out.print(",\tscale=" + bd1.scale()); // 지수 소수점의 자리수를 표현한다.
		System.out.print(",\tprecision=" + bd1.precision()); // 정수의 자리수를 표현한다.
		System.out.println();
		
		System.out.print("bd2=" + bd2); 
		System.out.print(",\tvalue=" + bd2.unscaledValue()); // 정수를 그대로 표현.
		System.out.print(",\tscale=" + bd2.scale()); // 지수 소수점의 자리수를 표현한다.
		System.out.print(",\tprecision=" + bd2.precision()); // 정수의 자리수를 표현한다.
		System.out.println();
		
		BigDecimal bd3 = bd1.multiply(bd2);
		System.out.print("bd3=" + bd3);
		System.out.print(",\tvalue=" + bd3.unscaledValue());
		System.out.print(",\tscale=" + bd3.scale()); // 123."4560" ==> 4
		System.out.print(",\tprecision=" + bd3.precision()); // 1234560 ==> 7
		System.out.println();
		
		System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));
		System.out.println(bd1.setScale(2, RoundingMode.HALF_UP));
		System.out.println(bd1.divide(bd2, new MathContext(2, RoundingMode.HALF_UP)));
		
		System.out.println("---------------------- Test ----------------------");
		// bd1 = 123.456
		// bd2 = 1.0
		BigDecimal bd4 = new BigDecimal("1.0");
		BigDecimal bd5 = new BigDecimal("0.3");
		
		// 3이라는 인자가 scale()로 소수점 3자리까지표현하게 된다. 즉 4번째 자리에서 반올림 한다.
		System.out.println(bd4.divide(bd5, 3, RoundingMode.HALF_UP));
		
		// 5라는 인자가  precision()로 정수와, 소수점 이하를 모두 포함한 자리수를 의미한다.
		// 즉 3.3333 ==> 자리의 정밀도를 보여주고 소수점 이하 5번째 자리에서 반올림 한다.
		System.out.println(bd4.divide(bd5, new MathContext(5, RoundingMode.HALF_UP)));
	} // main 끝
}