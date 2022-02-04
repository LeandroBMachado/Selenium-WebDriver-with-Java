package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Element;
import java.util.List;
import java.util.stream.Collectors;

public class DropDown {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    //construtor

    public DropDown(WebDriver driver) {
        this.driver = driver;
    }


    public void selecFromDropDown(String option){
        //SELECIONAR UM ELEMENTO VISIVEL DA LISTA DE ITENS
        findDropDownElement().selectByVisibleText(option);
    }
        //SELECIONAR UM INTEM DA LISTA DE STRING
    public List<String> getSelectedOption(){
        List<WebElement> selectedElements =
        findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));

    }

}
