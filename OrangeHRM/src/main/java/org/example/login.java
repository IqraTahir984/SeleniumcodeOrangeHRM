package org.example;

import Pages.AddEmploye;
import Pages.loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login{
private WebDriver driver;
private loginpage Login;
private AddEmploye emp;

   @BeforeMethod
    public void main(){
       driver = new ChromeDriver();
       Login = new loginpage(driver);
//       emp = new AddEmploye(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Login.logintest("admin","admin123");

    }



//    @Test(priority = 1)
//    public void checkpositive()
//    {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Login.logintest("admin","admin123");
//        emp.clickadmin();
//        driver.close();
//    }
//    @Test(priority = 2)
//    public void checknegative(){
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Login.logintest("admmgin", "admin123");
//        emp.clickadmin();
//
//
//
//    }
}