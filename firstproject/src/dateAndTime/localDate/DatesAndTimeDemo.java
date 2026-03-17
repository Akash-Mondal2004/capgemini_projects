package dateAndTime.localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatesAndTimeDemo {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(10);
		
		if (futureDate.isAfter(today)) System.out.println("Future date is valid");
		
		Period period = Period.between(today, futureDate);
		System.out.println("Days between dates: " + period.getDays());

		LocalDateTime currentTimestamp = LocalDateTime.now();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("eeee, MMMM d, 'week' w, QQQQ 'of' y G, hh:mm:ss.SSS a, B");
		
//		https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html#patterns
		
		System.out.println("Formatted Date: " + today.format(dateFormatter));
		System.out.println("Formated Date-Time: " + currentTimestamp.format(dateTimeFormatter));
		
		System.out.println(period);
		System.out.println("Original date still unchanged: " + today);
		System.out.println(futureDate);
		
	}

}
