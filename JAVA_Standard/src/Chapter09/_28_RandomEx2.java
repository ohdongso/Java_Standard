package Chapter09;

import java.util.Random;

public class _28_RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[100];
		
		for(int i = 0; i < number.length; i++) {
//			System.out.print(number[i] = (int)(Math.random() * 10));
//			0 <= x < 10 범위의 정수 x를 반환한다.
			System.out.print(number[i] = rand.nextInt(10)); // 0~9 범위의 정수를 반환한다.
		}
		System.out.println();
		
		for(int i = 0; i < number.length; i++) {
			counter[number[i]]++; // index(i)에 해당하는 카운트를 +1씩 해준다.
		}
		
		for(int i = 0; i < counter.length; i++) { // 0~99까지 반복
			System.out.println(i + "의 개수 :" + printGraph('#', counter[i]) + " " + counter[i]); // #과 카운팅 숫자 출력
		}
	} // main 끝.
	
	public static String printGraph(char ch, int value) { // #, 0~99 사이 숫자의 카운팅 
		char[] bar = new char[value]; // #과, index에 해당하는 count 숫자
		
		for(int i = 0; i < bar.length; i++) { // 카운팅 숫자만큼 반복
			bar[i] = ch; // 카운팅 숫자만큼 bar배열에 #저장
		}
		
		return new String(bar); // 문자열로 치환
	}
}