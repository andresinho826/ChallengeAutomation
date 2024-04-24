package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy(css = "img[alt='Manual Online Testing Training']")
    private WebElement btnManualTestingTraining;

    @FindBy(xpath = "//h1[contains(text(),'Manual Testing Training')]")
    private WebElement textManualTesting;

    @FindBy(css = "iframe[name='globalSqa']")
    private WebElement iframeAppear;

    public void manualTestTrainingTitle(){
        isElementDisplayed(textManualTesting);
        Assert.assertTrue(textManualTesting.isDisplayed());
    }

    public WebElement getIframeAppear() {
        isFluentElementDisplayed(iframeAppear);
        Assert.assertTrue(iframeAppear.isDisplayed());
        return iframeAppear;
    }

    public void setIframeAppear(WebElement iframeAppear) {
        this.iframeAppear = iframeAppear;
    }



    public void clickFrameList(){
        isFluentElementDisplayed(btnManualTestingTraining);
        btnManualTestingTraining.click();

        /*
        for (int i=0; i<frameList.size(); i++){
            if(frameList.get(i).equals(3)){
                frameList.get(i).click();
            }
        }

         */


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
