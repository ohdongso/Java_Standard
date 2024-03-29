package Chapter03;

public class _31_OperatorEx31 {

	public static void main(String[] args) {
		int dec = 1234;
		int hex = 0XABCD;
		int mask = 0xF;
		
		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	} // main의 끝.
}