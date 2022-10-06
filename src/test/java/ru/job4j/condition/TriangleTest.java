package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
        @Test
        public void whenExist() {
            double ab = 2;
            double ac = 2;
            double bc = 2;
            boolean result = Triangle.exist(ab, ac, bc);
            assertThat(result).isTrue();
        }

        @Test
        public void whenNotExist() {
        double ab = 1;
        double ac = 2;
        double bc = 3;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
        }
    }
