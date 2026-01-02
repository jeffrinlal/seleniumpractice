package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.amazonpage;
import org.sel.BaseClass;

import java.util.List;

public class AmazonCommonLocators extends BaseClass {

    static void main() throws InterruptedException {
        browserLaunch();
        launchUrl("https://www.amazon.in/");
        Thread.sleep(5000);
//        amazonpage amz = new amazonpage();
//        amz.getCommonlocators().forEach(allelements -> System.out.println(allelements.getText()));

       List<WebElement> allelements= getDriver().findElements(By.xpath("xpath = \"//a[@class='nav-a  ']"));
         for (WebElement x : allelements) {
              System.out.println(x.getText());
         }
    }

}
