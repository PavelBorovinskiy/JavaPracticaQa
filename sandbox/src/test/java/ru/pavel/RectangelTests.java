package ru.pavel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangelTests {
  @Test
  public void testArea(){
    Rectangel r = new Rectangel(4,8);
    Assert.assertEquals(r.area(),32.0);
  }

}
