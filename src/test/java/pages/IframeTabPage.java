package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class IframeTabPage extends BasePage{

    // en caso tal aparezca el anuncio
    @FindBy(css = ".creative #ad_iframe")
    private WebElement iframeAdd;

    @FindBy(css = "#dismiss-button")
    private WebElement iframeBtnAddClose;

    //---------------
    @FindBy(xpath = "//h1[contains(text(),'Trainings')]")
    private WebElement training_Title;

    @FindBy(xpath = "//a[@class='pic_info_link_type6']")
    private List<WebElement> frameList;

    //@FindBy(css = "img[alt='Manual Online Testing Training']")
    @FindBy(css = "a[href='https://www.globalsqa.com/training/manual-testing-training/']")
    private WebElement btnManualTestingFirst;


    //@FindBy(css = "a[href='https://www.globalsqa.com/training/manual-testing-training/']")
    //@FindBy(xpath= "//h3[contains(text(), 'Manual Testing Training')]")
    //@FindBy(xpath= "//iframe[contains(text(),'<br />')]")
    @FindBy(xpath= "//h3[contains(text(), 'Manual Testing Training')]")
    //iframe[contains(text(),'<br />')]
    private WebElement btnManualTestingSecond;

    @FindBy(xpath = "//h1[contains(text(), 'Manual Testing Training')]")
    private WebElement textManualTesting;

    @FindBy(css = "iframe[name='globalSqa']")
    private WebElement iframeAppear;

    public boolean manualTestTrainingTitle(){
        isFluentElementDisplayed(textManualTesting);
        //isElementDisplayed(textManualTesting);
        return true;
        //Assert.assertTrue(textManualTesting.isDisplayed());
    }

    public void getIframeAppear() {
        driver.switchTo().frame(iframeAppear);
    }

    public void clickFrameList(){
        isFluentElementDisplayed(btnManualTestingSecond);
        // Create an instance of Actions class

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.moveToElement(btnManualTestingSecond).click().perform();

        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

         */


        //int deltaY = btnManualTestingSecond.getRect().y;
        //actions.scrollByAmount(0,deltaY).perform();

        //WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(btnManualTestingSecond,10,10);
        //actions.scrollFromOrigin(scrollOrigin, 0, 200);


        //actions.scrollToElement(btnManualTestingSecond).perform();
        //actions.scrollByAmount(0,500);
        //actions.scrollToElement(btnManualTestingSecond).perform();
        // Move the mouse cursor to the element
        actions.sendKeys(Keys.PAGE_UP).build().perform();

        //actions.moveToElement(btnManualTestingSecond).sendKeys(Keys.ENTER).perform();
    }

    public boolean iframeAddIspresent(){
        isElementDisplayed(iframeAdd);
        return true;
    }
    public void clickOnCloseAdd(){
        iframeBtnAddClose.click();
    }

    public void trainingTitle(){
        isElementDisplayed(training_Title);
        Assert.assertTrue(training_Title.isDisplayed());

    }
    public IframeTabPage(WebDriver driver){
        super(driver);
    }
}
