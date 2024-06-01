package Chapter07;

public class _24_FighterTest {
	/*
	 ● 추상클래스
	 클래스를 설계도에 비유한다면 "추상클래스는 미완성 설계도"에 비유할 수 있다.
	 미완성 설계도란, 단어의 뜻 그대로 완성되지 못한 채로 담겨진 설계도를 말한다.
	 클래스가 미완성이라는 것은 멤버의 개수에 관계된 것이 아니라, 단지 미완성 메서드(추상메서드)를 포함하고 있다는 의미이다.
	 
	 미완성 설계도로 완성된 제품을 만들 수 없듯이 추상클래스로 인스턴스는 생성할 수 없다.
	 추상클래스는 상속을 통해서 자손클래스에 의해서만 완성될 수 있다.
	 
	 ● 인터페이스
	 인터페이스는 일종의 추상클래스이다. 인터페이스는 추상클래스처럼 추상메서드를 갖지만 추상클래스보다
	 추상화 정도가 높아서 추상클래스와 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없다.
	 오직 추상메서드와 상수만을 멤버로 가실수 있으며, 그 외의 다른 어떠한 요소도 허용하지 않는다.
	 
	 추상클래스를 부분적으로만 완성된 '미완성 설계도'라고 한다면, 인터페이스는 구현된 것은
	 아무 것도 없고 밑그림만 그려져 있는 '기본 설계도'라 할 수 있다.
	 
	 인터페이스도 추상클래스처럼 완성되지 않은 불완전한 것이기 때문에 그 자체만으로 사용되기 보다는 다른 클래스를 작성하는데 도움
	 줄 목적으로 작성된다.
	 */
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손입니다.");
		
		if(f instanceof Fightable)
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		
		if(f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		
		if(f instanceof Movable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		
		if(f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
	} 
} // main 끝.

class Fighter extends Unit implements Fightable {
	public void move(int x, int y ) { /* 내용 생략 */ }
	public void attack(Unit u) { /* 내용 생략 */ }
}

class Unit {
	int currentHP; // 유닛의 체력
	int x; // 유닛의 위치(x좌표)
	int y; // 유닛의 위치(y좌표)
}

// 인터페이스의 이름에는 주로 Fightable과 같이 ~을 할 수 있는 의미인 able로 끝나는 것들이 많은데,
// 그 이유는 어떠한 기능 또는 행위를 하는데 필요한 메서드를 제공한다는 의미를 강조하기 위해서이다.
interface Fightable extends Movable, Attackable {}
interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }

