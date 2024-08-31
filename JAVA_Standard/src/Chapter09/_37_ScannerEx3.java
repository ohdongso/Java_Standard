package Chapter09;

import java.io.File;  
import java.util.Scanner;

public class _37_ScannerEx3 {
	/*
		
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:\\Users\\ehdth\\OneDrive\\바탕 화면\\data3.txt"));
		int cnt = 0;
		int totalSum = 0;
		
		while (sc.hasNextInt()) { // Scanner 객체에 입력값이 int값일 때만 true를 반환
			String line = sc.nextLine(); // 한 줄을 입력받는다.
			Scanner sc2 = new Scanner(line).useDelimiter(","); // 구분자를 기준으로 숫자를 구분한다.
			int sum = 0;
			
			while(sc2.hasNextInt()) { // 각각의 숫자를 뽑아내서 누적한다.
				sum += sc2.nextInt();
			}
			System.out.println(line + ", sum = " + sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line: " + cnt + ", Total: " + totalSum);
	} // main 끝
}