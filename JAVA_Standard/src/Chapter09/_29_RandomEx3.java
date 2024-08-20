package Chapter09;

import java.util.Arrays;

public class _29_RandomEx3 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(getRand(5, 10) + ","); // 1~5난수발생 + 5 ==> 6~10 범위 난수 발생
		} // for문 끝.
		System.out.println();
		
		int[] result = fillRand(new int[10], new int[]{2, 3, 7, 5});
		
		System.out.println(Arrays.toString(result));
	} // main 끝.
	
	public static int[] fillRand(int[] arr, int from, int to) { // 메서드 오버로딩
		for(int i = 0; i < arr.length; i++) {
			arr[i] = getRand(from, to);
		}
		return arr;
	} // fillRand() 메서드 끝.
	
	public static int[] fillRand(int[] arr, int[] data) { // {10, 4}
		for(int i = 0; i < arr.length; i++) { // 0~9
			
			// getRand(0, 3), 0~3사이 난수를 발생시켜, data의 index로 사용한다.
			// 그리고 arr배열에 값을 저장한다.
			arr[i] = data[getRand(0, data.length-1)];
		}
		return arr;
	} // fillRand() 메서드 끝.
	
	public static int getRand(int from, int to) {
		// 0, 3 ==> Math.random() * (3-0+1) + 0 ==> 0~3 난수 발생
		return (int)(Math.random() * (Math.abs(to-from) + 1)) + Math.min(from, to);
	} // getRand() 메서드 끝.
}