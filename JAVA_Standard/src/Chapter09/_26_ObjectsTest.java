package Chapter09;

import java.util.Random;

public class _26_ObjectsTest {
	/*
		Random인스턴스 rand와 rand2가 같은 종자값(seed)을 사용하기 때문에 같은 값들을 같은 순서로 얻는 것을 확인할 수 있다.
		여러분의 컴퓨터에서도 위와 같은 실행결과를 얻을 수 있을 것이다. 같은 종자값을 갖는 Random인스턴스는 시스템이나
		실행시간 등에 관계없이 항상 같은 값은 순서로 반환할 것을 보장한다.
	*/
	public static void main(String[] args) {
		Random rand = new Random(1); // 매개변수seed를 종자값으로 하는 Random인스턴스를 생성한다.
		Random rand2 = new Random(1);
		
		System.out.println("= rand = ");
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand.nextInt());
		}
		
		System.out.println();
		System.out.println("= rand2 =");
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand2.nextInt());
		}
	} // main 끝.
}