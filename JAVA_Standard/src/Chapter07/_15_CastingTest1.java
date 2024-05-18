package Chapter07;

public class _15_CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water(); // 자식객체 메서드 호출
		
		/*
		 	1, car = (Car)fe;에서 형변환이 생략된 형태다. ==> Car형태만으로는 자식 클래스 메소드를 호출 할수 없다.
		 	2, fe 인스턴스는 그대로 지만, car에 담길 때 형변환만 일어나서 담긴 것이다.
		 */
		car = fe;

//		car.water; 컴파일 에러!!! Car타입의 참조변수로는 water()를 호출할 수 없다.
		
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입
		fe2.water(); // 자손타입으로 변환된 조상타입은 결과적으로 자손타입이기 떄문에 자손타입의 메소드 호출가능
	}
}

class Car {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}