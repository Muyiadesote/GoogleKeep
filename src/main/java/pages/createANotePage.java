package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by musti on 22/06/2017.
 */
public class createANotePage {

    WebDriver driver;
    public createANotePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Web Elements for create a note + add title and delete note.

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[7]")
    private WebElement TakeAnote;

    @FindBy (xpath = "html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]")
    private WebElement AddTitle;

    @FindBy (xpath = "html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[7]")
    private WebElement TakeANote;

    @FindBy (xpath = "html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]")
    private WebElement DoneBtn;

    // Delete note web elements
    @FindBy (xpath = "html/body/div[2]/div[2]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[7]")
    private WebElement DeleteBtn;

    @FindBy (xpath = ".//*[@id=':2']/div")
    private WebElement DeleteNoteBtn;

    // Web elements to archive a note.

    @FindBy (xpath = "html/body/div[2]/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div[6]")
    private WebElement ArchiveNoteBtn;

    // Web Element to verify successful note and title creation.

    @FindBy (xpath = "html/body/div[2]/div[2]/div[4]/div/div[1]/div[2]/div[1]/div[7]")
    private WebElement verifyNote;

    // Web element to confirm delete note

    @FindBy (css = ".Q0hgme-vDaB1c-Ne3sFf")
    private WebElement verifyDeleteNote;

    // Web element to confirm Archive note.

    @FindBy (xpath = "html/body/div[25]/div/div[1]")
    private WebElement verifyArchiveNote;


    public void doCreateNote(String myTitle, String myNote){
        TakeANote.click();
        AddTitle.sendKeys(myTitle);
        TakeANote.sendKeys(myNote);
        DoneBtn.click();
    }

    public boolean ConfirmCreateNote(){
        return verifyNote.isDisplayed();
    }

    // method to delete note

    public void DeleteNote(){
        DeleteBtn.click();
        DeleteNoteBtn.click();
    }

    public boolean ConfirmDeleteNote(){

        return verifyDeleteNote.isDisplayed();
    }

    public void ArchiveNoteP(){
        ArchiveNoteBtn.click();
    }

    public boolean AssertArchiveNote(){
        return verifyArchiveNote.isDisplayed();
    }
   }
