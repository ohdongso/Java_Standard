package Chapter06;

public class _22_VarArgsEx {
	
	public static void main(String[] args) {
		String[] strArr = { "100", "200", "300" }; // 문자열 배열 선언
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	} // main의 끝.
	
	
	// 메서드 오버로딩보다 더 간편한 가변인자가 있다.(String... args)
	// 인자가 없음, 인자가 하나, 인자가 둘, 배열도 가능
	// 가변인자를 선언한 메서드를 오버로딩하면, 메서드를 호출했을 때 구별할수 없어서 컴파일 에러가 발생한다.
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			// 문자열 배열의 값과 delim에 해당하는 매개변수값을 문자열에 추가시켜준다.
			result += str + delim;
		}
		
		return result;
	}
	
	/*
	 static String concatenate(String... args) {
	 	returnconatenate("", args);
	 }
	 */
} // class