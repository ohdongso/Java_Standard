package Chapter09;

import java.util.StringTokenizer;

public class _39_StringTokenizerEx2 {
	/*
		StringTokenizer는 단 한 문자의 구분자만 사용할 수 있기 때문에
		"+-*'/=()" 전체가 하나의 구분자가 아니라 각각의 문자가 모두 구분자라는 것에 주의해야한다.
	 */
	public static void main(String[] args) throws Exception {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		} // while문 끝.
	} // main 끝
}