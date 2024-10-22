package Chapter10;

import java.text.ChoiceFormat;

public class _17_ChoiceFormatEx2 {
	/*
		패턴은 구분자로 '#'과'<' 두 가지를 제공하는데 'limit#value'의 형태로 사용한다.
		'#'은 경계값을 범위에 포함시키지만, '<'는 포함시키지 않는다.
		위의 결과에서 90은 A지만, 80은 B가 아닌, C인 것에 주목하자.
	 */
	public static void main(String[] args) {
		String pattern = "60#D|70#C|80<B|90#A"; // 90이상이면 A, 80초과이면 B, 70이상이면 C, 60이상이면 D
		int[] scores = { 91, 90, 80, 88, 70, 52, 60 };
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
	} // main
}