package Chapter07;

/*
 	위의 예제는 내부 클래스와 외부 클래스에 선언된 변수의 이름이 같을 때 변수 앞에 'this' 또는
 	외부 클래스명.this를 붙여서 서로 구별할 수 있다는 것을 보여준다.
 */

class Outer1 {
	int value = 10; // Outer.this.value
	
	class Inner {
		int value = 20; // this.value
		
		void method1() {
			int value = 30;
			System.out.println("           value :" + value); // 메서드안의 지역변수 호출
			System.out.println("      this.value :" + this.value); // 내부클래스 안의 멤버변수 호출
			System.out.println("Outer.this.value :" + Outer1.this.value); // 외부클래스의 멤버변수 호출
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

public class _35_InnerEx5 {
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		Outer1.Inner inner = outer.new Inner();
		inner.method1();
	}
} // InnerEx5 끝.