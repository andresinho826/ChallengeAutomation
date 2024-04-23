package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class IframeTabPage extends BasePage{

    @FindBy(css = ".creative #ad_iframe")
    private WebElement iframeAdd;

    @FindBy(css = "#dismiss-button")
    private WebElement iframeBtnAddClose;

    @FindBy(xpath = "//h1[contains(text(),'Trainings')]")
    private WebElement training_Title;

    @FindBy(xpath = "//a[@class='pic_info_link_type6']")
    private List<WebElement> frameList;

    public void clicOnframeList(){
        int string = frameList.size();
        String stringtest = String.valueOf(frameList.get(3));
        String stringtest1 = String.valueOf(frameList.get(4));
        System.out.println("el tamaño de la lista es" + string
        + "__" + stringtest + "::::::" + stringtest1);


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
