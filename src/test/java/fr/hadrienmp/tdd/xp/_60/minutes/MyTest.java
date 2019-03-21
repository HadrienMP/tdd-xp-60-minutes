package fr.hadrienmp.tdd.xp._60.minutes;

import number.NumberGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyTest {

    private NumberGenerator numberGenerator;

    @Before
    public void setUp() throws Exception {
        numberGenerator = new NumberGenerator();
    }

    @Test
    public void itGeneratesEvenNumber() {
        Assert.assertTrue(numberGenerator.generateEvenNumber() % 2 == 0);
    }
}
