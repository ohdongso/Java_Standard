package Chapter03;

public class _29_OperatorEx29 {

	public static void main(String[] args) {
		byte p = 10;
		byte n = -10;
		
		System.out.printf(" p  =%d \t%s%n", p, toBinaryString(p)); // 정수
		System.out.printf("~p  =%d \t%s%n", ~p, toBinaryString(~p)); // 1의보수
		System.out.printf("~p+1  =%d \t%s%n", ~p+1, toBinaryString(~p+1)); // (1의보수 + 1) ==> 음수가 된다.
		System.out.printf("~~p  =%d \t%s%n", ~~p, toBinaryString(~~p)); // 반전에 반전 그대로
		System.out.println();
		System.out.printf(" n  =%d%n", n);
		System.out.printf("~(n-1)=%d%n", ~(n-1)); // 음수 정수를 양수 정수로 변경 할 때
	} // main의 끝.
	
	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) { // 10진 정수를 2진수로 변환하는 메서드
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}
}