package Chapter09;

import java.math.BigInteger;

public class _43_BigIntegerEx {
	/*
		1!~99!까지 출력하는 예제이다. long타입으로는 20!까지밖에 계산할 수 없지만, BigInteger로는
		99!까지, 그 이상도 얼마든지 가능하다.
	 */
	public static void main(String[] args) throws Exception {
		for(int i = 1; i < 100; i++) { // 1!부터 99!까지 출력
			System.out.printf("%d!=%s%n", i, calcFactorial(i));
			Thread.sleep(300); // 0.3초의 지연
		}
	} // main 끝
	
	static String calcFactorial(int n) {
		// n을 BigInteger로 변환 후 문자열로 반환
		return factorial(BigInteger.valueOf(n)).toString();
	}
	
	static BigInteger factorial(BigInteger n) {
		if(n.equals(BigInteger.ZERO)) { // n이 0이면 1을 반환한다.
			return BigInteger.ONE;
		} else { // n이 0이 아니면
			// multiply(곱셈), subtract(뺼셈),
			// 5*4*3*2*1 차례로 곱해준다. 
			// 마지막 1에서 -1을하면 0이 되고 최종족으로 1을 반환하고 팩토리얼로 곱해준다.
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}