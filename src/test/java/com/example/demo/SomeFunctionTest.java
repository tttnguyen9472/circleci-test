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
    Assert.assertEquals(6, SomeFunction.sum(2, 4));
  }
}