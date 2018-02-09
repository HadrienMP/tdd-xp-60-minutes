package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorShouldGenerate {

    @Test
    public void evenNumber() {
        int number = NumberGenerator.generate();
        assertThat(number % 2).isEqualTo(0);
    }

    @Test
    public void numberEndsWith2() {
        int number = NumberGenerator.generate();
        assertThat(number % 10).isEqualTo(2);
    }

    @Test
    public void numberBiggerThan9() {
        int number = NumberGenerator.generate();
        assertThat(number).isGreaterThan(9);
    }

    @Test
    public void numberLowerThan100() {
        int number = NumberGenerator.generate();
        assertThat(number).isLessThan(100);
    }

    @Test
    public void numberSumOfDigitsEquals6() {
        int number = NumberGenerator.generate();
        int sumOfDigits = number / 10 + number % 10;
        assertThat(sumOfDigits).isEqualTo(6);
    }
}
