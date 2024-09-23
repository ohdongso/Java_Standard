package Chapter10;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		Calendar sDay = Calendar.getInstance();
		sDay.set(2024, 7, 1);
		// sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
		System.out.println(Calendar.DATE-sDay.get(Calendar.DAY_OF_WEEK) + 1);
		System.out.println(sDay.get(Calendar.DATE));
		System.out.println(sDay.get(Calendar.DAY_OF_WEEK));
	}
}