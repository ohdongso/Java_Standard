package Chapter08;

public class _06_ExceptionEx6 {
	/*
	 	ArithmeticException클래스는 Exception클래스의 자손이므로, ArithmeticException인스턴스와 Exception클래스와의
	 	instanceof연산결과가 true가 되어 Exception클래스타입의 참조변수를 선언한 catch 블럭의 문장들이 수행되고 예외는 처리되는 것이다.
	 */
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); // 실행되지 않는다.
		} catch (Exception e) { // ArithmeticException대신 Exception을 사용.
			System.out.println(5); // 실행되지 않는다.
		} // try-catch의 끝
		
		System.out.println(6);
	} // main메서드의 끝
}