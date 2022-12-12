import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalendarTest {

	@ParameterizedTest
	@ValueSource(ints = { 1968, 2000, 1920, 1992, 1964 })
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
		// Implement
		Calendar calendar = new Calendar(year);
		GregorianCalendar cal = new GregorianCalendar();
		boolean exceptedResult = cal != null;
		boolean actualResult = calendar.isLeapYear();
		assertEquals(exceptedResult, actualResult);

	}

	@ParameterizedTest
	@ValueSource(ints = { 1899, 1700, 1600, 1500, 1000 })
	public void Should_check_if_range_acceptable(int year) {
		Calendar calendar = new Calendar(year);
		boolean exceptedResult = false; 
		boolean actualResult = calendar.isAcceptable();
		assertEquals(exceptedResult, actualResult);
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 2001, 2100, 2200, 2700 , 2010})
	public void Check_if_acceptable(int year) {
		Calendar calendar = new Calendar(year);
		boolean excpectedResult = false;
		boolean actualResult = calendar.isAcceptable();
		assertEquals(excpectedResult, actualResult);
	}

	
}
