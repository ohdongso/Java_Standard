package Chapter06;

public class _12_ReferenceParamEx3 {
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr); // 배열의 모든 요소를 출력
		sortArr(arr); // 배열을 정렬
		printArr(arr); // 정렬후 결과를 출력
		System.out.println("sum=" + sumArr(arr)); // 배열의 총합을 출력
	}
	
	static void printArr(int[] arr) { // 배열의 모든 요소를 출력
		System.out.print("[");
		for(int i : arr) { // 향상된 for문
			System.out.print(i + ",");
		}
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) { // 배열의 모든 요소의 합을 반환
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static void sortArr(int[] arr) { // 배열을 오름차순으로 정렬
		
		/*
			1, i반복문은 j반복문이 반복될때 비교 끝자리를 순차적으로 줄이기 위한 변수로 사용된다.
			2, j는 j+1이랑 자동 비교되기 때문에, 최종비교는 N-1까지만 하면된다.	
			3, index는 0부터 시작하기 때문에 <=대신, <부호를 사용해서 반복문을 돌린다.
			4, 제일 끝자리가 정렬 되었기 때문에 순차적으로 i만큼 전체 회전수를 줄여준다.
			5, (2번,3번,4번)을 종합하면 ==> (j < arr.length-1-i) 해당 조건이 나온다.
		*/
		
		for(int i = 0; i < arr.length-1; i++) {
			
			// arr.length가 6이면 (4번,3번,2번,1번)으로 반복한다.
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	} // sortArr(int[] arr)
}