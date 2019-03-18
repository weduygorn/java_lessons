package jkh1557.appManager;

import jkh1557.testData.LoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private OrderPage orderPage;
    private HomePage homePage;
    private SessionHelper sessionHelper;
    public WebDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/123/AppData/Local/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url();
        homePage = new HomePage(driver);
        orderPage = new OrderPage(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login(new LoginData("(067) 217-72-95", "20061990"));

    }

    public void url() {
        driver.get("https://1557.kyiv.ua/login/");
    }

    public void stop() {
        sessionHelper.logout();
        driver.quit();
    }
}
