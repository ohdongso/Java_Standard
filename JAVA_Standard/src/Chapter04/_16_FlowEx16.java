package Chapter04;

public class _16_FlowEx16 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			} // 안쪽 for문.
			System.out.println();
		} // 바깥쪽 for문.
	} // main 메서드 끝.
}