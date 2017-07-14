package testCases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.createANotePage;
import pages.loginPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by musti on 22/06/2017.
 */
public class createANoteTest extends base {

        // This is a test to create a note.

        @Test
        public void doCreateANotePage() throws InterruptedException, IOException {
        loginPage lp = new loginPage(driver);
        lp.doLogin("olu.adesote@gmail.com", "angel2010"); // please supply valid username and password
        Thread.sleep(4000);

        createANotePage canp = new createANotePage(driver);
        canp.doCreateNote("Test2", "Yieldify test to create a note");
        canp.ConfirmCreateNote();

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP2\\InterviewTests\\David\\GoogleKeep1\\src\\main\\java\\screenshots\\createANoteTest.jpg"));

        driver.close();


        }


}
