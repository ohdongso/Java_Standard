package Chapter07;

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스 점수
	
	Product(int price) { // 오버로딩
		this.price = price; // 클래스내에 멤버변수
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
	}
}

class Tv2 extends Product {
	Tv2() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);	// Tv의 가격을 100만원으로 한다.
	}
	
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Buyer { // 고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
		
	} // buy 메서드 끝.
}

public class _21_PolyArgumentTest {
	 
	/*
		앞으로 다른 제품 클래스를 추가할 때 Product클래스를 상속받기만 하면, 
		buy(Product)메서드의 매개변수로 받아들여질 수 있다.
	 */
	public static void main(String[] args) {
		Buyer b = new Buyer(); // 1000을 가진 고객 객체생성
		
		// Tv2객체를 생성하면 부모의 Product 생성자에 100을 넘겨주고 제품과 보너스점수가 저장된다.
		// 1000-100으로 잔돈이 업데이트 되고, 보너스점수가 추가 된다.
		// 제품의 toString 오버라이딩 된 문구가 출력된다.
		b.buy(new Tv2());
		
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	} 
}
