package Chapter09;

public class _18_StringBufferEx1 {
	/*	
	 	String클래스에서는 equals메서드를 오버라이딩해서 문자열의 내용을 비교하도록 구현되어 있지만,
	 	StringBuffer클래스는 equals메서드를 오버라이딩하지 않아서
	 	StringBuffer클래스의 equals메서드를 사용해도 등가비교연산자(==)로 비교한 것과 같은 결과를 얻는다.
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2)); // false
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2)); // false
		
		// StringBuffer의 내용을 String으로 변환한다.
		String s = sb.toString(); // String s = new String(sb);와 같다.
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
	} // main 끝.
}


