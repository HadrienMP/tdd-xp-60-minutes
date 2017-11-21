package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.Assert;
import org.junit.Test;

public class PairNumberGeneratorTest {

    private final PairNumberGenerator pairNumberGenerator = new PairNumberGenerator();

    @Test
    public void number_is_pair() {
        Assert.assertTrue(pairNumberGenerator.generateNumber()%2==0);
    }

    @Test
    public void my_number_ends_by_two() {
        Assert.assertTrue(pairNumberGenerator.generateNumber() % 10 == 2);
    }

    @Test
    public void my_number_is_greater_than_9() {
         Assert.assertTrue(pairNumberGenerator.generateNumber() > 9);
    }

    @Test
    public void my_number_is_lower_than_100() {
        Assert.assertTrue(pairNumberGenerator.generateNumber() < 100);
    }

    @Test
    public void my_the_sum_number_is_equal_to_6() {
        Assert.assertTrue(pairNumberGenerator.generateNumber() % 10 +
                pairNumberGenerator.generateNumber() / 10 == 6);
    }
}