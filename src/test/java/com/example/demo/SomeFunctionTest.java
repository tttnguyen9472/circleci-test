package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SomeFunctionTest {

  private SomeFunction someFunction;

@Before
public void init(){
  someFunction = new SomeFunction();
}
  @Test
  public void sumTest() {
    Assert.assertEquals(6, someFunction.sum(3, 4));
  }
}