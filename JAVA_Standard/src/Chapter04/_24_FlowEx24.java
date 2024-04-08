package Chapter04;

public class _24_FlowEx24 {

	public static void main(String[] args) {
		int i = 11;
		System.out.println("카운트 다운을 시작합니다.");
		while(i-- != 0) {
			
			System.out.println(i); // 10,9,8,7,6,5,4,3,2,1,0
			
			for(int j = 0; j < 2_000_000_000; j++) {
				;
			}// for문 끝.
			
		} // while문 끝.
		
		System.out.println("GAME OVER");
		
	} // main 메서드 끝.
}