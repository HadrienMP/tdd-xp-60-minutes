package fr.hadrienmp.tdd.xp._60.minutes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MyTest {
    @Test
    public void generatorShouldReturnOddValue() {
    	int myNumber = new Generator().create();
		Boolean isPair = (myNumber % 2 == 0);
    	Assertions.assertThat(isPair).isTrue();
    }
}
