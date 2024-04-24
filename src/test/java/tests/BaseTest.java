package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    String driverPath = "src/utils/chromedriver.exe";
    String urlPageOne = "https://www.globalsqa.com/demo-site/frames-and-windows/";
    String urlPageSecond = "https://demo.automationtesting.in/Alerts.html";


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(urlPageOne);
    }


    @AfterTest
    public void tearDown(){
        // cierra solo la pagina actual
        //driver.close();

        // cierra todas las paginas que se abren al momento de la test
        driver.quit();
    }
}
