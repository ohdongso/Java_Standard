package Chapter06;

public class _28_StaticBlockTest {
	static int[] arr = new int[10]; // 클래스 변수는 클래스 블럭에서 초기화 가능하다.
	
	static { // 클래스 변수 초기화
		for(int i = 0; i < arr.length; i++) {
			// 1과 10사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i]);
		}
	}
}