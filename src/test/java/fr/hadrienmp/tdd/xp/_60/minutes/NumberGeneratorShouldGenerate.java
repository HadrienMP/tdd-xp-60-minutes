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
}
