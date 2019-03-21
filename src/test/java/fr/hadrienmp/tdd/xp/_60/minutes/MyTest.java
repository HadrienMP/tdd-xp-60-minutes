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

        int number = numberGenerator.generateEvenNumber();
        String stringNumber = String.valueOf(number);
        char lastChar = stringNumber.toCharArray()[stringNumber.length() - 1];
        Assert.assertTrue(lastChar == '2');
    }
}
