package Chapter09;

class Point implements Cloneable {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone(); // clone()은 반드시 예외처리를 해주어야 한다.
		} catch (CloneNotSupportedException e) {}
		
		return obj;
	}
}

public class _07_CloneEx1 {
	/*	
	 	Cloneable인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다.
	 	이 인터페이스를 구현하지 않고 clone()을 호출하면 예외가 발생한다.
	 	
	 	clone()을 사용하려면, 먼저 복제할 클래스가 Cloneable인터페이스를 구현해야하고,
	 	clone()을 오버라이딩하면서 접근 제어자를 protected에서 public 변경한다.
	 	그래야만 상속관계가 없는 다른 클래스에서 clone()을 호출 할 수 있다.
	 */
	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone(); // 복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
	}
}