package Chapter09;

public class _17_StringEx7 {
	/*	
	 	
	 */
	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		// fullName에서 '.'의 위치를 찾는다.
		int index = fullName.indexOf('.'); // 해당 문자열의 index를 추출 ==> 5
		
		// fullName의 첫번째 글자부터 '.'이 있는 곳 전까지 까지 문자열을 추출한다.
		String fileName = fullName.substring(0, index); // 0~4 문자열 추출
		
		// '.'의 다음 문자 부터 시작해서 문자열의 끝까지 추출한다.
		// fullName.substring(index+1, fullName.length());의 결과와 같다.
		String ext = fullName.substring(index + 1); // index 6부터 끝까지 문자열을 추출한다.
		
		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext);
	} // main 끝.
}


