package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeFunctionTest {

  @Test
  public void sum() {
    int expected = 6;
    int actual = SomeFunction.sum(2, 4);
    assertEquals(expected, actual);
  }
}