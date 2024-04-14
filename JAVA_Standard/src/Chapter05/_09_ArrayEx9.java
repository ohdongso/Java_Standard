package Chapter05;

import java.util.Arrays;

public class _09_ArrayEx9 {
	

	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 }; // 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		// tmp에는 0~4에 해당하는 수가 무작위로 담긴다.
		// tmp를 index번호로 사용해 10개의 임의의 수를 만든다.
		for(int i = 0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		
		// Arrays.toString함수는 배열의 값을 출력해준다.
		System.out.println(Arrays.toString(arr));
	} // main의 끝.
}