package org.example;

import Pages.AddEmploye;
import Pages.PIM;
import Pages.loginpage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class pimcls {

    private loginpage login;
    private WebDriver driver;
    private PIM pim;

    @BeforeMethod
    public  void main() {
        driver = new ChromeDriver();
        login = new loginpage(driver);
        pim = new PIM(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1920, 1080));


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        login.logintest("admin", "admin123");

    }

    @Test
    public void pimdetails(){
        pim.clickpim();
        pim.getpimid("0245");
        pim.getpimdetails();
        pim.setSubmitbtn();
    }
}



