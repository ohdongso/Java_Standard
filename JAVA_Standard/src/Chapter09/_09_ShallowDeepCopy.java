package Chapter09;

import java.util.Arrays;

public class _09_ShallowDeepCopy {
	/*	
	 	clone()은 단순히 객체에 저장된 값을 그대로 복제할 뿐, 객체가 참조하고 있는 객체까지 복제하지는 않는다.
	 	기본형 배열인 경우에는 아무런 문제가 없지만, 객체배열을 clone()으로 복제하는 경우에는 원본과
	 	복제본이 같은 객체를 공유하므로 완전한 복제라고 보기는 어렵다.
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone(); // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}