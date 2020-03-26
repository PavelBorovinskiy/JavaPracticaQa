package ru.pavel.addressbook.tests;

import org.testng.annotations.Test;
import ru.pavel.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {

      app.getNavigationHelper().gotoGroupPage();
      if (!app.getGroupHelper().isThreeAGroup()) {
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
      }
      app.getGroupHelper().selectdGroup();
      app.getGroupHelper().deleteSelectedGroup();
      app.getGroupHelper().returnToGroupPage();

  }

}