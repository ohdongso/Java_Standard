package Chapter09;

import static java.lang.Math.*;
import static java.lang.System.*;

public class _22_MathEx3 {
	/* 
	   sqrt(): 제곱근을 계산해주는
	   pow() : n제곱을 계산해주는 
	   PI : 원수율
	   atan2() : 직각 삼각형에서 두 변의 길이 a, b를 알면 끼인각을 구해준다.
	   log10() : 24자리의 2진수는 10진수로 몇 자리의 값인지 알아내는 식
	 */
	public static void main(String[] args) {
		int x1 = 1, y1 = 1; // (1, 2)
		int x2 = 2, y2 = 2; // (2, 2)
		
		double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2)); // 두 점 사이의 거리
		double a = c * sin(PI/4); // PI/4 rad = 45 degree ==> (x2, y2)쪽 에서 아래로 내려오는 a = 1을 가리킨다.
		double b = c * cos(PI/4); // (x1, y1)쪽 에서 우측으로 가는 b = 1을 가리킨다.
		// 삼각형 완성
//		double b = c * cos(toRadians(45));
		
		out.printf("a=%f%n", a);
		out.printf("b=%f%n", b);
		out.printf("c=%f%n", c);
		out.printf("angle=%f rad%n", atan2(a,b));
		// atan2() : 직각 삼각형에서 두 변의 길이 a, b를 알면 끼인각을 구해준다.
		// 결과값 역시 단위가 라디안이므로 도(degree)단위로 변환하려면 180/PI를 곱하거나
		// toDegrees(double angrad)를 이용하면 된다.
		out.printf("angle=%f degree%n%n", atan2(a,b) * 180 / PI);
//		out.printf("angle=%f degree%n%n", toDegrees(atan2(a,b)));
		
		// log10() : 24자리의 2진수는 10진수로 몇 자리의 값인지 알아내는 식
		out.printf("24 * log10(2)=%f%n", 24 * log10(2)); // 7.224720
		out.printf("53 * log10(2)=%f%n%n", 53 * log10(2)); // 15.954590
	} // main 끝.
}