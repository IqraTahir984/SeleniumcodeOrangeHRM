package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmploye {

    WebDriver driver;

    @FindBy(xpath = "//span[text()=\"Admin\"]")
    WebElement Admin;
    @FindBy(xpath = " //button[text()=\" Add \"]")
    WebElement Add;
    @FindBy(xpath = "//label[text()=\"User Role\"]/following::div[text()=\"-- Select --\"][1]")
    WebElement userrole;
    @FindBy(xpath = "//label[text()=\"User Role\"]/following::div[text()=\"-- Select --\"][1]/following::span[text()=\"Admin\"]")
    WebElement userroleval;
    @FindBy(xpath = "//label[text()=\"Employee Name\"]/following::input[@placeholder=\"Type for hints...\"]")
    WebElement empname;
    @FindBy(xpath = "//div[@role=\"listbox\"]/div[2]")
    WebElement employeval;
    @FindBy(xpath = "//label[text()=\"Status\"]/following::div[text()=\"-- Select --\"]")
    WebElement status;
    @FindBy(xpath = "//span[text()=\"Enabled\"]")
    WebElement statusval;
    @FindBy(xpath = "//label[text()=\"Username\"]/following::input[1]")
    WebElement username;
    @FindBy(xpath = "//label[text()=\"Password\"]/following::input[1]")
    WebElement password;
    @FindBy(xpath = "//label[text()=\"Confirm Password\"]/following::input")
    WebElement confirmpassword;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement save;

    public AddEmploye(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
    public void clickadmin(){
        Admin.click();
    }
    public void clickadd(){
        Add.click();
    }
    public void adduserrole(){
        userrole.click();
        userroleval.click();
    }
    public void employename(String a){
         empname.sendKeys(a);
        employeval.click();

    }
    public void empstatus(){
        status.click();
        statusval.click();
    }
    public void getusername(String kj){
        username.sendKeys(kj);
    }
    public void getpassword(String k){
        password.sendKeys(k);

    }
    public void confirmpass(String kl){
        confirmpassword.sendKeys(kl);

    }
    public void clicksave(){
        save.click();
    }



























}









