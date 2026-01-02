package seleniumpractice;

import org.pojo.POJOAdactin;
import org.sel.BaseClass;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Date;

public class TestNgrun2 extends BaseClass {


    @BeforeClass
    public static void launchbrowser() {
        browserLaunch();
    }

    @AfterClass
    public static void quitBrowser() {
        QuitBrowser();
    }

    @BeforeMethod
    public void executionTime() {
        Date d = new Date();
        System.out.println(d);
    }

    @Test
    public void TC9() throws InterruptedException {
        launchUrl("https://adactinhotelapp.com/Register.php");
        POJOAdactin ad4 = new POJOAdactin();
        passvalue(ad4.getadcUsername(), "Jeffrinll123");
        passvalue(ad4.getadcFullName(), "Jeffri");
        passvalue(ad4.getadcEmail(), "jefftest1234@gmail.com");
        passvalue(ad4.getadcPassword(), "Jeff");
        passvalue(ad4.getadcConfirmPassword(), "Jeff@1");

        Thread.sleep(10000);
        click(ad4.getadcTermsCheckBox());
        click(ad4.getadcRegisterBtn());
        Thread.sleep(20000);

        Assert.assertEquals("Password must contain minimum 6 characters", ad4.getPasschrErrbtn().getText());
        Assert.assertEquals("Passwords Do Not Match", ad4.getconfchrerrbtn().getText());

    }

    //tc 5 email without @
    @Test
    public void TC10() throws InterruptedException {
        launchUrl("https://adactinhotelapp.com/Register.php");
        POJOAdactin ad5 = new POJOAdactin();
        passvalue(ad5.getadcUsername(), "Jeffrinll123");
        passvalue(ad5.getadcFullName(), "Jeffri");
        passvalue(ad5.getadcEmail(), "jefftest1234gmail.com");
        passvalue(ad5.getadcPassword(), "Jeffawhiheu");
        passvalue(ad5.getadcConfirmPassword(), "Jeff@112324");

        Thread.sleep(10000);
        click(ad5.getadcTermsCheckBox());
        click(ad5.getadcRegisterBtn());
        Thread.sleep(20000);

        Assert.assertEquals("Invalid email, Please enter correct email.", ad5.getIvemlbtn().getText());

    }

    @AfterMethod
    public void executionEndTime() {
        Date d = new Date();
        System.out.println(d);
    }


}
