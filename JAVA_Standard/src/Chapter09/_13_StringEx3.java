package Chapter09;

public class _13_StringEx3 {
	/*	
	 	길이가 0인 배열을 생성해서 char형 배열 참조변수 cArr를 초기화 해주었다.
	 	길이가 0이긴 해도 배열이 생성되며 생성된 배열의 주소값이 참조변수 cArr에 저장된다.
	 */
	public static void main(String[] args) throws Exception{
		// 길이가 0인 char배열을 생성한다.
		char[] cArr = new char[0]; // char[] cArr = [];와 같다.
		String s = new String(cArr); // String s = new String("");와 같다.
		
		System.out.println("cArr.length=" + cArr.length);
		System.out.println("@@@" + s + "@@@");
	}
}