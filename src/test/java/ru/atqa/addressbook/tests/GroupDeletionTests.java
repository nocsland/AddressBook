package ru.atqa.addressbook.tests;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {
    @Test

    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();

    }

}

