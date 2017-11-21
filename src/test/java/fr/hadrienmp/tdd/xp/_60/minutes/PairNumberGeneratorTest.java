package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.Assert;
import org.junit.Test;

public class PairNumberGeneratorTest {


    @Test
    public void number_is_pair() {
        PairNumberGenerator pairNumberGenerator = new PairNumberGenerator();
        Assert.assertTrue(pairNumberGenerator.generateNumber()%2==0);
    }


    @Test
    public void my_number_ends_by_two() {
        PairNumberGenerator pairNumberGenerator = new PairNumberGenerator();
        Assert.assertTrue(pairNumberGenerator.generateNumber() % 10 == 2);
    }
}