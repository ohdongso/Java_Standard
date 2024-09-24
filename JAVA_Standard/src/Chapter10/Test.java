package Chapter10;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		sDay.set(2024, 8, 1);
		eDay.set(2024, 8, 30);
		
		System.out.println(eDay.get(Calendar.DAY_OF_WEEK));
	}
}