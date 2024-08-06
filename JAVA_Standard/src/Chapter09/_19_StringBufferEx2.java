package Chapter09;

public class _19_StringBufferEx2 {
	/*	
	 
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01"); // 18문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스 생성한다.
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56); // StringBuffer에 문자열을 추가해주는 함수
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0); // sb객체의 참조변수가 담겨서 9.0을 저장하면, sb에도 담긴다.
		
		System.out.println("sb =" + sb);
		System.out.println("sb2=" + sb2);
		System.out.println("sb3=" + sb3);
		
		System.out.println("sb =" + sb.deleteCharAt(10)); // index 10에 해당하면 문자열 삭제
		System.out.println("sb =" + sb.delete(3, 6)); // 시작위치부터, 끝위치에있는 문자열제거
		System.out.println("sb =" + sb.insert(3, "abc")); // 두번째 매개변수로 받은 값을 지정한 위치에 추가
		System.out.println("sb =" + sb.replace(6, sb.length(), "END")); // 지정된 범위의 문자열을, 변경한다.
		
		System.out.println("capacity=" + sb.capacity()); // 전체크기
		System.out.println("length=" + sb.length()); // 인스턴스에 저장되어 있는 문자열의 길이를 반환
	} // main 끝.
}