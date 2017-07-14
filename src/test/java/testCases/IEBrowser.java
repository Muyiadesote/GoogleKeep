package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Created by musti on 25/06/2017.
 */
public class IEBrowser {

        @Test
        public void IEDriverTest() {
        System.setProperty("webdriver.ie.driver", "C:\\WIP\\FirstAutomationProject\\IEDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
}