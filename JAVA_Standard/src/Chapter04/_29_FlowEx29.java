package Chapter04;

public class _29_FlowEx29 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.printf("i=%d ", i);
			
			int tmp = i;
			
			do {
				
				// 3의 배수인지 확인, 0이 아닌지 확인
				if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					System.out.print("짝");
				}
				
			// tmp = tmp / 10, 369에서 3의 배수가 두번 적용되는 숫자인지 확인
			} while((tmp/=10) != 0);
			
			System.out.println();
			
		} // for문 끝.
	} // main
}