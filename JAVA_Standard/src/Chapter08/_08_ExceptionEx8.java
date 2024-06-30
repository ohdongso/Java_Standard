package Chapter08;

public class _08_ExceptionEx8 {
	/*
	 	예외가 발생했을 때 생성되는 예외 클래스의 인스턴스에는 발생한 예외에 대한 정보가 담겨져 있으며,
	 	getMessage()와 printStackTrace()를 통해서 이 정보들을 얻을 수 있다.
	 	
	 	printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
	 	==> 조금더 상세하게 나와서 오류 찾기가 쉬울 것 같다.
	 	
	 	getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
	 */
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외발생!!!
			System.out.println(4); // 실행되지 않는다.
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 참조변수 ae를 통해. 생성된 ArithmeticExceptio인스턴스에 접근할 수 있다.
			System.out.println("예외메시지 : " + ae.getMessage());
		} // try-catch의 끝
		System.out.println(6);
	} // main메서드의 끝
}