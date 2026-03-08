package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.MyAccountSteps;
import com.nttdata.steps.RegisterSteps;
import com.nttdata.steps.StoreSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.*;

public class StoreStepsDef {

    private WebDriver driver;

    @Dado("que estoy en la página de la tienda")
    public void que_estoy_en_la_página_de_la_tienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        screenShot();
    }

    @Cuando("doy click en la opción iniciar sesión")
    public void doy_click_en_la_opción_iniciar_sesión() {
        StoreSteps storeSteps = new StoreSteps(driver);
        storeSteps.clickLoginLink();
        screenShot();
    }

    @Y("doy click en el link text cree una cuenta aquí")
    public void doy_click_en_el_link_text_cree_una_cuenta_aquí() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.clickRegisterLink();
        screenShot();
    }

    @Y("lleno los campos del formulario para el registro")
    public void lleno_los_campos_del_formulario_para_el_registro() {
        RegisterSteps registerSteps = new RegisterSteps(driver);
        registerSteps.selectGender();
        registerSteps.typeFirstName("Juan");
        registerSteps.typeLastName("Perez");
        registerSteps.typeEmail("juanperez2@gmail.com");
        registerSteps.typePassword("Ju@nPerez123");
        registerSteps.checkAgreeTerms();
        registerSteps.checkPrivacyTerms();
        screenShot();
    }

    @Y("doy click en el botón guardar")
    public void doy_click_en_el_botón_guardar() {
        RegisterSteps registerSteps = new RegisterSteps(driver);
        registerSteps.clickSaveButton();
        screenShot();
    }

    @Entonces("debería visualizar mi usuario logeado en la pantalla")
    public void debería_visualizar_mi_usuario_logeado_en_la_pantalla() {
        MyAccountSteps myAccountSteps = new MyAccountSteps(driver);
        Assertions.assertEquals("Juan Perez", myAccountSteps.getUserName());
    }

}
