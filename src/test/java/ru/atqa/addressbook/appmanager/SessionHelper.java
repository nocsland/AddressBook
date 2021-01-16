package ru.atqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String password) {
        type(By.name("user"),user);
        type(By.name("pass"),password);
        click(By.xpath("//*[@id=\"LoginForm\"]/input[3]"));
    }
}
