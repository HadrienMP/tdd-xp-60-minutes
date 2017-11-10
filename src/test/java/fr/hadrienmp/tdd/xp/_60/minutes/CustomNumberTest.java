package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomNumberTest {
    private int number = CustomNumber.get();

    @Test
    void is_even() {
        assertThat(number % 2).isEqualTo(0);
    }

    @Test
    void ends_by_2() {
        assertThat(number % 10).isEqualTo(2);
    }

    @Test
    void is_bigger_than_9() {
        assertThat(number).isGreaterThan(9);
    }

    @Test
    void is_lower_than_100() {
        assertThat(number).isLessThan(100);
    }

    @Test
    void the_sum_of_its_digits_is_6() {
        assertThat(number / 10 + number % 10).isEqualTo(6);
    }
}
