package Chapter07;

public class _16_CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car(); // 부모클래스 객체생성
		Car car2 = null; // 부모클래스 타입 변수 선언
		FireEngine fe = null; // 자식클래스 타입 변수 선언
		
		car.drive(); // 부모클래스 메서드 호출
		
		/*
		 	8번째 줄. 컴파일은 OK. 실행 시 에러가 발생
		 	"부모타입의 참조변수"를 "자식타입의 참조변수"로 형변환
		 	"부모타입"의 인스턴스를 "자식타입"의 참조변수로 참조하는 것은 허용되지 않는다.
		 	위의 예제에세 "Car car = new Car();"를 "Car car = new FireEngine();"와
		 	같이 변경하면, 컴파일할 때 뿐만 아니라 실행할 때도 에러가 발생하지 않는다.
		 	
		 	서로 상속관계에 있는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있으나, 참조변수가 가리키는 인스턴스의
		 	자손타입으로 형변환은 허용되지 않는다.
		 	그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인하는 것이 중요하다.
		 */
		fe = (FireEngine)car; 
		
		
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}