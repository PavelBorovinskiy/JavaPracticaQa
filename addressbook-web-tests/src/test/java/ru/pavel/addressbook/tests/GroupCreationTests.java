package ru.pavel.addressbook.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.pavel.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);

//    app.getGroupHelper().initGroupCreation();
//    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
//    app.getGroupHelper().submitGroupCreation();
//    app.getGroupHelper().returnToGroupPage();
//
  }
}
