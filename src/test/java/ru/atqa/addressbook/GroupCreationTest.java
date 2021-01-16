package ru.atqa.addressbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class GroupCreationTest {
    private WebDriver driver;

    @Before
    public void start() throws Exception {
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/group.php");
        login("admin", "secret");
    }

    private void login(String user, String password) {
        driver.findElement(By.name("user")).sendKeys(user);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[3]")).click();
    }

    @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test3", "test2"));
        submitGroupCreation();
        returnToGroupPage();

    }

    private void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    private void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    private void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    private void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    private void gotoGroupPage() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[3]/a")).click();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}





