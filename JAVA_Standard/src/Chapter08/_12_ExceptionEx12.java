package Chapter08;

public class _12_ExceptionEx12 {
	/*
	  1, 예외가 발생했을 때, 모두 3개의 메소드(main, method1, method2)가 호출스택에 있었으며,
	  2, 예외가 발생한 곳은 제일 윗줄에 있는 method2()라는 것과
	  3, main메서드가 method1()을, 그리고 method1()은 method2()를 호출했다는 것을 알 수 있다.
	 */
	public static void main(String[] args) throws Exception {
		method1(); // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
	} // main메서드의 끝
	
	static void method1() throws Exception {
		method2();
	} // method1의 끝
	
	static void method2() throws Exception {
		throw new Exception();
	} // method2의 끝
}