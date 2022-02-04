package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selecFromDropDown(option);
        var selectedOption = dropDownPage.getSelectedOption();
        assertEquals(selectedOption.size(), 1,"Error number");
        assertTrue(selectedOption.contains( option), "Option not selected");


    }

}
