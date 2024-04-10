package Chapter04;

public class _30_FlowEx30 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) { // sum이 101일때 종료된다.
				break; // if문에 맞는 조건이면 while문을 종료시킨다.
			}
			
			++i; // 1씩 증가
			sum += i; // 0 + 1 + 2 + 3.... 누적
		} // while문 끝.
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}