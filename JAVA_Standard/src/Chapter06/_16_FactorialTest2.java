package Chapter06;

public class _16_FactorialTest2 {
	
	static long factorial(int n) {
		// Tip, 재귀함수를 멈추는 기저조건이 필수다.
		
		// n이 0이하이거나, 20보다 큰 경우 -1을 반환한다.
		if(n <= 0 || n > 20) { // 매개변수의 유효성 검사
			return -1;
		}
		
		// n이 1인경우 1을 리턴한다.
		if(n <= 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for(int i = 1; i <= n; i++) { // 1 ~ 21
			result = factorial(i); // 함수 호출 영역에 차곡차곡 누적된다고 생각하면 된다.
			
			/*
			 1, i==1 ==> 1!=1 출력
			 2, i==2, 
			    2 * factorial(2 - 1)
			    2 * 1 ==> 2!=2 출력
			 3, i==3,
			    3 * factorial(3 - 1)
			    3 * 2 * factorial(2 - 1)
			 	3 * 2 * 1 ==> 3!=6 출력
			 4, i==4,
			 	4 * factorial(4 - 1)
				4 * 3 * factorial(3 - 1)
				4 * 3 * 2 * 1 ==> 4!=24 출력
			 5, 이과정을 20까지 반복한다.
			 */
			
			// n이 21일때 해당 조건이 true가 되서 아래 구만을 출력한다.
			if(result == -1) {
				System.out.printf("유효하지 않은 값입니다.(0<n<=20) :%d%n", n);
				break;
			}
			
			// (0 < n < 21)이 조건을 만족할 때 아래 구문을 출력한다.
			System.out.printf("%2d!=%20d%n", i, result);
		}
	} // main의 끝
}