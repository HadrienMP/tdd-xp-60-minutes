package fr.hadrienmp.tdd.xp._60.minutes;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class NumberGeneratorShouldGenerate {

    @Test
    public void evenNumber () {
        int number = NumberGenerator.generate();
        Assertions.assertThat(number).isEqualTo(0);
    }
}
