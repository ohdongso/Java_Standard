package Chapter09;

import java.util.regex.*;

public class _34_RegularEx4 {
	/*
		
	 */
	public static void main(String[] args) {
		String source = "A broken hand works, but not a broken heart.";
		String pattern = "broken";
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		System.out.println("source:" + source);
		
		int i = 0;
		
		while(m.find()) {
			// broken이 시작되는 index(2)와 종료되는 index(8) 반환
			System.out.println(++i + "번째 매칭:" + m.start() + "-" + m.end());
			// broken을 drunken으로 치환하여 sb에 저장한다.
			m.appendReplacement(sb, "drunken");
		} // while문 끝.
		
		// 치환되면, 문자열이 끊기는데 "appendTail" 함수를 이용해서 문자열을 이어준다.
		m.appendTail(sb);
		System.out.println("Replacement count : " + i);
		System.out.println("result:" + sb.toString());
	} // main 끝
}