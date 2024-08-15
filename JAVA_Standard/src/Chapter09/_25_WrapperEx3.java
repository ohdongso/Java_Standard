package Chapter09;

public class _25_WrapperEx3 {
	/* 
		이 예제는 오투박싱을 이용해서 기본형과 참조형 간의 형변환과 연산을 수행하는 예를 보여준다.
		지금까지 배워온 것과는 달리 기본형과 참조형 간의 형변환도 가능할 뿐만 아니라, 심지어는
		참조형 간의 연산도 가능하다는 것에 다소 놀랐을 것이다
		
		그러나 사실 이 기능은 컴파일러가 제공하는 편리한 기능일 뿐 자바의 원칙이 바뀐것을 아니다.
		
		생성자가 없는 클래스에 컴파일러가 기본 생성자를 자동적으로 추가해 주듯이 개발자가 간략하게 쓴 구문을
		컴파일러가 원래의 구문으로 변경해 주는 것뿐이다.
	 */
	public static void main(String[] args) {
		int i = 10;
		
		// 기본형을 참조형으로 형변환(형변환 생략가능)
		Integer intg = (Integer)i; // Integer intg = Intefer.valueOf(i);
		Object obj = (Object)i; // Object obj = (Object)Integer.valueOf(i);
		
		Long lng = 100L; // Long lng = new Long(100L);
		
		int i2 = intg + 10; // 참조형과 기본형간의 연산가능
		long l = intg + lng; // 참조형 간의 덧셈도 가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2; // 참조형을 기본형으로 형변환도 가능(형변환 생략가능)
		
		Integer intg3 = intg2 + i3;
		
		System.out.println("i     ="+i);
		System.out.println("intg  ="+intg);
		System.out.println("obj   ="+obj);
		System.out.println("lng   ="+lng);
		System.out.println("intg + 10  ="+i2);
		System.out.println("intg + lng ="+l);
		System.out.println("intg2 ="+intg2);
		System.out.println("i3    ="+i3);
		System.out.println("intg2 + i3 ="+intg3);
	} // main 끝.
}