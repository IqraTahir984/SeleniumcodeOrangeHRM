package org.example;

import Pages.AddEmploye;
import Pages.PIM;
import Pages.loginpage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddingEmployee {
    private AddEmploye emp;
    private loginpage login;
    private WebDriver driver;
    private PIM pim;
    private ExtentReports extent;

    @BeforeMethod
    public  void main () {
         driver = new ChromeDriver();
         emp = new AddEmploye(driver);
         login = new loginpage(driver);
         pim = new PIM(driver);

         //report generation code//
        ExtentSparkReporter reports = new ExtentSparkReporter("reports.html");
        extent = new ExtentReports();
        extent.attachReporter(reports);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1920, 1080));


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        login.logintest("admin", "admin123");

    }
    @Test
    public void addempdetails(){
        extent.createTest("logintest");
        emp.clickadmin();
        emp.clickadd();
        emp.adduserrole();
        emp.employename("a");
        emp.empstatus();
        emp.getusername("abcde");
        emp.getpassword("abc1234");
        emp.confirmpass("abc1234");
        emp.clicksave();
        extent.flush();

    }
    @Test
    public void pimdetails(){
        extent.createTest("create pim test");
        pim.clickpim();
        pim.getpimid("0245");
        pim.getpimdetails();
        pim.setSubmitbtn();
        extent.flush();
    }}



