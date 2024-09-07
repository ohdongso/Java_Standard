package Chapter09;

import java.util.StringTokenizer;

public class _42_StringTokenizerEx5 {
	/*
		구분자를 ','로 하는 문자열 데이터를 String클래스의 split()와 StringSokenizer로 잘라낸 결과를
		비교하는 예제이다. 실행결과를 보면, split()은 빈 문자열도 토큰으로 인식하는 반면
		StringTokenizer는 빈 문자열을 토큰으로 인식하지 않기 때문에 인식하는 토큰의 개수가 서로 다른 것을 알 수 있다.
	 */
	public static void main(String[] args) throws Exception {
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "|");
		}
		
		System.out.println("개수:" + result.length);
		
		int i = 0;
		for(;st.hasMoreTokens();i++) {
			System.out.print(st.nextToken() + "|");	
		}
		
		System.out.println("개수:" + i);
	} // main 끝
}