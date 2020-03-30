package ru.pavel.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.pavel.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.goTo().groupPage();
    List<GroupData> before = app.group().list();
    GroupData group = new GroupData("test3", null, null);
    app.group().create(group);
    List<GroupData> after = app.group().list();
    Assert.assertEquals(after.size(), before.size() + 1);

//    int max =0;               //нахождение максимального индификатора при создание группы
//    for (GroupData g: after){
//      if(g.getId()> max){
//        max = g.getId();
//      }
//    }


/*   Comparator<? super GroupData> byId = (Comparator<GroupData>)(o1, o2) -> Integer.compare(o1.getId(),o2.getId());-- лямбда выражение
    int max1 = after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId(); -- лямбда выражение

    * нахождение максимального индификатора при создание группы, через лямбда выражение.

 */
    group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));



//    app.group().initGroupCreation();
//    app.group().fillGroupForm(new GroupData("test1", null, null));
//    app.group().submitGroupCreation();
//    app.group().returnToGroupPage();
//
  }
}
