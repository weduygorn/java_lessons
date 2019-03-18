package jkh1557.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private final WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void newOrder(){
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Головна'])[1]/i[1]")).click();
        driver.findElement(By.linkText("Подати заявку")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Роботи в парадному')]")).click();
        driver.findElement(By.linkText("Вологе прибирання парадних")).click();

    }


}
