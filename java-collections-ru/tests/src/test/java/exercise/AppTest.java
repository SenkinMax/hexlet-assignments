package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> numbers;

    @BeforeEach
    void initList() {
        this.numbers = new ArrayList<>();
        this.numbers.add(1);
        this.numbers.add(2);
        this.numbers.add(3);
        this.numbers.add(4);
        this.numbers.add(5);
        this.numbers.add(6);
        this.numbers.add(7);
        this.numbers.add(8);
        this.numbers.add(9);
        this.numbers.add(10);
    }

    @Test
    void testTake() {
        // BEGIN
        List<Integer> actual = App.take(numbers, 4);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        Assertions.assertEquals(actual, expected);
        // END
    }
}
