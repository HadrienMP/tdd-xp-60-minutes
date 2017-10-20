package fr.hadrienmp.tdd.xp._60.minutes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GeneratorSpecs {
    
	@Test
    public void should_generate_odd_number() {
    	int myNumber = new Generator().create();
		Boolean isPair = (myNumber % 2 == 0);
    	Assertions.assertThat(isPair).isTrue();
    }

    @Test
	public void should_generate_number_ending_by_2() throws Exception {
    	int myNumber = new Generator().create();
    	int lastdigit = myNumber % 10;
		Assertions.assertThat(lastdigit).isEqualTo(2);
    }
}
