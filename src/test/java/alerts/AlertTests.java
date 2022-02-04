package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class AlertTests extends BaseTests { //EXTENDE O BASE TESTES POIS CONTEM A URL E ACESSO

    @Test
    public void testAcceptAlert(){ //CLASSE PARA VALIDAR O TESTE DE ALERTA
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert");

    }

    @Test
    public void textGetTextFromAlert(){ //VALIDANDO SEGUNDO BOTAO PARA CLICAR
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDimiss();
        assertEquals(text,"I am a JS Confirm");

        
    }

    @Test
    public void testSetInputAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPromp();

        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: " + text);

        //  assertEquals(alertsPage.getResult(),"You entered: " + text);
        //assertEquals(alertsPage.getResult(), "You entered:TAU rocks"+ text,"Results text incorrect");

    }

}
