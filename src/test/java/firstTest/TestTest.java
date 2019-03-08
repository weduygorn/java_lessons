package firstTest;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;







public class TestTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver","C:/Users/123/AppData/Local/Google/Chrome/Application/chromedriver.exe");
        WebDriver dr1= new ChromeDriver(); ;
        driver = dr1;
    }


    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("http://v3.test.itpmgroup.com/login");
        driver.findElement(By.name("_username")).click();
        driver.findElement(By.name("_username")).clear();
        driver.findElement(By.name("_username")).sendKeys("student");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Учет запчастей'])[1]/following::div[4]")).click();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("909090");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Учет запчастей'])[1]/following::button[1]")).click();
        driver.findElement(By.linkText("Student37")).click();
        driver.findElement(By.linkText("Выход")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}

