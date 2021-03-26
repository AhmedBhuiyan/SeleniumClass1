package home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTestTestRunner {

    WebDriver driver=null;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/Macbook/IdeaProjects/SeleniumAB/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();



    }
        @AfterMethod
                public void cleanUp(){
            driver.close();
        }

        @Test
        public void test1() throws InterruptedException{
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("McBook Pro", Keys.ENTER);
            Thread.sleep(4000);

        }



    }


