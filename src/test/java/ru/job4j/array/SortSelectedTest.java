package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf3() {
        int[] data = new int[] {5, 7, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf5() {
        int[] data = new int[] {5, 7, 12, 3, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 5, 7, 8, 12};
        assertThat(result).containsExactly(expected);
    }
}