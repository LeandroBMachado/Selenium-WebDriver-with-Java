package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest  extends BaseTests  {

    @Test
    public void testSucessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText() //ASSERTTRUE TIRAR ERROS DE ESPACOS SECURE
                  .contains("You logged into a secure area!"),
                  "Alert text is incorrect");


    }

}
