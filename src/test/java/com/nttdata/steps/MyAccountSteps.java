package com.nttdata.steps;

import com.nttdata.page.MyAccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountSteps {

    private WebDriver driver;

    //constructor
    public MyAccountSteps(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {
        WebElement username = this.driver.findElement(MyAccountPage.userLogged);
        return username.getText();
    }

}
