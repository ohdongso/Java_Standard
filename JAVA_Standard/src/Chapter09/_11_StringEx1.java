package Chapter09;

public class _11_StringEx1 {
	/*	
	 	한번 생성된 String인스턴스가 갖고 있는 문자열은 읽어 올 수만 있고, 변경할 수는 없다.
	 	예를 들어 '+'연산자를 이용해서 문자열을 결합하는 경우 인스턴스내의 문자열이 바뀌는 것이 아니라
	 	새로운 문자열이 담긴 String인스턴스가 생성되는 것이다.
	 	
	 	이처럼 덧셈연산자'+'를 사용해서 문자열을 결합하는 것은 매 연산 시 마다 새로운 문자열을 가진
	 	String인스턴스가 생성되어 메모리공간을 차지하게 되므로 가능한 한 결합횟수를 줄이는 것이 좋다.
	 	문자열간의 결합이나 추출 등 문자열을 다루는 작업이 많이 필요한 경우에는 String클래스 대신
	 	StringBuffer클래스를 사용하는 것이 좋다. StringBuffer인스턴스에 저장된 문자열은 변경이 가능하므로
	 	하나의 StringBuffer인스턴스만으로도 문자열을 다루는 것이 가능하다.
	 	
	 	문자열을 만들 때는 두 가지 방법, 문자열 리터럴을 지성하는 방법과 String클래스의 생성자를
	 	사용해서 만드는 방법이 있다. String클래스의 생성자를 이용한 경우에는 new연산자에 의해서 
	 	메모리할당이 이루어지기 때문에 항상 새로운 String인스턴스가 생성된다. 그러나 문자열 리터럴은 이미
	 	존재하는 것을 재사용하는 것이다.
	 */
	public static void main(String[] args) throws Exception{
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();
		
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}
}