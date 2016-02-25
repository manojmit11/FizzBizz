import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp(){
		
		fizzBuzz=new FizzBuzz();
	}
	
	@Test
	public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
		
		assertEquals("1",fizzBuzz.fizz(1));
	}
	
	@Test
	public void whenFizzBuzzIsPassedATwoItReturnsATwo(){
		
	
		assertEquals("2", fizzBuzz.fizz(2));
		
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz(){
		
		assertEquals("Fizz", fizzBuzz.fizz(3));
		assertEquals("Fizz", fizzBuzz.fizz(6));
	}
	
	@Test
	public void whenFizzBuzzisPassesdMultipleofFiveItReturnsBuzz(){
	
		assertEquals("Buzz", fizzBuzz.fizz(5));
		assertEquals("Buzz", fizzBuzz.fizz(5));
		
	}
	
	@Test
	public void whenFizzBuzzisPassedMultipleofThreeAndFiveItReturnsFizzBuzz(){
		
		assertEquals("FizzBuzz", fizzBuzz.fizz(15));
		assertEquals("FizzBuzz", fizzBuzz.fizz(30));

		
	}
	
	

}
