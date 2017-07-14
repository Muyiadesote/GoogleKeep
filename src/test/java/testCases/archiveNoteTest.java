package testCases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.createANotePage;
import pages.loginPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by musti on 22/06/2017.
 */
public class archiveNoteTest extends base {

        @Test
        public void ArchiveNote() throws InterruptedException, IOException {

        loginPage lp = new loginPage(driver);
        lp.doLogin("olu.adesote@gmail.com", "angel2010"); // please supply valid username and password
//                WebDriverWait wait=new WebDriverWait(driver, 20);
        Thread.sleep(4000);

        createANotePage canp = new createANotePage(driver);
        canp.doCreateNote("Test1", "Yieldify test to verify archive note test");
                Thread.sleep(3000);
                //WebDriverWait wait1 =new WebDriverWait(driver, 20);
        canp.ConfirmCreateNote();

        canp.ArchiveNoteP();
                Thread.sleep(3000);
        Assert.assertTrue(canp.AssertArchiveNote());

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP2\\InterviewTests\\David\\GoogleKeep1\\src\\main\\java\\screenshots\\ArchiveNoteTest.jpg"));

        driver.close();
    }
}
