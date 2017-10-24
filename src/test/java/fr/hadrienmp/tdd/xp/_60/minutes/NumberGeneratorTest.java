package fr.hadrienmp.tdd.xp._60.minutes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NumberGeneratorTest {
	
	private int number;

	@Before
	public void setup() {
		number = getNumber();
	}
	
	@Test
	public void should_return_even_number() {
		assertThat(number % 2).isEqualTo(0);
	}
	
	@Test
	public void should_return_a_number_greater_than_9() throws Exception {
		assertThat(number).isGreaterThan(9);
	}
	
	@Test
	public void should_return_a_number_ending_with_two() throws Exception {
		assertThat(String.valueOf(number)).endsWith("2");
	}
	
	@Test
	public void should_return_a_number_smaller_than_100() throws Exception {
		assertThat(number).isLessThan(100);
	}
	
	private int getNumber() {
		return new NumberGenerator().getNumber();
	}
}
