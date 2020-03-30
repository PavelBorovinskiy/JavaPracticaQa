package ru.pavel.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.pavel.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.goTo().groupPage();
    Set<GroupData> before = app.group().all();
    GroupData group = new GroupData().withName("test1");
    app.group().create(group);
    Set<GroupData> after = app.group().all();
    Assert.assertEquals(after.size(), before.size() + 1);

    group.withId(after.stream().mapToInt((g)->g.getId()).max().getAsInt()); //максимальный индификатор для множеств
    before.add(group);
    Assert.assertEquals(before,after);

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
//    group.withId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());

//    app.group().initGroupCreation();
//    app.group().fillGroupForm(new GroupData("test1", null, null));
//    app.group().submitGroupCreation();
//    app.group().returnToGroupPage();
//
  }
}
