package bsu.tasks.triangle;

import by.bsu.tasks.triangle.TriangleCheck;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTriangleCheck {
    @Test
    public void isTriangleTestPositive() {
        Assert.assertTrue(TriangleCheck.isTriangle(5, 6, 7));
    }

    @Test
    public void isTriangleTestNegative() {
        Assert.assertFalse(TriangleCheck.isTriangle(2, 6, 1));
    }

    @Test
    public void isTriangleTestRectangular() {
        Assert.assertTrue(TriangleCheck.isTriangle(3, 4, 5));
    }

    @Test
    public void isTriangleTestEquilateral() {
        Assert.assertTrue(TriangleCheck.isTriangle(10, 10, 10));
    }

    @Test
    public void isTriangleTestIsosceles() {
        Assert.assertTrue(TriangleCheck.isTriangle(10, 10, 5));
    }

    @Test
    public void isTriangleTestZeroInNumbers() {
        Assert.assertFalse(TriangleCheck.isTriangle(2, 6, 0));
    }

    @Test
    public void isTriangleTestNegativeNumbers() {
        Assert.assertFalse(TriangleCheck.isTriangle(2, 6, -5));
    }

    @Test
    public void isTriangleTestAllZero() {
        Assert.assertFalse(TriangleCheck.isTriangle(0, 0, 0));
    }

    @Test
    public void isTriangleTestAllNegative() {
        Assert.assertFalse(TriangleCheck.isTriangle(-3, -4, -5));
    }

    @Test
    public void isTriangleTestTwoEqual() {
        Assert.assertFalse(TriangleCheck.isTriangle(1, 1, 2));
    }
}
