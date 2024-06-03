package Chapter07;

/*
 	● 인터페이스의 장점
 	
	1, 개발시간을 단축시킬 수 있다.
	일단 인터페이스가 작성되면, 이를 사용해서 프로그램을 작성하는 것이 가능하다. 메서드를 호출하는 쪽에서는
	메서드의 내용에 관계없이 선언부만 알면 되기 때문이다.
	그리고 동시에 다른 한 쪽에서는 인터페이스를 구현하는 클래스를 작성하게 하면, 인터페이스를
	구현하는 클래스가 작성될 때까지 기다리지 않고도 양쪽에서 동시에 개발을 진행할 수 있다.
	
	2, 표준화가 가능하다.
	프로젝트에 사용되는 기본 틀을 인터페이스로 작성한 다음. 개발자들에게 인터페이스를 구현하여 프로그램을
	작성하도록 함으로써 보다 일관되고 정형화된 프로그램의 개발이 가능하다.
	
	3, 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
	서로 상속관계에 있지도 않고, 같은 조상클래스를 가지고 있지 않은 서로 아무런 관계도 없는 클래스들에게 하나의
	인터페이스를 공통적으로 구현하도록 함으로써 관계를 맺어 줄 수 있다.
	
	4, 독립적인 프로그래밍이 가능하다.
	인터페이스를 이용하면 클래스의 선언과 구현을 분리시킬 수 있기 때문에 실제구현에 독립적인 프로그램을 작성하는 것이 가능하다.
	클래스와 클래스간의 직접적인 관계를 인터페이스를 이용해서 간접적인 관계로 변경하면, 한 클래스의 변경이 관련된
	다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍이 가능하다.
 */


public class _26_RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank); // SCV가 Tank를 수리하도록 한다.
		scv.repair(dropship);
		// scv.repair(marine); 에러! repair(Repairable) in SCV cannot be applied to (Marine)
	}
} // main 끝.

interface Repairable {} // 인터페이스

class Unit1 { // 유닛클래스
	int hitPoint;
	final int MAX_HP;
	Unit1(int hp) {
		MAX_HP = hp;
	}
	// ...
}

class GroundUnit extends Unit1 { // 유닛 클래스를 상속받은 지상군 클래스
	GroundUnit(int hp) { // 부모클래스 hp 멤버변수에 값 저장
		super(hp);
	}
}

class AirUnit extends Unit1 {
	AirUnit(int hp) { // 부모클래스 hp 멤버변수에 값 저장
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable { // Tank < GroundUnit < Repairable
	Tank() {
		super(150); // Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
	// ...
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125); // Dropship의 HP는 125이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	// ...
}

class Marine extends GroundUnit { // Marine < GroundUnit < Unit1
	Marine() {
		super(40); // MAX_HP에 40이 저장 된다.
		hitPoint = MAX_HP; // hitPoint(40) = MAX_HP(40);
	}
	// ...
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60); // MAX_HP에 60이 저장 된다.
		hitPoint = MAX_HP; // hitPoint(60) = MAX_HP(60);
	}
	
	void repair(Repairable r) { // 상속받은 자식객체면 종류에 상관없이 다 받을수 있다.
		if(r instanceof Unit1) { // r이 Unit1로 형변환 가능하다면
			Unit1 u = (Unit1)r; // r을 Unit1로 업캐스팅한 변수를 u에 담는다.
			while(u.hitPoint != u.MAX_HP) {
				/* Unit의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
	//...
}