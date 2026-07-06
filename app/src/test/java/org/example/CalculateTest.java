package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testGetIndividualFeeUnder13() {
    Calculate calculate = new Calculate();
    int expected = 1000;
    assertEquals(expected, calculate.getIndividualFee(10));
  }

  @Test
  public void testGetIndividualFeeOver13() {
    Calculate calculate = new Calculate();
    int expected = 2000;
    assertEquals(expected, calculate.getIndividualFee(25));
  }

  @Test
  public void testGetTotalFeeNoDiscount() {
    Calculate calculate = new Calculate();
    int expected = 1000;
    assertEquals(expected, calculate.getTotalFee(10, 1));
  }

  @Test
  public void testGetTotalFeeDiscount() {
    Calculate calculate = new Calculate();
    int expected = 18000;
    assertEquals(expected, calculate.getTotalFee(25, 10));
  }

}
