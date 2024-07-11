package Chapter08;

public class _22_NewExceptionTest_22 {
	/*
	 	method1()과 main메서드 양쪽의 catch블럭이 모두 수행되었음을 알 수 있다.
	 	method1()의 catch블럭에서 예외를 처리하고도 throw문을 통해 다시 예외를 발생 시켰다.
	 	그리고 이 예외를 main메서드 한 번 더 처리하였다.
	 	반환값이 있는 return문의 경우, catch블럭에도 return문이 있어야 한다. 
	 	예외가 발생 했을 경우에도 값을 반환해야하기 때문이다.
	 */
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	} // main메서드의 끝
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e; // 예외를 던졌다. main쪽에서 다시 한번 처리
		}
	} // method1메서드의 끝
}