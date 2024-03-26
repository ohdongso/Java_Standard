package Chapter03;

import java.util.Scanner;

public class _25_OperatorEx25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0); // 10의 자리를 입력 받더라도 index 0번지 값만 들고 오기때문에 숫자로 판별
		
		System.out.println(ch);
		System.out.println('0' + ", " + '9'); // 0, 9
		System.out.println((int)'0' + ", " + (int)'9'); // 48, 57
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	}
}