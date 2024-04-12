package Chapter05;

public class _07_ArrayEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 배열을 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		/*
			1, 0~9사이의 임의의 숫자 n을 구해준다.
			2, numArr[0]에 숫자를 tmp변수에 담아준다.
			3, numArr[n]에 숫자를 numArr[0]에 담아준다.
			4, tmp에 있는 숫자를 numArr[n]에 담아준다.
			5, 
			
			임의의 값 n을 입력받는다.
			index 0에 해당하는 값을 tmp변수에 담는다.
			index n에 해당하는 값을 index 0에 넣는다.
			tmp변수에 있는 값을 index n에 넣는다.
			==> 이과정을 반복하고 있다.
			
			이 알고리즘은 0~9숫자카드를 index를 활용해 자리만 변경하는 것이다.
			n이 동일한 숫자가 나왔으면 중복숫자가 발생하는 것이 아니라 숫자카드 위치가 변경된게 다시 원상태로 돌아왔다 생각하면 된다.
			마지막으로 정리하면, 0~9 숫자카드는 고정되고 n번째 카드와 첫번째 카드 위치를 계속 바꿔주는 것이라고 생각하면된다.
		*/
		
		for(int i = 0; i < 10; i++) {
			int n = (int)(Math.random() * 10); // 0~9중 한 값을 임의로 얻는다.
			System.out.println("n : " + n);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
 		for (int i = 0; i < numArr.length; i++) {
 			System.out.print(numArr[i]);
 		}
	} // main의 끝
}