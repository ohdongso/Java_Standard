package Chapter06;

class Car1 {
	String color;    // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door;        // 문의 개수
	
	// this를 통해서 기본생성자에서 자기 클래스의 다른 생성자를 호출 할 수 있다.
	Car1() {
		this("white", "auto", 4);
	}
	
	// this를 통해서 매개변수1개를 입력받는 생성자에서 자기 클래스의 다른 생성자를 호출 할 수 있다.
	Car1(String color) {
		this(color, "auto", 4);
	}
	
	Car1(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class _25_CarTest2 {
	
	public static void main(String[] args) {
		// 객체생성후 Car1의 기본생성자 호출
		Car1 c1 = new Car1();

		// 객체생성후 Car1의 매개변수 1개인 생성자 호출
		Car1 c2 = new Car1("white");
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);		
	} // main의 끝.
}