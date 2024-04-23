package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OpenNewTabPage extends BasePage{
    WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(),'Frames And Windows')]")
    private WebElement frameTitle;

    @FindBy(xpath = "//li[@id='Open New Tab']")
    private WebElement btnOpenNewTab;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
    private WebElement btnClickHere;

    @FindBy(css = "#iFrame")
    private WebElement iFrameTab;



    public void setFrameTitle(){
        isElementDisplayed(frameTitle);
        Assert.assertTrue(frameTitle.isDisplayed());
    }
    public void iframeTabBtn(){
        isElementDisplayed(iFrameTab);
        iFrameTab.click();
    }
    public void clickOnOpenNewTab(){
        btnOpenNewTab.click();
    }
    public void clickOnHereBtn(){
        btnClickHere.click();
    }


    public OpenNewTabPage(WebDriver driver){
        super(driver);
    }



}
