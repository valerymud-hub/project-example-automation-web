package com.nttdata.steps;

import com.nttdata.page.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterSteps {

    private WebDriver driver;

    //constructor
    public RegisterSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void selectGender() {
        WebElement genderInput = this.driver.findElement(RegisterPage.genderInput);
        genderInput.click();
    }

    public void typeFirstName(String firstName) {
        WebElement firstNameInput = this.driver.findElement(RegisterPage.firstNameInput);
        firstNameInput.sendKeys(firstName);
    }

    public void typeLastName(String lastName) {
        WebElement lastNameInput = this.driver.findElement(RegisterPage.lastNameInput);
        lastNameInput.sendKeys(lastName);
    }

    public void typeEmail(String email) {
        WebElement emailInput = this.driver.findElement(RegisterPage.emailInput);
        emailInput.sendKeys(email);
    }

    public void typePassword(String password) {
        WebElement passwordInput = this.driver.findElement(RegisterPage.passwordInput);
        passwordInput.sendKeys(password);
    }

    public void checkAgreeTerms() {
        WebElement agreeInput = this.driver.findElement(RegisterPage.agreeInput);
        agreeInput.click();
    }

    public void checkPrivacyTerms() {
        WebElement privacyInput = this.driver.findElement(RegisterPage.privacyInput);
        privacyInput.click();
    }

    public void clickSaveButton() {
        WebElement saveButton = this.driver.findElement(RegisterPage.saveButton);
        saveButton.click();
    }

}
