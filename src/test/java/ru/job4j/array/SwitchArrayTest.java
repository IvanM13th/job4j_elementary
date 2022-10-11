package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {7, 2, 4, 8, 12, 17};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 2, 12, 8, 4, 17};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {7, 2, 4, 8, 12, 17};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 12, 4, 8, 2, 17};
        assertThat(result).containsExactly(expected);
    }
}