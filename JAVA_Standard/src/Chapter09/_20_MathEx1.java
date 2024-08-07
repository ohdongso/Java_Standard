package Chapter09;

import static java.lang.Math.*;
import static java.lang.System.*;

public class _20_MathEx1 {
	/*	
	 
	 */	
	public static void main(String[] args) {
		double val = 90.7552;
		out.println("round(" + val + ")=" + round(val)); // 반올림, 소수 첫째자리에서 반올림
		
		val *= 100;
		out.println("round(" + val + ")=" + round(val)); // 반올림, 소수 첫째자리에서 반올림
		
		// 9075.52
		out.println("round(" + val + ")/100  =" + round(val)/100); // 반올림을 한 뒤 100을 나눠준 것
		out.println("round(" + val + ")/100.0=" + round(val)/100.0); // 반올림
		out.println();
		out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1)); // 올림
		out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5)); // 버럼	
		out.printf("round(%3.1f)=%d%n", 1.1, round(1.1)); // 반올림
		out.printf("round(%3.1f)=%d%n", 1.5, round(1.5)); // 반올림
		out.printf("rint(%3.1f)=%f%n", 1.5, rint(1.5)); // 반올림, 절대값 반올림하고 부호를 붙여준다고 생각
		out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5)); // 반올림, 반올림 하면 -1이 된다.
		out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5)); // 반올림,  반올림 하면 -2.0이 된다.	
		out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5)); // 올림, 올림 하면, -1.0이 된다.
		out.printf("ceil(%3.1f)=%f%n", -1.5, floor(-1.5)); // 버림, 버림 하면, -2.0이 된다.
	} // main 끝.
}