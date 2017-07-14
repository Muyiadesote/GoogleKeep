package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 22/06/2017.
 */
public class loginPage {
    WebDriver driver;
    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Web Elements for Login Test + Assert loginPage
    @FindBy (id = "identifierId")
    private WebElement Email;

    @FindBy (xpath = ".//*[@id='identifierNext']/content/span")
    private WebElement SubmitEmail;

    @FindBy (xpath = ".//*[@id='password']/div[1]/div/div[1]/input")
    private WebElement EnterPWord;

    @FindBy (xpath = ".//*[@id='passwordNext']/content/span")
    private WebElement submitPWord;

    @FindBy (xpath = ".//*[@id='gb']/div[2]/div[1]")
    private WebElement LoginVerify;

    // Web elements for LogoutTest + Assert Log Out Test

    @FindBy (xpath = ".//*[@id='gb']/div[2]/div[3]/div/div[3]/div/a/span")
    private WebElement LogOutBtn;

    @FindBy (xpath = ".//*[@id='gb_71']")
    private WebElement SignOutBtn;

    @FindBy (xpath = ".//*[@id='view_container']/form/div[2]/div/div/div/ul[1]/li[1]/div/div[2]/p[3]")
    private WebElement VerifySignOut;



    public void doLogin(String myEmail, String myPassword){
        Email.sendKeys(myEmail);
        SubmitEmail.click();
        EnterPWord.sendKeys(myPassword);
        submitPWord.click();
    }

    public boolean verifyLoginPage(){
        return LoginVerify.isDisplayed();

    }

    public void doLogOut(){

        LogOutBtn.click();
        SignOutBtn.click();
    }

    public boolean VerifyLogOut(){

        return VerifySignOut.isDisplayed();
    }
}
