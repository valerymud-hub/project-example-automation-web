package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    public void clickRegisterLink(){
        WebElement registerLink = this.driver.findElement(LoginPage.registerLink);
        registerLink.click();
    }

}
