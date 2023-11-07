package de.telran;


import org.junit.jupiter.api.*;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class CalculatorTest {
    private long beforeStart;

    @BeforeEach
    public void setUp() throws Exception {
        beforeStart = System.currentTimeMillis();
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println(System.currentTimeMillis() - beforeStart);
    }

    @Test
    public void addTwoAndThreeShouldReturnFive() {
        Calculator calculator = new Calculator();

        int expected = 5;
        int actual = calculator.add(2, 3);
        Assertions.assertEquals(expected, actual, "add method return incorrect result");
    }

    @Test
    public void addMinusOneAndMinusThreeShouldReturnMinusFour() {
        Calculator calculator = new Calculator(); // prepare
        //
        if (calculator == null) {
            Assertions.fail("calculator is null, it is incorrect state");
        }
        int expected = -4;
        int actual = calculator.add(-1, -3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideForZeroShouldThrowException() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(100, 0));
    }

    @Test
    @Disabled
    public void threeMinusTwoTestShouldReturnOne() {
        Calculator calculator = new Calculator();
        Assertions.assertTimeout(Duration.of(1, ChronoUnit.SECONDS), () -> calculator.minus(3, 2));
    }

    @Test
    public void complexTest() {
        Calculator calculator = new Calculator();
        calculator.complexTest(1, 3);
    }

    @Test
    public void complexTest2() {
        Calculator calculator = new Calculator();
        calculator.complexTest(2, 5);
    }
}