package Chapter06;

class Data2 { int x; }

public class _14_ReferenceReturnEx {
	// d와 tmp는 다른 객체이지만 x멤버변수에 10을 저장했다.
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		
		Data2 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	} // main 메서드의 끝.
	static Data2 copy(Data2 d) {
		Data2 tmp = new Data2(); // Data2 클래스 타입의 새로운 객체 tmp생성
		tmp.x = d.x; // tmp객체의 x 멤버변수에 10저장
		return tmp;
	}
}