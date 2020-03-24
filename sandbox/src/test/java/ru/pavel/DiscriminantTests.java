package ru.pavel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscriminantTests {
  @Test
  public void testSquare0(){
    Discriminant d = new Discriminant(1,1,1);
    Assert.assertEquals(d.rootNumber(),0);
  }
  @Test
  public void testSquare1(){
    Discriminant d = new Discriminant(1,2,1);
    Assert.assertEquals(d.rootNumber(),1);
  }
  @Test
  public void testSquare2(){
    Discriminant d = new Discriminant(1,4,1);
    Assert.assertEquals(d.rootNumber(),2);
  }
}
