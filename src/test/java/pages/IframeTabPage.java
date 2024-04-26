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
    @FindBy(css = "//img[contains(@src,'ManalTestingTraining.jpg')]")
    private WebElement btnManualTestingFirst;


    //@FindBy(css = "a[href='https://www.globalsqa.com/training/manual-testing-training/']")
    //@FindBy(xpath= "//h3[contains(text(), 'Manual Testing Training')]")
    //@FindBy(xpath= "//iframe[contains(text(),'<br />')]")
    //img[contains(@src,'ManalTestingTraining.jpg')]
    //iframe[contains(text(),'<br />')]
    //img[contains(@src,'SelenimTraining.jpg')]
    //h3[contains(text(), 'Manual Testing Training')]

    @FindBy(xpath= "//img[contains(@src,'SelenimTraining.jpg')]")
    private WebElement btnManualTestingSecond;

    @FindBy(xpath = "//h1[contains(text(), 'Manual Testing Training')]")
    private WebElement textManualTesting;

    @FindBy(xpath = "//h1[contains(text(), 'Selenium 3.0 Training')]")
    private WebElement textSeleniumTraining;

    @FindBy(css = "iframe[name='globalSqa']")
    private WebElement iframeAppear;

    /*public void onlyClick(){
        Actions actions = new Actions(driver);
        actions.moveToElement(btnManualTestingFirst).click().perform();
        //btnManualTestingFirst.click();
    }

     */

    public boolean manualTestTrainingTitle(){
        isFluentElementDisplayed(textSeleniumTraining);
        return true;
        //Assert.assertTrue(textManualTesting.isDisplayed());
        //isElementDisplayed(textManualTesting);
    }

    public void getIframeAppear() {
        driver.switchTo().frame(iframeAppear);
    }
    public void leftToFrame() {
        driver.switchTo().defaultContent();
    }

    public void clickFrameList(){
        isFluentElementDisplayed(btnManualTestingSecond);
        // Create an instance of Actions class
        Actions actions = new Actions(driver);
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(btnManualTestingSecond,0,-50);
        actions.scrollFromOrigin(scrollOrigin, 0, 200);
        actions.moveToElement(btnManualTestingSecond).click().perform();
        //driver.switchTo().defaultContent();

        //actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        //actions.moveToElement(btnManualTestingSecond).click().perform();
        //actions.sendKeys(Keys.PAGE_UP).build().perform();
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        //int deltaY = btnManualTestingSecond.getRect().y;
        //actions.scrollByAmount(0,deltaY).perform();
        //actions.scrollToElement(btnManualTestingSecond).perform();
        //actions.scrollByAmount(0,500);
        //actions.scrollToElement(btnManualTestingSecond).perform();
        // Move the mouse cursor to the element
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
