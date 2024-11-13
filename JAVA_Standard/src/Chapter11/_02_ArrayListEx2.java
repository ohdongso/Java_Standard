package Chapter11;

import java.util.ArrayList;
import java.util.List;

public class _02_ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 10; // 자르고자 하는 글자의 개수를 지정한다.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length(); // ==> 43
		// System.out.println("length : " + length);
		// System.out.println("length/LIMIT + 10 : " + (length/LIMIT + 10));
		List list = new ArrayList(length/LIMIT + 10); // 크기를 약간 여유 있게 잡는다. ==> 14
		
		for(int i = 0; i < length; i += LIMIT) { // 0, 10, 20, 30, 40
			/*
			 	if문
				0  + 10 < 43
				10 + 10 < 43
				20 + 10 < 43
				30 + 10 < 43
				else문
				40 + 10 < 43
			 */
			if(i + LIMIT < length) {
				/*
				 	0  ~ 10(9)
				 	10 ~ 20(19)
				 	20 ~ 30(29)
				 	30 ~ 40(39)
				 */
				list.add(source.substring(i, i + LIMIT));
			} else {
				/*
				 	40 ~ 끝까지
				 */
				list.add(source.substring(i));
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	} // main() 끝.
}