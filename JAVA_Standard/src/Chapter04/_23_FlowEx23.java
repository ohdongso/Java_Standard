package Chapter04;

public class _23_FlowEx23 {

	public static void main(String[] args) {
		int i = 5;
		while(i-- != 0) { // 4, 3, 2, 1, 0(1에서 후위연산으로 -1이 된다음 0이 출력된다.)
			System.out.println(i + " - I can do it.");
		}
	} // main 메서드 끝.
}