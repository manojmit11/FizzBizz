import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("1",fizzBuzz.fizz(1));
		assertEquals("1",fizzBuzz.fizz(1));
	}

}
