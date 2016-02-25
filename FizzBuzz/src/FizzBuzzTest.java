import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("1",fizzBuzz.fizz(1));
	}
	
	@Test
	public void whenFizzBuzzIsPassedATwoItReturnsATwo(){
		
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("2", fizzBuzz.fizz(2));
		
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz(){
		
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.fizz(3));
		assertEquals("Fizz", fizzBuzz.fizz(6));
	}
	
	@Test
	public void whenFizzBuzzisPassesdMultipleofFiveItReturnsBuzz(){
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.fizz(5));
		assertEquals("Buzz", fizzBuzz.fizz(5));
		
	}
	
	@Test
	public void whenFizzBuzzisPassedMultipleofThreeAndFiveItReturnsFizzBuzz(){
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("FizzBuzz", fizzBuzz.fizz(15));
		assertEquals("FizzBuzz", fizzBuzz.fizz(30));

		
	}
	
	

}
