package ru.atqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    public void init() {
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        login("admin", "secret");
    }

    public void login(String user, String password) {
        driver.findElement(By.name("user")).sendKeys(user);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[3]")).click();
    }

    public void stop() {
        driver.quit();
        driver = null;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
