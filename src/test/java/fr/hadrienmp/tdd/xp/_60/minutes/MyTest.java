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

    @Test
    public void itGeneratesNumberEndingWithTwo() {
        Assert.assertTrue(numberGenerator.generateEvenNumber() % 10 == 2);
    }

    @Test
    public void itGeneratesNumberGreaterThanNine() {
        int number = numberGenerator.generateEvenNumber();
        Assert.assertTrue(number > 9);
    }

    @Test
    public void itGeneratesNumberLowerThanOneHundred() {
        int number = numberGenerator.generateEvenNumber();
        Assert.assertTrue(number < 100);
    }
}
