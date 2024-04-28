package Chapter06;

public class _18_PowerTest {
	// x^1 ~ x^5까지의 합을 구하는 예제이다.
	// 2^1(2) + 2^2(4) + 2^3(8) + 2^4(16) + 2^5(32) = 62
	
	public static void main(String[] args) {
		int x = 2; // 계수 2
		int n = 5; // 지수 5
		long result = 0; // 제곱을 누적할 변수
		
		// i는 1~5까지 5번 반복된다.(지수가 된다.)
		for(int i = 1; i <= n; i++) { 
			
			// (2,1), (2,2), (2,3), (2,4), (2,5) ==> 5번 매개변수가 들어간다.
			System.out.println("(x, i) : (" + x + ", " + i + ")" );
			result += power(x, i);
			
			/*
			 1, (2,1)
			 	result(0) = result(0) + 2 ==> 2
			 2, (2,2)
			 	power(2, 2) * power(2, 2-1);
			 	2 * 2;
			 	result(2) = result(2) + 4 ==> 6
			 3, (2,3)
			 	power(2, 3) * power(2, 3-1) * power(2, 2-1);
			 	2 * 2 * 2;
			 	result(6) = result(6) + 8 ==> 14
			 4, (2,4)
			 	power(2, 4) * power(2, 4-1) * power(2, 3-1) * power(2, 2-1);
			 	2 * 2 * 2 * 2;
			 	result(14) = result(14) + 16 ==> 30
			 5, (2,5)
			 	power(2, 5) * power(2, 4) * power(2, 4-1) * power(2, 3-1) * power(2, 2-1);
			 	2 * 2 * 2 * 2 * 2;
			 	result(30) = result(30) + 32 ==> 62
			 */
		} // for문 끝.
		
		System.out.println(result);
	}
	
	// "x"는 2이다. 2의 제곱을 구해주기위한 고정된 수다.(계수)
	// 여기서 "n"은 "i"값이고 2의 제곱을 구해주기위한 가변적인 수다.(지수)
	static long power(int x, int n) { 
		// n이 1이면 x(2)를 반환한다.
		if(n == 1) {
			return x; // x는 2다.
		}

		return x * power(x, n-1);
	} // power 함수의 끝.
}