package Chapter09;

import java.io.File;
import java.util.Scanner;

public class _36_ScannerEx2 {
	/*
		
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:\\Users\\ehdth\\OneDrive\\바탕 화면\\data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while (sc.hasNextInt()) { // Scanner 객체에 입력값이 int값일 때만 true를 반환
			sum += sc.nextInt(); // int를 한 줄씩 입력받음
			cnt++;
		}
		
		System.out.println("sum=" + sum);
		System.out.println("average=" + (double) sum/cnt);
	} // main 끝
}