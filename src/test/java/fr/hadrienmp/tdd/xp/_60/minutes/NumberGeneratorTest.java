package fr.hadrienmp.tdd.xp._60.minutes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NumberGeneratorTest {
	@Test
	public void should_return_two() {
		int number = new NumberGenerator().getNumber();
		assertThat(number).isEqualTo(2);
	}
}
