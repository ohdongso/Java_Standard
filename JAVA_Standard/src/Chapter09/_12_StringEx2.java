package Chapter09;

public class _12_StringEx2 {
	/*	
	 	자바 소스ㅏ일에 포함된 모든 문자열 리터럴은 컴파일 시에 클래스 파일에 저장된다.
	 	이때 같은 내용의 문자열 리터럴은 한번만 저장된다. 문자열 리터럴도 String인스턴스이고,
	 	한번 생성하면 내용을 변경할 수 없으니 하나의 인스턴스를 공유하면 되기 때문이다.
	 */
	public static void main(String[] args) throws Exception{
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		String s4 = "BBB";
	}
}