package Chapter03;

public class _13_OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		
		// 수식에 변수가 있는 경우 미리 계산 불가하다. 그래서 char로 형변환해야 한다.
		// char c2 = c1 + 1; // 라인 8 : 컴파일 에러발생!!!
		
		// 라인 9 : 컴파일 에러없음 == > 리터럴 연산은 컴파일러가 미리 계산한다.
		char c2 = 'a' + 1; 
		
		System.out.println(c2);
	}
}