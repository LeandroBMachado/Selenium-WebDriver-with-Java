package pages;

import AlertsPage.AlertsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);

    }
    //METODO PARA CLICAR NO LINK DA PAGINA DROPDOWN
    public  DropDown  clickDropDown(){
        clickLink("Dropdown");
        return new DropDown(driver);

    }


    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);

    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);

    }


    //METODO PARA CLICAR NO LINK DA PAGINA FORM AUTHENTICATION
    private void clickLink(String linkText){ driver.findElement(By.linkText(linkText)).click();


    }

}
