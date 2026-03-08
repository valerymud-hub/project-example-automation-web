package com.nttdata.steps;

import com.nttdata.page.StorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreSteps {

    private WebDriver driver;

    //constructor
    public StoreSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginLink() {
        WebElement loginLink = this.driver.findElement(StorePage.loginLink);
        loginLink.click();
    }

}
