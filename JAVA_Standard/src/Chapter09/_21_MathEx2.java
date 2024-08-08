package Chapter09;

import static java.lang.Math.*; 
import static java.lang.System.*;

public class _21_MathEx2 {
	/*	
	 	정수형의 최소값에 비트전환연산자'~'를 적용하면, 최대값이 되는데 여기에 1을 더하니까 오버플로우가 발생하는 것이다.
	 	그래서 int의 최소값이 다시 원래의 값이 되어버렸다.
	 	
	 	예제에서는 try-catch문을 사용해서 오버플로우가 발생하면, i를 long타입으로 형변환하여 negateExcat(long a)을
	 	호출하도록 작성하였다.
	 	
	 	negateExact() 부호 변경해주는 함수
	 */	
	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		out.println("i =" + i);
		out.println("-i=" + (-i));
		
		try {
			out.printf("negateExact(%d)= %d%n",  10, negateExact(10));
			out.printf("negateExact(%d)= %d%n", -10, negateExact(-10));
			out.printf("negateExact(%d)= %d%n",   i, negateExact(i)); // 예외발생
		} catch (Exception e) {
			// i를 long타입으로 형변환 다음에 negateExact(long a)를 호출
			out.printf("negateExact(%d)= %d%n", (long)i, negateExact((long)i));
		}
	} // main 끝.
}