package tests;

import org.testng.annotations.Test;
import pages.IframeTabPage;
import pages.OpenNewTabPage;

import java.util.Iterator;
import java.util.Set;

public class TestFrames extends BaseTest{
    //WebDriver driver;

    @Test(priority = 0)
    public void testingOpenNewTab(){
        OpenNewTabPage fwp = new OpenNewTabPage(driver);
        fwp.setFrameTitle();
        fwp.clickOnOpenNewTab();
        fwp.clickOnHereBtn();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        fwp.iframeTabBtn();

        // iframe tab

        IframeTabPage iftp = new IframeTabPage(driver);
        iftp.trainingTitle();
        iftp.clicOnframeList();



        //driver.switchTo().window(childId).close();
    }
}
