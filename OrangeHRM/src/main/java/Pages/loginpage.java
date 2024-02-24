package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

    WebDriver driver ;

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement username;
    @FindBy(xpath = "//input[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement submit;

    public loginpage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }

    public void enterusername(String user)
    {
        username.sendKeys(user);
    }
    public void setPassword(String pass)
    {
        password.sendKeys(pass);
    }
    public void clicksubmitbtn(){
        submit.click();
    }

    public void logintest(String login_username, String loginpassword) {
        loginpage Login = new loginpage(driver);
        Login.enterusername(login_username);
        Login.setPassword(loginpassword);
        Login.clicksubmitbtn();
    }
}
