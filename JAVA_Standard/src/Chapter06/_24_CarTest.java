package Chapter06;

class Car {
	String color;    // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door;        // 문의 개수
	
	Car() {}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class _24_CarTest {
	
	public static void main(String[] args) {
		// 객체생성후 멤버변수에 직접 값을 대입하는 방법
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		// 객체생성후 생성자로 직접 값을 대입하는 방법
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);		
	} // main의 끝.
}