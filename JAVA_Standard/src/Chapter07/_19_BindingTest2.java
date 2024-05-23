package Chapter07;

public class _19_BindingTest2 {
	 
	/*
		이전의 예제와는 달리 Child클래스에는 아무런 멤버도 정의되어 있지 않고 단순히 조상으로부터 멤버들을 상속받는다.
		그렇기 때문에 참조변수의 타입에 관계없이 조상의 멤버들을 사용하게 된다.
		
		이처럼 자손 클래스에서 조상 클래스의 멤버를 중복으로 정의하지 않았을 때는 참조변수의 타입에 따른 변화는 없다.
		어느 클래스의 멤버가 호출되어야 할지, 즉 조상의 멤버가 호출되어야할 지, 자손의 멤버가 호출되어야 할지에 대해 선택의 여지가 없기
		때문이다.
		
		참조변수의 타입에 따라 결과가 달라지는 경우는 조상 클래스의 멤버변수와 "같은 이름의 
		멤버변수"를 자손 클래스에 중복해서 정의한 경우뿐이다.
	 */
	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	} 
}

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 {}
