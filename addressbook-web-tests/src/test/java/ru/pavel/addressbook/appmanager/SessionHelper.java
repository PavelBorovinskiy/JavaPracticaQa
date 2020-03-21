package ru.pavel.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {


  public SessionHelper(WebDriver driver) {
    super(driver);
  }

  protected void login(String username, String password) {
    type(By.name("user"), username);

//    driver.findElement(By.name("user")).click();
//    driver.findElement(By.name("user")).clear();
//    driver.findElement(By.name("user")).sendKeys(username);
    type(By.name("pass"), password);
//    driver.findElement(By.name("pass")).click();
//    driver.findElement(By.name("pass")).clear();
//    driver.findElement(By.name("pass")).sendKeys(password);
    click(By.xpath("//input[@value='Login']"));
//     driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
}