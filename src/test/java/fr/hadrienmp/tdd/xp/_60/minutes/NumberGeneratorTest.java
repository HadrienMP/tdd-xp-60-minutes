package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorTest {

    private final NumberGenerator generator = new NumberGenerator();

    @Test
    public void testNumberIsEven() {
        final int number = generator.generate();

        assertThat(number % 2).isEqualTo(0);
    }

    @Test
    public void testNumberEndsBy2() {
        final int number = generator.generate();

        assertThat(String.valueOf(number)).endsWith("2");
    }

    @Test
    public void testNumberIsGreaterThan9() {
        final int number = generator.generate();

        assertThat(number).isGreaterThan(9);
    }

    @Test
    public void testNumberIsLessThan100(){
        final int number = generator.generate();

        assertThat(number).isLessThan(100);
    }

}
