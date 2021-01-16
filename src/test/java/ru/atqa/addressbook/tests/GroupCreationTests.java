package ru.atqa.addressbook.tests;
import org.junit.Test;
import ru.atqa.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
    public void testGroupCreation() {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test3", "test2"));
        app.submitGroupCreation();
        app.returnToGroupPage();

    }

}





