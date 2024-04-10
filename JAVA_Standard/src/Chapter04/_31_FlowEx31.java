package Chapter04;

public class _31_FlowEx31 {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				continue; // 조건에 맞으면 for문 증감식으로 이동한다.
			}
			
			System.out.println(i);
		} // for문 끝.
	}
}