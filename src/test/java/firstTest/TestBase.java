package firstTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestBase {

    protected WebDriver driver;

    @Before
    public void preconditions() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/123/AppData/Local/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        url();
        login(new LoginData("(067) 217-72-95", "20061990"));
    }

    private void logout() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='державна адміністрація'])[1]/following::div[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вихід'])[2]/i[1]")).click();
    }

    private void login(LoginData loginData) {
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(loginData.getPhoneNum());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ви повинні ввести номер мобільного телефону'])[1]/following::button[1]")).click();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(loginData.getPassword());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Введіть пароль'])[1]/following::button[1]")).click();
    }

    private void url() {
        driver.get("https://1557.kyiv.ua/login/");
    }

    @After
    public void postConditions() throws Exception {
        logout();
       // driver.quit();

    }
}
