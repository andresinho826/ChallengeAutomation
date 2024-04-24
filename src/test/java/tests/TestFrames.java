package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.IframeTabPage;
import pages.OpenNewTabPage;

import java.util.Iterator;
import java.util.Set;

public class TestFrames extends BaseTest{
    //WebDriver driver;
    private static final Logger logger = LogManager.getLogger(TestFrames.class);

    @Test(priority = 0)
    public void testingOpenNewTab() {
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

        driver.switchTo().frame(iftp.getIframeAppear());
        logger.info("Se cambia al iframe");
        iftp.trainingTitle();
        logger.info("Encontra el titulo Training");
        iftp.clickFrameList();
        logger.info("Carga la lista de opciones y da click en Manual testint training");
        iftp.manualTestTrainingTitle();
        logger.info("Encuentra el titulo manual testing training");



        //driver.switchTo().window(childId).close();
    }
}
