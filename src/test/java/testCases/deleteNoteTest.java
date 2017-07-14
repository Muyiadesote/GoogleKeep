package testCases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.createANotePage;
import pages.loginPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by musti on 22/06/2017.
 */
public class deleteNoteTest extends base {

        // This is a test to create a note and delete it.

        @Test
        public void DeleteNoteTest() throws InterruptedException, IOException {

        loginPage lp = new loginPage(driver);
        lp.doLogin("olu.adesote@gmail.com", "angel2010"); // please supply valid username and password
        Thread.sleep(1000);

        createANotePage canp = new createANotePage(driver);
        canp.doCreateNote("Test3", "This is a test to delete a note");
        canp.ConfirmCreateNote();
        canp.DeleteNote();
        Assert.assertTrue(canp.ConfirmDeleteNote());

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP2\\InterviewTests\\David\\GoogleKeep1\\src\\main\\java\\screenshots\\deleteNoteTest.jpg"));

        driver.close();

        }
}
