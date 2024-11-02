package Chapter10;

import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjuster.*;

class DayAfterTomorrow implements TemporalAdjuster {
	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);
	}
}

public class _24_NewTimeEx3 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime targetDateTime = currentDateTime;
				
		// System.out.println(currentDateTime); ==> 현재 날짜 시간
		
		p(targetDateTime.with(TemporalAdjusters.firstDayOfNextMonth())); // 다음 달의 첫 날
		p(targetDateTime.with(TemporalAdjusters.firstDayOfMonth())); // 이 달의 첫 날
		p(targetDateTime.with(TemporalAdjusters.lastDayOfMonth())); // 이 달의 마지막 날
		p(targetDateTime.with(TemporalAdjusters.firstInMonth(TUESDAY))); // 이 달의 첫번째 화요일
		p(targetDateTime.with(TemporalAdjusters.lastInMonth(TUESDAY))); // 이 달의 마지막 화요일
		p(targetDateTime.with(TemporalAdjusters.previous(TUESDAY))); // 지난 주 화요일
		p(targetDateTime.with(TemporalAdjusters.nextOrSame(TUESDAY))); // 지난 주 화요일(오늘 포함)
		p(targetDateTime.with(TemporalAdjusters.next(TUESDAY))); // 다음 주 화요일
		p(today.with(TemporalAdjusters.nextOrSame(TUESDAY))); // 다음 주 화요일(오늘 포함)
		p(today.with(TemporalAdjusters.dayOfWeekInMonth(4, TUESDAY))); // 이 달의 4번째 화요일
	}
	
	static void p(Object obj) { // 라인의 길이를 줄이기 위해 새로 정의한 메서드
		System.out.println(obj);
	}
}
