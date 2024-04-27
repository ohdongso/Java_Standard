package Chapter06;

public class _15_FactorialTest {
	/*
	 1, 메서드의 내부에서 메서드 자신을 다시 호출하는 것을 재귀호출이라 하고, 재귀호출을 하는 메서드를 재귀 메서드라 한다.
	 2, 팩토리얼은 한 숫자가 1이 될 때까지 1씩 감소기켜가면서 계속해서 곱해 나가는 것이다. 5! = 5*4*3*2*1 이다.
	 
	 
	 */
	public static void main(String[] args) {
		int result = factorial(4); // factorial함수에 인자값(n) 4를 전달한다.
		System.out.println(result);
	}
	
	static int factorial(int n) { // 4를 전달 받는다.
		int result = 0;
		if(n == 1) { // n이 1이면 재귀함수를 종료한다.
			result = 1; // n이 1이면 result 변수에 1을 담는다.
		} else { // n이 1이 아니면
			result = n * factorial(n-1); // n-1을 매개변수값으로 다시 메서드 자신을 호출한다.
			// System.out.println(result);
			// sysout구문으로 result를 출력하면 1이 안나오는 이유는 else문까지 타고 올수 없기때문이다.
			// 그리고 24가 두번 나오는 이유는 main메소드에 호출 구문이 있어서 2번 나온것이다.
			
			/*
			 1, 4 * factorial(4-1) * factorial(3-1) * factorial(2-1)
			 2, 1번처럼 세팅이 되고, 뒤에서부터
			 3, (1), factorial(2-1) == "1"이 result에 처음 저장
			 3, (2), factorial(3-1) * 1 == "2"가 result에 저장
			 4, (3), factorial(4-1) * 2 == "6"이 result에 저장
			 5, (4), 4 * 6 == "24"가 result에 저장 후 반환
			 */
		}
		
		// n이 1이 됐을 때, 1을 반환하고, 재귀함수를 종료한다. 
		return result; 
	}
}