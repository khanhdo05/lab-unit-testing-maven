package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TestRemoveBs{
   /**
   * Check that removeBs works as expected.
   */
  @Test
  public void testremoveBs() {
    assertEquals("", 
                 SampleMethods.removeBs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeBs("hello"),
                 "no bs");
    assertEquals("", 
                 SampleMethods.removeBs("b"),
                 "eliminate one b");
    assertEquals("", 
                 SampleMethods.removeBs("bbbb"),
                 "eliminate many bs");
    assertEquals("read", 
                 SampleMethods.removeBs("bread"),
                 "eliminate one b, short string");
    assertEquals("laer", 
                 SampleMethods.removeBs("blabber"),
                 "eliminate many bs, medium string");
    assertEquals("acdefgH",
                 SampleMethods.removeBs("abbbbcbdbbbebbfbbbbgbbHbb"),
                 "eliminate many bs, silly string");
    assertEquals("aaa",
                 SampleMethods.removeBs("bbbaaabbb"),
                 "eliminate prefix and suffix bs");
  } // testremoveBs
}