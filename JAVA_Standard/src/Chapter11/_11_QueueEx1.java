package Chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11_QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			
			try {
				// 화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) {
					continue;
				}
				
				// ==> 여기서 부터
				
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
			
		} // while문 끝.
		
	} // main() 끝.
	
	public static void sava(String input) {
		
	}
	
} // end of class