package firstTest;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestTest {
    private WebDriver driver;
    private String baseUrl = "http://v3.test.itpmgroup.com/login";

    private void login() {
        driver.get(baseUrl);
        driver.findElement(By.name("_username")).clear();
        driver.findElement(By.name("_username")).sendKeys("student");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("909090");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Учет запчастей'])[1]/following::button[1]")).click();
    }

    private void logout() {
        driver.findElement(By.linkText("Student_37")).click();
        driver.findElement(By.linkText("Выход")).click();
    }

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:/Users/123/AppData/Local/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        login();
        logout();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }
}

