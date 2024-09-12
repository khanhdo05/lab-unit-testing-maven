package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  public void test2() {
    assertEquals(10, 3*5, "stupid test");  } // test2()

  @Test
  void testConvert0CelciusTo32Far() {
    assertEquals(32, SampleMethods.c2f(0), "0 C is 32 F");
  }

  @Test
  void testConvert100CelciusTo212Far() {
    assertEquals(212, SampleMethods.c2f(100), "100 C is 212 F");
  }
} // class TestSampleMethods
