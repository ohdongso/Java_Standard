package Chapter05;


public class _10_ArrayEx10 {
	/*
		1, 버블정렬은 n개의 숫자가 있으면 n-1번만 수행되면 된다.
		2, 버블정렬은 제일 앞부터 시작해서 가장 큰수가 우측부터 저장 된다.
		3, 버블정렬은 마지막 자리부터 가장 큰수가 저장되기 때문에 (n-1-i) ==> -1씩 줄어든다.
	    4, 시작은 index 0부터, 끝의 시작은 n-1이고 한번 정렬되면  n - 1 - i 값으로 줄어든다.
	    5, changed가 true가 되지 않으면 정렬이 안료 됐기 때문에 도중에라도 종료되는 효율적인 코드다.
	*/
	public static void main(String[] args) {
		// 크기 10 배열선언
		int[] numArr = new int[10];
		
		// 0~9임의의 숫자를 배열에 저장
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.
			
			
			for(int j = 0; j < numArr.length - 1 - i; j++) {
				if(numArr[j] > numArr[j + 1]) { // 옆의 값이 적으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로
				}
			} // end for j
			
			if(!changed) { // 자리바꿈이 없으면 반복문을 벗어난다.
				break;
			}
			
			for(int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]); // 정렬된 결과를 출력한다.
			}
			System.out.println();
		} // end for i.
		
		
	} // main의 끝.
}