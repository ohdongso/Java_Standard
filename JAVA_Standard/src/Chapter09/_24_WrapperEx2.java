package Chapter09;

public class _24_WrapperEx2 {
	/* 

	 */
	public static void main(String[] args) {
		int i = new Integer("100").intValue(); // 문자열을 숫자로 변환하는 방법
		int i2 = Integer.parseInt("100"); // 문자열을 숫자로 변환하는 방법
		Integer i3 = Integer.valueOf("100"); // 문자열을 숫자로 변환하는 방법
		
		int i4 = Integer.parseInt("100", 2); // 문자열 100이 2진법 숫자라면, 4
		int i5 = Integer.parseInt("100", 8); // 문자열 100이 8진법 숫자라면, 64
		int i6 = Integer.parseInt("100", 16); // 문자열 100이 16진법 숫자라면, 256
		int i7 = Integer.parseInt("FF", 16); // 문자열 FF를 16진법 숫자라면, 255
//		int i8 = Integer.parseInt("FF"); // NumberFormatException발생
		
		Integer i9 = Integer.valueOf("100", 2); // 문자열 100이 2진법 숫자라면, 4
		Integer i10 = Integer.valueOf("100", 8); // 문자열 100이 8진법 숫자라면, 64
		Integer i11 = Integer.valueOf("100", 16); // 문자열 100이 16진법 숫자라면, 256
		Integer i12 = Integer.valueOf("FF", 16); // 문자열 FF를 16진법 숫자라면, 255
//		Integer i13 = Integer.valueOf("FF"); // NumberFormatException발생
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println("100(2) -> " + i4);
		System.out.println("100(8) -> " + i5);
		System.out.println("100(16) -> " + i6);
		System.out.println("FF(16) -> " + i7);
		
		System.out.println("100(2) -> " + i9);
		System.out.println("100(8) -> " + i10);
		System.out.println("100(16) -> " + i11);
		System.out.println("FF(16) -> " + i12);
	} // main 끝.
}