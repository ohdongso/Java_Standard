package Chapter04;

public class _19_FlowEx19 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				for(int k = 1; k <= 3; k++) {
					count++;
					System.out.println("" + i + j + k);
				}
			}
		}
		System.out.println("count : " + count);
	} // main 메서드 끝.
}