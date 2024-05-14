package Chapter07;

public class _08_PointTest2 {
	
	public static void main(String[] args) {
		Point3D1 p3 = new Point3D1(); // Point3D1객체를 생성하면 Point2 부모 클래스 내용까지 사용가능 
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point2 {
	int x = 10;
	int y = 20;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D1 extends Point2 {
	int z = 30;
	
	// "기본생성자"를 호출하면 "매개변수3개"인 생성자를 호출한다.
	Point3D1() {
		this(100, 200, 300); // Point3D(int x, int y, int z)를 호출한다.
	}
	
	// (x, y)는 부모클래스의 매개변수 2개인 생성자를 호출해서 값을 저장한다.
	// (z)는 내부 멤버변수에 값을 저장한다.
	Point3D1(int x, int y, int z) {
		super(x, y); // Point(int x, int y)를 호출한다.
		this.z = z;
	}
}