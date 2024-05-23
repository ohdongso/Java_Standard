package Chapter07;

public class _20_BindingTest3 {
	 
	/*
		자손 클래스 Child에 선언된 인스턴스변수 x와 조상 클래스 Parent로부터 상속받은 인스턴스변수 x를 구분하는데
		참조변수 super와 this가 사용된다. 자손인 Child클래스에서의 super.x는 조상 클래스인 Parent에 선언된
		인스턴스변수 x를 뜻하며 this.x 또는 x는 Child클래스의 인스턴스변수 x를 뜻한다. 그래서 위 결과에서 x와 this.x의 값이 같다.
	 */
	public static void main(String[] args) {
		Parent4 p = new Child4();
		Child4 c = new Child4();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	} 
}

class Parent4 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child4 extends Parent4 {
	int x = 200;
	
	void method() {
		System.out.println("x=" + x); // this.x와 같다.
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);
	}
}
