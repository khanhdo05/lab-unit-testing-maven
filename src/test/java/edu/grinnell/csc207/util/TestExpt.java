package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TestExpt {
  @Test
  void testBasic() {
    assertEquals(1024, SampleMethods.expt(2, 10), "1K");
  }
  @Test
  void testExponentBase2Loop() {
    int expected = 1;
    for (int k = 0; k < 100; k++) {
      assertEquals(expected, SampleMethods.expt(2, k), "Testing power of 2 to the " + k);
      expected *= 2;
    }
  }

  @Test
  void testExtremeBaseCase() {
    assertEquals(1000000, SampleMethods.expt(1000, 2), "Testing power of 1000 to the 2");
  }

  @Test
  void testExponentBase1Loop() {
    for (int k = 0; k < 100; k++) {
      assertEquals(1, SampleMethods.expt(1, k), "Testing power of 1 to the " + k);
    }
  }

  @Test
  void testExponentPowerOf1Loop() {
    for (int k = 0; k < 100; k++) {
      assertEquals(k, SampleMethods.expt(k, 1), "Testing power of " + k + " to the power of 1");
    }
  }

  @Test
  void testExponentPower0() {
    for (int k = 0; k < 100; k++) {
      assertEquals(1, SampleMethods.expt(k, 0), "Testing power of " + k + " to the power of 0");
    }
  }

  @Test
  void testExponentBase0() {
    for (int k = 0; k < 100; k++) {
      if (k == 0) {
        assertEquals(1, SampleMethods.expt(0, k), "Testing power of " + 0 + " to the power of " + k);
    }
       else {
        assertEquals(0, SampleMethods.expt(0, k), "Testing power of " + 0 + " to the power of " + k);
      }
    }
  }
}
