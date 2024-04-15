package Chapter05;

import java.util.Arrays;

public class _13_ArrayEx13 {
	
	/*
		1, char배열에 문자형 데이터를 담는다.
		2, 2진수 4bit값이 저장된 배열을 선언한다.
		3, char에 담긴 값이 '0'~'9', '0'~'9'가 아닌경우로 조건을 비교한다.
		4, '0'~'9'인경우 ('숫자' - '0')를 통해 int형으로 형변한하고 binary(2진수배열) index값으로 사용 될 수있다.
		5, ('알파벳'-'A'+10)을 통해 int형으로 형변한하고 binary(2진수배열) index값으로 사용 될 수있다.
		6, char문자열을 new String(char문자열) 매개변수로 전달하면 
		   sysout구문에서 char배열의 값을 문자열로 출력할수있다. (최종출력)
	*/
	public static void main(String[] args) {
		// C(67), (A)65, (F)70, (E)69
		char[] hex = { 'C', 'A', 'F', 'E'};
		
		// 문자열 배열저장
		String[] binary = {
			"0000", "0001", "0010", "0011"
		   ,"0100", "0101", "0110", "0111"
		   ,"1000", "1001", "1010", "1011"
		   ,"1100", "1101", "1110", "1111"
		};
		
		String result = "";
		
		
		// 0 ~ 3 반복된다.
		for (int i = 0; i < hex.length; i++) {

			// char 배열에 저장된 값이 '0'~'9' 숫자면
			if(hex[i] >= '0' && hex[i] <= '9') { 
				System.out.println("hex[i] - '0' : " + (hex[i] - '0'));
				
				// ('숫자' - '0')를 통해 int형으로 형변한하고 binary(2진수배열) index값으로 사용 될 수있다.
				result += binary[hex[i] - '0']; // '8'-'0'의 결과는 8이다.
				
			// char 배열에 저장된 값이 '0'~'9' 숫자가 아니면
			} else { 
				System.out.println("hex[i] - 'A' + 10 : " + (hex[i] - 'A' + 10));
				
				// ('알파벳'-'A'+10)을 통해 int형으로 형변한하고 binary(2진수배열) index값으로 사용 될 수있다.
				result += binary[hex[i] - 'A' + 10]; // 'C'-'A'의 결과는 2
			}
		}
		
		
		System.out.println("hex:" + Arrays.toString(hex));
		
		// char문자열을 new String(char문자열) 매개변수로 전달하면 sysout구문에서 char배열의 값을 문자열로 출력할수있다.
		System.out.println("hex:" + new String(hex)); // String(char[] value)
		System.out.println("binary:" + result);
	}
}