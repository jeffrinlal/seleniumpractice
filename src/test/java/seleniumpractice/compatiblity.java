package seleniumpractice;

import org.pojo.POJOAdactin;
import org.sel.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class compatiblity extends BaseClass {


    @Parameters({"Browsername"})
    @Test

    private void TC1(String browser) throws InterruptedException {

        if (browser.equals("Chrome")) {
            browserLaunch();
        } else if (browser.equals("edge")) {
            EdgebrowserLaunch(getDriver());
        }
        getDriver().get("https://adactinhotelapp.com/Register.php");
        POJOAdactin ad0 = new POJOAdactin();
        passvalue(ad0.getadcUsername(), "JeffTest123");
        passvalue(ad0.getadcPassword(), "Jeff@12345");
        passvalue(ad0.getadcConfirmPassword(), "Jeff@12345");
        passvalue(ad0.getadcFullName(), "Jeff Tester");
        passvalue(ad0.getadcEmail(), "jefftest123@gmail.com");
        Thread.sleep(10000);
        click(ad0.getadcTermsCheckBox());
        click(ad0.getadcRegisterBtn());
        Thread.sleep(20000);

    }
}
