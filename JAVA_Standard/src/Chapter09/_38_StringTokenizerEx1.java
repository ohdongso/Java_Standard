package Chapter09;

import java.util.StringTokenizer;

public class _38_StringTokenizerEx1 {
	/*
		','를 구분자로 하는 StringTokenizer를 생성해서 문자열(source)을 나누어 출력하는 예제다.
	 */
	public static void main(String[] args) throws Exception {
		String source = "100,200,300,400";
		
		// 문자열을 지정된 구분자로 나누는 StringTokenizer를 생성한다.
		StringTokenizer st = new StringTokenizer(source, ",");
		
		// 토큰이 남아 있는지 확인한다.
		while(st.hasMoreTokens()) {
			// 다음 토큰을 반환한다.
			System.out.println(st.nextToken());
		} // while문 끝.
		
	} // main 끝
}