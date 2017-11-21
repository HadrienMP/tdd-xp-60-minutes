package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    @Test
    public void number_is_pair() {
        PairNumberGenerator pairNumberGenerator = new PairNumberGenerator();
        Assert.assertTrue(pairNumberGenerator.generateNumber()%2==0);
    }
}
