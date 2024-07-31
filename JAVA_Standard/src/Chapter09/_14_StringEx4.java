package Chapter09;

import java.util.StringJoiner;

public class _14_StringEx4 {
	/*	
	 	join()은 여러 문자열 사이에 구분자를 넣어서 결합한다. 구분자로 문자열을 자르는
	 	split()과 반대의 작업을 한다고 생각하면 이해하기 쉽다.
	 	
	 	
	 */
	public static void main(String[] args) {
		String animals = "dong,cat,bear";
		String[] arr = animals.split(","); // 문자열을 ','을 구분자로 나눠서 배열에 저장
		
		System.out.println(String.join("-", arr)); // 배열의 문자열을 '-'로 구분해서 결합
		
		// "/"구분자를 기준으로 배열 문자열을 구분하고 처음과 마지막을 "[", "]" 2개의 구분자로 감싼다.
		StringJoiner sj = new StringJoiner("/", "[", "]"); 
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}
}