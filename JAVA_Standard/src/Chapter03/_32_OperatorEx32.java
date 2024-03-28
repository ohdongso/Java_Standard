package Chapter03;

public class _32_OperatorEx32 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x; // x의 값이 음수면, 양수로 만든다.
		absY = y >= 0 ? y : -y; // y의 값이 음수면, 양수로 만든다.
		absZ = z >= 0 ? z : -z; // z의 값이 음수면, 양수로 만든다.
		
		// 0이 아니면 (+, -) 두개 중 선택할수 있게 해주는거다.
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-' ); // 조건 연산자를 중첩
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-' );
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-' );
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("x=%c%d%n", signY, absY);
		System.out.printf("x=%c%d%n", signZ, absZ);
	}
}