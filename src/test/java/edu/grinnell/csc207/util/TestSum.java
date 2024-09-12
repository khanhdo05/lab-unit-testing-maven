package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class TestSum {

@Test
void testSumPos() {
  int[] values = new int[] {1, 2, 3};
  assertEquals(6, SampleMethods.sum(values), "Testing a sum of all positives");
}

@Test
void testSumNeg() {
  int[] values = new int[] {-1, -2, -3};
  assertEquals(-6, SampleMethods.sum(values), "Testing a sum of all negatives");
}

@Test
void testSumLarge() {
  int[] values = new int[] {134, 22646, 3745, 5499, 3498};
  assertEquals(35522, SampleMethods.sum(values), "Testing a sum of some large numbers, with a longer array");
}

@Test
void testSumArray() {
  int[] values = new int[] {};
  assertEquals(0, SampleMethods.sum(values), "Testing a sum of all positives");
}
 
@Test
public void testExtremes() {
  int tmp = Integer.MAX_VALUE - 10;
  int[] values = { tmp, tmp, -tmp, -tmp };
  assertEquals(0, SampleMethods.sum(values), "extreme values");
} // testExtremes
}
