package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class GlobalSqapage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Sortable')]")
    //*[@id="menu-item-2816"]/a/span[2]
    //span[contains(text(),'Sortable')]
    private WebElement alertBoxBtn;

    //span[contains(text(),'Interaction')]
    //span[contains(text(),'Miscellaneous')]
    @FindBy(xpath = "//span[contains(text(),'Interaction')]")
    private WebElement textMiscella;

    @FindBy(xpath = "//h1[contains(text(),'Sortable')]")
    private WebElement textSortable;

    public void clickAlertBoxBtn(){
        isFluentElementDisplayed(textMiscella);
        alertBoxBtn.click();

        //isFluentElementDisplayed(textMiscella);
        // Create an instance of Actions class
        //Actions actions = new Actions(driver);
        //actions.scrollToElement(textMiscella).click(alertBoxBtn).build().perform();
        //isFluentElementDisplayed(alertBoxBtn);
        //actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        //actions.click(alertBoxBtn);
    }
    public void TextPageSorteblae(){
        isFluentElementDisplayed(textSortable);
        Assert.assertTrue(textSortable.isDisplayed());
    }
    public GlobalSqapage(WebDriver driver){
        super(driver);
    }
}
