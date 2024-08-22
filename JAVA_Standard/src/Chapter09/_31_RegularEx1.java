package Chapter09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _31_RegularEx1 {
	/*
	 	1, 정규식을 매개변수로 Pattern클래스의 static메서드인 Pattern compile(String regex)
	 	을 호출하여 Pattern 인스턴스를 얻는다.
	 	
	 	2, 정규식으로 비교할 대상을 매개변수로 Pattern클래스의 Matcher matcher를 호출해서 Matcher인스턴스를 얻는다.
	 	
	 	3, Matcher인스턴스에 boolean matches()를 호출해서 정규식에 부합하는지 확인한다.
	 */
	public static void main(String[] args) {
		String[] data = {"bat", "bonus", "cA", "ca", "co", "c.",
				"c0", "car", "combat", "count", "date", "disc"};
		
		Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자영단어
		
		for(int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]); // 배열에서 정규식에 매칭되는 값을 받아온다.
			if(m.matches()) { // 매칭된 값을 출력한다.
				System.out.print(data[i] + ","); 
			}
		} // for문 끝.
	} // main 끝
}