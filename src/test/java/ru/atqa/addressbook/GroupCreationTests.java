package ru.atqa.addressbook;
import org.junit.Test;

public class GroupCreationTests extends TestBase {

  @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test3", "test2"));
        submitGroupCreation();
        returnToGroupPage();

    }

}





