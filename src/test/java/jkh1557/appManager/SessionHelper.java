package jkh1557.appManager;

import jkh1557.testData.LoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {


    private final WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void login(LoginData loginData) {
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(loginData.getPhoneNum());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ви повинні ввести номер мобільного телефону'])[1]/following::button[1]")).click();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(loginData.getPassword());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Введіть пароль'])[1]/following::button[1]")).click();
    }

    public void logout(){
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='державна адміністрація'])[1]/following::div[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Вихід'])[2]/i[1]")).click();
    }

}
