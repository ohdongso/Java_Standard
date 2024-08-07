package Chapter09;

public class _03_HashCodeEx1 {
	/*
	 	String클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록 hashCode메서드가
	 	오버라이딩되어 있기 때문에, 문자열의 내용이 같은 str1과 str2에 대해 
	 	hashCode()를 호출하면 항상 동일한 해시코드값을 얻는다.
	 	
	 	반면에 System.identityHashCode(Object x)는 Object클래스의 hashCode메서드처럼
	 	객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장한다.
	 	
	 	그래서 str1과 str2가 해시코드는 같지만 서로 다른 객체라는 것을 알 수 있다.
	 */
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}