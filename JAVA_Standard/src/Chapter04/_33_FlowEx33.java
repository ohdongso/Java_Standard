package Chapter04;

public class _33_FlowEx33 {

	public static void main(String[] args) {
		// for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i = 2; i <= 9; i++) {
			Loop2 : for(int j = 1; j <= 9; j++) {
				if(i == 9) { // i가 9면 Loop1 for문 Stop
					break Loop1;
				}
				
				if(j == 5) { // j가 5면 Loop2 for문 Stop
					break Loop2;
				}
				
//				break;
//				continue Loop1;
//				continue;
				
				System.out.println(i + "*" + j + "=" + i * j);
			} // end of for i
			System.out.println();
		} // end of Loop1
	}
}