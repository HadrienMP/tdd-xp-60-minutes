package fr.hadrienmp.tdd.xp._60.minutes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NumberGeneratorTest {
	@Test
	public void should_return_even_number() {
		int number = new NumberGenerator().getNumber();
		assertThat(number % 2).isEqualTo(0);
	}
	
	@Test
	public void should_return_a_number_greater_than_9() throws Exception {
		int number = new NumberGenerator().getNumber();
		assertThat(number).isGreaterThan(9);
	}
}
