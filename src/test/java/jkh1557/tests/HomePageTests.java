package jkh1557.tests;

import jkh1557.appManager.HomePage;
import jkh1557.appManager.SessionHelper;
import org.junit.Test;
import org.openqa.selenium.By;


public class HomePageTests extends ParentTest {


    @Test
    public void testAlliSFineWithHome() throws Exception {
        String text = app.driver.findElement(By.xpath("//div[@class='claim-message-item']"))
                .getText();

        assert text
                .contains("відсутні аварійні або планові відключення");

        System.out.println(text);




    }
}

