package ru.pavel.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.pavel.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver driver) {
    super(driver);

  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void fillGroupForm(GroupData groupData) {
   // click(By.id("content"));
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void selectdGroup() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedGroup() {
    click(By.name("delete"));
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }
}
