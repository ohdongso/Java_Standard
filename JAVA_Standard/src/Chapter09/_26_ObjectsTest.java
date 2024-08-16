package Chapter09;

import java.util.*;
import static java.util.Objects.*; // Objects클래스의 메서드를 static import

public class _26_ObjectsTest {

	public static void main(String[] args) {
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA", "BBB"}}; // 2행 2열
		String[][] str2D_2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.print("str2D	={");
		for(String[] tmp : str2D) { // 행이 추출된다.
			System.out.print(Arrays.toString(tmp)); // 추출된 행 배열을 출력한다.
		} // for문 끝.
		System.out.println("}");
		
		System.out.print("str2D_2={");
		for(String[] tmp : str2D_2) {
			System.out.print(Arrays.toString(tmp));
		}
		System.out.println("}");
		
		System.out.println("equals(str2D, str2D_2)=" + Objects.equals(str2D, str2D_2));
		System.out.println("deepEquals(str2D, str2D_2)=" + Objects.deepEquals(str2D, str2D_2));
		
		System.out.println("isNull(null)  =" + isNull(null));
		System.out.println("nonNull(null) =" + nonNull(null));
		System.out.println("hashCode(null)=" + Objects.hashCode(null));
		System.out.println("toString(null)=" + Objects.toString(null));
		System.out.println("toString(null, \"\")=");
		
		Comparator c = String.CASE_INSENSITIVE_ORDER; // 대소문자 구분 안하는 비교
		
		System.out.println("compare(\"aa\",\"bb\")=" + compare("aa", "bb", c));
		System.out.println("compare(\"bb\",\"aa\")=" + compare("bb", "aa", c));
		System.out.println("compare(\"bb\",\"AB\")=" + compare("ab", "AB", c)); // 대소문자를 구분하지지 않고 문자열 비교
	} // main 끝.
}