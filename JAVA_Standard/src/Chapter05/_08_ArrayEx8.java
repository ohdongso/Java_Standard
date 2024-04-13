package Chapter05;

public class _08_ArrayEx8 {
	
	/*
		1, 배열에는 1~45값이 순서에 맞게 저장되어 있다.
		2, (temp, j)변수 2개 선언
		3, (0~44)범위의 임의의 값을 j에 담는다.
		4, ball[0] ~ ball[5] 6개의값을 순차적으로 ball[j]에 해당하는 값과 변경해준다.
		5, 1~5까지 숫자가 ball[j]숫자와 값이 변경된다.
		6, 동일한 값이 반복될수 없는 이유는 j는 index를 뜻하기 때문에
		   j가 반복되면 변경 후 j index의 값을 가리키기 때문에 중복이 될 수 없다. 
	*/
	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성
		
		// 배열의 각 요소에 1~45의 값을 지정한다.
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // ball[0]에 1이 저장된다.
		}
		
		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45); // 0~44범위의 임의의 값을 얻는다.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}