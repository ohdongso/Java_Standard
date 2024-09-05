package Chapter09;

import java.util.StringTokenizer;

public class _40_StringTokenizerEx3 {
	/*
		문자열에 포함된 데이터가 두 가지 종류의 구분자로 나뉘어져 있을 때 두 개의 StringTokenizer와
		이중 반복문을 사용해서 처리하는 방법을 보여주는 예제이다.
	 */
	public static void main(String[] args) throws Exception {
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|");
		
		while(st.hasMoreTokens()) { // "|"를 구분자로 문자열을 자른다.
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token, ","); // ","를 구분자로 문자열을 자른다.
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			} // while문 끝.
			System.out.println("------");
		} // while문 끝.
	} // main 끝
}