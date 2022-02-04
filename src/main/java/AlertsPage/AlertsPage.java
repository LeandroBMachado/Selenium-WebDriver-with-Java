package AlertsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']"); //IDENTIFICAR BOTAO JS
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']"); //IDENTIFICAR BOTAO JS 2
    private By triggerPrompButton  = By.xpath(".//button[text()='Click for JS Prompt']");
    private By results =  By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;

    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click(); // CLICAR NO PRIMEIRO BOTAO JS

    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click(); // CLICAR NO SEGUNDO BOTAO
    }

    public void triggerPromp(){
        driver.findElement(triggerPrompButton).click(); // CLICAR NO TERCEIRO BOTAO
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();  //ACEITAR O POPUP
    }

    public void alert_clickToDimiss(){
        driver.switchTo().alert().dismiss();  //NAO ACEITAR O POPUP
    }

    public String alert_getText() {
       return driver.switchTo().alert().getText(); //PEGAR TEXTO
    }

    public void  alert_setInput(String text){
         driver.switchTo().alert().sendKeys(text); //ENVIA COMANDO
    }

    public String getResult(){
        return driver.findElement(results).getText(); //PEGA O RESULTADO
    }



}
