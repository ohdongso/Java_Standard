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
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			
			while(sc2.hasNextInt()) {
				sum += sc.nextInt(); // int를 한 줄씩 입력받음
			}
			System.out.println(line + ", sum = " + sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line: " + cnt + ", Total: " + totalSum);
	} // main 끝
}