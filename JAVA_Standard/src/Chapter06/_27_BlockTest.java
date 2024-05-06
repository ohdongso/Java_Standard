package Chapter06;

public class _27_BlockTest {
	
	static { // 클래스 초기화 블럭(클래스가 메모리에 처음 로딩될 때 한번만 수행된다.)
		System.out.println("static ()");
	}
	
	{ // 인스턴스 초기화 블럭(객체가 생성 될때마다 호출 된다.) ==> 생성자보다 인스턴스 초기화 블럭이 먼저 수행되네
		System.out.println("( )");
	}
	
	public _27_BlockTest() { // 생성자는 인스턴스 초기화 블럭이 수행되고 실행된다.
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		_27_BlockTest bt = new _27_BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		_27_BlockTest bt2 = new _27_BlockTest();
	}
}