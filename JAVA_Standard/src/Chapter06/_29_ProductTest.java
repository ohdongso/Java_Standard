package Chapter06;

class Product {
	// 클래스 내부의 클래스 변수는 객체를 생성하지 않아도 로딩될때 생성된다.
	// 그리고 고유한 변수이다. 객체를 여러번 생성한다고 해서 각 객체마다 다른 count변수가 생기는게 아니다.
	static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수
	
	int serialNo; // 인스턴스 고유의 번호
	
	// 인스턴스 블럭 초기화
	// 객체가 생성 될 때 마다 아래 구문이 실행된다.
	{
		++count;
		serialNo = count;
	}
	
	// 기본생성자, 생략가능
	public Product() {} 
	
} // Product 클래스 끝.

public class _29_ProductTest {
	
	public static void main(String[] args) {
		System.out.println(Product.count);
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
	
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
	}
}