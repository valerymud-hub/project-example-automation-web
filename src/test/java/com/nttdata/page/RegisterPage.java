package com.nttdata.page;

import org.openqa.selenium.By;

public class RegisterPage {

    public static By genderInput = By.id("field-id_gender-2");
    public static By firstNameInput = By.id("field-firstname");
    public static By lastNameInput = By.id("field-lastname");
    public static By emailInput = By.id("field-email");
    public static By passwordInput = By.id("field-password");
    public static By agreeInput = By.name("psgdpr");
    public static By privacyInput = By.name("customer_privacy");
    public static By saveButton = By.cssSelector("button[data-link-action='save-customer']");

}
