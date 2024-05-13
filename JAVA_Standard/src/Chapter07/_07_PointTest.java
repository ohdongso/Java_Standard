package Chapter07;

public class _07_PointTest {
	
	/*
	 	1, this()와 마찬가지로 super() 역시 생성자이다. this()는 같은 클래스의 다른 생성자를 호출하는데 사용되지만,
	 	super()는 조상 클래스의 생성자를 호출하는데 사용된다.	 	
	 	2, 자손 클래스의 인스턴스를 생성하면, 자손의 멤버와 조상의 멤버가 모두 합쳐진 하나의 인스턴스가 생성된다.
	 	   그래서 자손 클래스의 인스턴스가 조상의 멤버가 모두 합쳐진 하나의 인스턴스가 생성된다.
	 	*3, 이 때 조상 클래스 멤버의 초기화 작업이 수행되어야 하기 때문에 자손 클래스의 생성자에서 조상 클래스의 생성자가 호출되어야 한다.
	 	
	 	4, 이와 같은 조상 클래스 생성자의 호출은 클래스의 상속관계를 거슬러 올라가면서 계속된다. 마지막으로 모든 클래스의 최고 조상인 Object
	 	   클래스까지 가서야 끝이난다.
	 	
	 	상속받은 자식클래스에서 생성자의 첫 줄을 비워부면, 부모클래스의 기본생성자를 호출한다.
	 	만약 부모클래스에서 기본생성자를 정의하지않고 매개변수2개 받는 생성자만 정의했으면
	 	자식클래스의 생성자에서 공백으로 비워두는게 아닌 부모의 매개변수2개받는 생성자를 호출해야 컴파일에러가 발생하지 않는다.
	 */
	
	public static void main(String[] args) {
//		Point3D p3 = new Point3D(1, 2, 3);
	}
}

class Point1 {
	int x, y;
	
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point1 {
	int z;
	
	Point3D(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	/*
	Point3D(int x, int y, int z) {
		// 생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 'super();'를 여기에 삽입한다.
		// 부모클래스에서 기본생성자는 존재하지 않기때문에 컴파일 에러가 발생한다.
		this.x = x;
		this.y = y;
		this.z = z;
	}
	*/
	
	String getLocation() { // 오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}