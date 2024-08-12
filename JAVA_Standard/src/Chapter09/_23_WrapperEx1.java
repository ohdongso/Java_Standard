package Chapter09;

public class _23_WrapperEx1 {
	/* 
	  	래퍼 클래스들은 모두 equals()가 오버라이딩되어 있어서 주소값이 아닌 객체가 가지고 있는 값을 비교한다.
	  	그래서 실행결과를 보면 equals()를 이용한 두 Integer객체의 비교 결과가 true라는 것을 알 수 있다.
	  	오토박싱이 된다고 해도 Integer객체에 비교연산자를 사용할 수 없다. 대신 compareTo()를 제공한다.
	  	
	  	그리고 toString()도 오버라이딩되어 있어서 객체가 가지고 있는 값을 문자열로 변환하여 반환한다.
	  	
	  	compareTo() 함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수이다. 
	  	함수에는 위에서 설명하는바와 같이 "문자열의 비교"와 "숫자의 비교" 두 방식이 존재한다.
	  	숫자의 비교 같은 경우는 단순히 크다(1), 같다(0), 작다(-1) 의 관한 결과값을 리턴해주는 반면 
	  	문자열의 비교 같은 경우는 같다(0), 그 외 양수/음수값 같이 참 재미난 결과를 반환해준다.
	 */
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 ? " + (i == i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		System.out.println("i.compareTo(i2)=" + i.compareTo(i2));
		System.out.println("i.toString()=" + i.toString());
		
		System.out.println("MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("SIZE=" + Integer.SIZE + " bits");
		System.out.println("BYTES=" + Integer.BYTES + " bytes");
		System.out.println("TYPE=" + Integer.TYPE);
	} // main 끝.
}