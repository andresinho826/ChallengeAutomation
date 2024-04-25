package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IframeTabPage;
import pages.OpenNewTabPage;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;

public class TestFrames extends BaseTest{
    //WebDriver driver;
    private static final Logger logger = LogManager.getLogger(TestFrames.class);
    //private static final Logger LOGGER = Logger(TestFrames.class.getName());

    @Test(priority = 0)
    public void testingOpenNewTab() {

        try{
        OpenNewTabPage fwp = new OpenNewTabPage(driver);
        fwp.setFrameTitle();
        fwp.clickOnOpenNewTab();
        fwp.clickOnHereBtn();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        logger.info("Cambia a la pestaña hija, abierta recientemente");

        fwp.iframeTabBtn();
        logger.info("Da click en el boton de la pestaña Iframe");

        // iframe tab

        IframeTabPage iftp = new IframeTabPage(driver);

        iftp.getIframeAppear();
        logger.info("Se cambia al iframe");
        iftp.trainingTitle();
        logger.info("Encuentra el titulo Training");
        iftp.clickFrameList();
        logger.info("Encuentra, pasa el mouse y da click en Manual testint training");
        Assert.assertTrue(iftp.manualTestTrainingTitle());
        logger.info("Encuentra el titulo manual testing training");
        }catch (Exception e){
            logger.error("Error is happening:= " + e.getMessage(), e);
        }



        //driver.switchTo().window(childId).close();
    }
}
