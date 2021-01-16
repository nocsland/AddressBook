package ru.atqa.addressbook.tests;
import org.junit.Test;
import ru.atqa.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test3", "test2"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();

    }

}





