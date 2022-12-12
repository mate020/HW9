import static org.junit.Assert.*;


import org.junit.Test;


public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int excpectedResult = 2+3;
		int actualResult = calculator.add(2, 3);
		assertEquals(excpectedResult, actualResult);
		// Implement
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int expectedResult= 5-2;
		int actualResult= calculator.sub(5, 2);
		assertEquals(expectedResult, actualResult);
		// Implement
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult=5*3;
		int actualResult= calculator.multiply(5, 3);
		assertEquals(expectedResult, actualResult);
		// Implement
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		int expectedResult=10/5;
		int actualResult=  (int) calculator.divide(10, 5);
		assertEquals(expectedResult, actualResult);
	
		// Implement
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		Exception exception =assertThrows(ArithmeticException.class, () -> {
			calculator.divide(10, 0);
		});
			
		}
	}


