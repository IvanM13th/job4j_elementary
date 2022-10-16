package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2;
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to20Then0() {
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 0;
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to20Then1() {
        Point a = new Point(3, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 1;
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to11Then3dot16() {
        Point a = new Point(4, 0);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        double expected = 3.16;
        Assertions.assertEquals(expected, out, 0.01);
    }
}