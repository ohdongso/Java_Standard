package Chapter06;

class Car3 {
	String color;    // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door;        // 문의 개수
	
	// this를 통해서 기본생성자에서 자기 클래스의 다른 생성자를 호출 할 수 있다.
	Car3() {
		this("white", "auto", 4);
	}
	
	// 인스턴스의 복사를 위한 생성자.
	Car3(Car3 c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	// 매개변수 3개 입력받는 생성자
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class _26_CarTest3 {
	
	public static void main(String[] args) {
		// 객체생성후 Car1의 기본생성자 호출
		Car3 c1 = new Car3();

		// c1의 복사본 c2를 생성한다.
		// c1 객체를 매개변수로 전달해서, c1 멤버변수값을 c2 새로운 객체의 멤버변수에 값을 대입해줬다.
		Car3 c2 = new Car3(c1);
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);	
		
		c1.door = 100; // c1의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행후");
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);	
	} // main의 끝.
}