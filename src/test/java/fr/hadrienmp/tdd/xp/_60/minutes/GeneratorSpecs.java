package fr.hadrienmp.tdd.xp._60.minutes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class GeneratorSpecs {
    
	int generatedNumber = new Generator().generate();
	
	@Test
    public void should_generate_odd_number() {
    	Boolean isPair = (generatedNumber % 2 == 0);
    	assertThat(isPair).isTrue();
    }

    @Test
	public void should_generate_number_ending_by_2() throws Exception {
    	int lastdigit = generatedNumber % 10;
		assertThat(lastdigit).isEqualTo(2);
    }
    
    @Test
    public void should_return_number_higher_than_9() {
		assertThat(generatedNumber).isGreaterThan(9);
	}
    
    @Test
    public void should_return_number_less_than_100() {
		assertThat(generatedNumber).isLessThan(100);
	}
}
