package Chapter09;

public class _16_StringEx6 {
	/*	
	 	parseInt()나 parseFloat() 같은 메서드는 문자열에 공백 또는 문자가 포함되어 있는 경우 
	 	변환 시 예외가 발생할 수 있으므로 주의해야 한다. 그래서 문자열 양끝의 공백을 제거해주는 trim()을 습관적으로 같이 사용하기도 한다.
	 	
	 	그러나 부호를 의미하는 '+'나 소수점을 의미하는 '.'와 float형 값을 뜻하는 f와 같은 자료형 접미사는 허용 된다.
	 */
	public static void main(String[] args) throws Exception {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 변환한다.
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // double을 String으로 변환하는 또 다른 방법
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2); // 300.0
		System.out.println(sum);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2); // 300.0
		System.out.println(sum2);
		
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum); // join을 통해서 문자열 결합
		System.out.println(strVal + "+" + strVal2 + "=" + sum2); // "" 쌍따옴표로 문자열 결합
	} // main 끝.
}