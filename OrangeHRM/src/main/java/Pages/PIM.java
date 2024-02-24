package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM {
    WebDriver driver;

    @FindBy(xpath = "//span[text()=\"PIM\"]")
    WebElement PIM;
//    @FindBy(xpath = "//label[text()=\"Employee Name\"]/following::input[@placeholder=\"Type for hints...\"][1]")
//    WebElement pimname;
//    @FindBy(xpath = "//div[@role=\"listbox\"]/div[2]")
//    WebElement pimnameselect;
    @FindBy(xpath = "//label[text()=\"Employee Id\"]")
    WebElement pimempid;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement submitbtn;
    @FindBy(xpath = "//div[@role=\"cell\"][2]")
    WebElement pimdetails;


    public  PIM(WebDriver driver){
    this.driver= driver;
    PageFactory.initElements(driver,this);

}
public void clickpim(){
        PIM.click();
}
public void getpimid(String abcg){
    pimempid.sendKeys(abcg);
}
public void setSubmitbtn(){
    submitbtn.click();
}
public void getpimdetails(){
    pimdetails.click();
}

}

