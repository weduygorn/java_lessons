package jkh1557.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void homepage() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Головна'])[1]/i[1]")).click();
        driver.findElement(By.linkText("Подати заявку")).click();
    }

    public String generalInfo() {
        String generalInfo = driver.findElement(By.xpath("//div[@class='claim-message-item']")).getText();
        return generalInfo;
    }


}
