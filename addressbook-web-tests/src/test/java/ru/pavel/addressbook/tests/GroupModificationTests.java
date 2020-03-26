package ru.pavel.addressbook.tests;

import org.testng.annotations.Test;
import ru.pavel.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {
  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThreeAGroup()) {
      
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectdGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test10", "test2", "test3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();

  }
}
