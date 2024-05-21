package Chapter07;

public class _17_InstanceofTest {
	/*
	 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof연산자를 사용한다.
	 주로 조건문에 사용되며, instanceof의 왼쪽에는 참조변수를 오른쪽에는 타입(클래스명)이 피연산자로 위치한다.
	 그리고 연산의 결과로 boolean값인 true와 false 중 하나를 반환한다.
	 instanceof를 이용한 연산결과로 true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
	 */
	 
	public static void main(String[] args) {
		FireEngine1 fe = new FireEngine1();
		
		if(fe instanceof FireEngine1) { // fe 참조변수가 FireEngine 클래스타입으로 형변환 가능한지 묻는 것.
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car1) {
			System.out.println("This is a Car1 instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
		
		System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
	} 
} // class
class Car1 {}
class FireEngine1 extends Car1 {}