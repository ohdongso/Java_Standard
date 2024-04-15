package Chapter05;

public class _11_ArrayEx11 {
	
	// 입력받은 임의의 숫자에 해당하는 counter배열을 자릿수 카운터를 +1씩 해주는 알고리즘.
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 배열에 저장.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		// 0~9까지 numArr배열에서 임의의 숫자값을 counter의 index값으로 사용하면서 +1씩 해준다.
		for(int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	} // main의 끝.
}