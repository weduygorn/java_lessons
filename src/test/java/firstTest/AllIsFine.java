package firstTest;

import org.junit.Test;
import org.openqa.selenium.By;




public class AllIsFine extends TestBase  {


    @Test
    public void testUntitledTestCase() throws Exception {
        String text = driver.findElement(By.xpath("//div[@class='claim-message-item']")).getText();

        assert text.contains("відсутні аварійні або планові відключення");
        System.out.println(text);

    }
}

