package Chapter07;

import java.util.*; // Vector클래스를 사용하기 위해서 추가해 주었다.

class Product2 {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2() {} // 기본생성자
}

class Tv4 extends Product2 {
	Tv4() { super(100); } // 조상클래스의 생성자 Product(int price)를 호출한다.
	public String toString() { return "Tv4"; }
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	public String toString() { return "Computer2"; }
}

class Audio1 extends Product2 {
	Audio1() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 { // 고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스점수
	Vector<Product2> item = new Vector<Product2>(); // 구입한 제품을 저장하는데 사용될 Vector객체
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		item.add(p); // 구입한 제품을 Vector에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product2 p) { // 구입한 제품을 환불한다.
		if(item.remove(p)) { // 제품을 Vector에서 제거한다.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() { // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0; // 구입한 물품의 가격합계
		String itemList = ""; // 구입한 물품목록
		
		if(item.isEmpty()) { // Vector가 비어있는지 확인한다.
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		// 반복문을 이용해서 구입한 물픔의 총 가격과 목록을 만든다.
		for(int i = 0; i < item.size(); i++) {
			Product2 p = (Product2)item.get(i); // Vector의 i번째에 있는 객체를 얻어온다.
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
			
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class _23_PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv4 tv = new Tv4();
		Computer2 com = new Computer2();
		Audio1 audio = new Audio1();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	} 
}