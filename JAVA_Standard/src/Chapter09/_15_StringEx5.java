package Chapter09;

import java.util.StringJoiner;

public class _15_StringEx5 {
	/*	
	 	getBytes(String charsetName)를 사용하면, 문자열의 문자 인코딩을 다른 인코딩으로 변경할 수 있다.
	 	자바가 UTF-16을 사용하지만, 문자열 리터럴에 포함되는 문자들은 OS의 인코딩을 사용한다.
	 	한글 윈도우즈의 경우 문자 인코딩으로 CP949를 사용하며, UTF-8로 변경하려면, 아래와 같이 한다.
	 	
	 	String.format()은 형식화된 문자열을 만들어내는 간단한 방법이다. printf()하고 사용법이 완전히 똑같다.
	 */
	public static void main(String[] args) throws Exception {
		String str = "가";
		
		byte[] bArr = str.getBytes("UTF-8"); // 문자열을 UTF-8로 변환
		byte[] bArr2 = str.getBytes("CP949"); // 문자열을 CP949로 변환
		
		System.out.println("UTF-8:" + joinByteArr(bArr)); // 인코딩한 문자열 배열을 구분자를 기준으로 출력
		System.out.println("CP949:" + joinByteArr(bArr2)); // 인코딩한 문자열 배열을 구분자를 기준으로 출력
		
		System.out.println("UTF-8:" + new String(bArr, "UTF-8")); // byte배열을 문자열로 변환
		System.out.println("CP949:" + new String(bArr2, "CP949")); // byte배열을 문자열로 변환
		
	} // main 끝.
	static String joinByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":", "[", "]"); // 문자배열을 연결하는 라이브러리
		
		for(byte b : bArr) {
			sj.add(String.format("%02X", b));
		}
		
		return sj.toString();
	}
}