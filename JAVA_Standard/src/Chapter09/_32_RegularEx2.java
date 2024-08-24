package Chapter09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _32_RegularEx2 {
	/*
		1, .* ==> 모든 문자열
		2, c[a-z]* ==> c로 시작하는 영단어
		3, c[a-z] ==> c로 시작하는 두 자리 영단어
		4, c[a-zA-z] ==> c로 시작하는 두 자리 영단어(a~z 또는 A~Z 즉 대소문자 구분안함)
		5, c[a-zA-z0-9] ==> c로 시작하고 숫자와 영어로 조합된 두 글자
		6, c. ==> c로 시작하는 두 자리 문자열
		7, c\. ==> c.와 일치하는 문자열'.'은 패턴작성에 사용되는 문자이므로 escape문자인 '\'를 사용해야 한다.
		8, 등등 507Page페이지 참고		
	 */
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bouns", "c", "cA", "ca", "co",
				"c.", "c0", "c#", "car", "combat", "count", "date", "disc"};
		
		String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-z]",
				"c[a-zA-Z0-9]","c.","c.*","c\\.", "c\\w", "c\\d",
				"c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}"};
		
		for(int x = 0; x < pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			System.out.print("Pattern : " + pattern[x] + " 결과: ");
			for(int i = 0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches()) {
					System.out.print(data[i] + ",");
				}
			} // 안쪽 for문 끝.
			System.out.println();
		} // 바깥 for문 끝.
	} // main 끝
}