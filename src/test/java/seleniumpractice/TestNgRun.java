package seleniumpractice;

import org.pojo.POJOAdactin;
import org.sel.BaseClass;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class TestNgRun extends BaseClass {


    @BeforeMethod(alwaysRun = true)


    public static void launchbrowser() {
        browserLaunch();
    }

    @AfterClass
    public static void quitBrowser() {

    }

    public void executionTime() {
        Date d = new Date();
        System.out.println(d);
    }

    @DataProvider(name = "loginData")

    public Object[][] loginData() {
        return new Object[][]{
                {"AlphaUser01", "Alpha@2024", "Alpha@2024", "Alpha Tester", "alphauser01@gmail.com"},
                {"BetaLogin22", "Beta@7788", "Beta@7788", "Beta Kumar", "betalgn22@yahoo.com"},
                {"GammaQA33", "Gamma@5566", "Gamma@5566", "Gamma Priya", "gammaqa33@outlook.com"},
                {"DeltaTest44", "Delta@9090", "Delta@9090", "Delta Suresh", "deltatest44@gmail.com"},
                {"OmegaReg55", "Omega@1212", "Omega@1212", "Omega Raj", "omegareg55@mail.com"}
        };
    }


    //
//		@Test
//		public void FBTestCase1() {
//			launchUrl("https://www.facebook.com/");
//			POJOFaceBook fb = new POJOFaceBook();
//			passvalue(fb.getEmail(), "jeff");
//			passvalue(fb.getPass(), "123");
//			click(fb.getClick());
//		}
//
//		@Test
//		public void TC2() {
//			launchUrl("https://www.facebook.com/");
//			POJOFaceBook fb1 = new POJOFaceBook();
//			click(fb1.getClicks());
//			Assert.assertTrue(driver.getCurrentUrl().contains("entry_point=login"));
//
//		}
//		//All Empty Fields
//		@Test
//		public void TC3() throws InterruptedException {
//		launchUrl("https://www.facebook.com/r.php?entry_point=login");
//		Assert.assertTrue(driver.getCurrentUrl().contains("entry_point=login"));
//		POJOFaceBook fb2 = new POJOFaceBook();
//		click(fb2.getSignUp());
//		Thread.sleep(5000);
//		click(fb2.getFbErrBtn());
    //
//		System.out.println(fb2.getFbErrBtn().getText().contains("name"));
//		Assert.assertTrue(fb2.getNameError().getText().contains("name"));
    //
//		}

    //login adactin
//		@Test
//		public void TC4() {
//			launchUrl("https://adactinhotelapp.com/");
//			POJOFaceBook fb3 = new POJOFaceBook();
//			passvalue(fb3.getuserName(),"divya2829");
//			passvalue(fb3.getPassword(),"drithi@2608");
//			click(fb3.getAdaclgbtn());
//			System.out.println(driver.getCurrentUrl().contains("SearchHotel.php"));
//			Assert.assertTrue(driver.getCurrentUrl().contains("SearchHotel.php"));
//
//		}
//		@Test
//		//adactin registration
//		public void TC5() throws InterruptedException {
//			launchUrl("https://adactinhotelapp.com/");
//			POJOFaceBook fb4 = new POJOFaceBook();
//			click(fb4.getRegisterAdc());
//			Thread.sleep(5000);
//			System.out.println(driver.getCurrentUrl().contains("Register.php"));
//			Assert.assertTrue(driver.getCurrentUrl().contains("Register.php"));
    //	}

    @Test(dataProvider = "loginData", groups = "datas")
    public void TC345(String username, String password, String repassword, String fullname, String email) throws InterruptedException {
        launchUrl("https://adactinhotelapp.com/Register.php");
        SoftAssert st = new SoftAssert();
        POJOAdactin ad9 = new POJOAdactin();
        passvalue(ad9.getadcUsername(), username);
        passvalue(ad9.getadcPassword(), password);
        passvalue(ad9.getadcConfirmPassword(), repassword);
        passvalue(ad9.getadcFullName(), fullname);
        passvalue(ad9.getadcEmail(), email);
        Thread.sleep(10000);
        click(ad9.getadcTermsCheckBox());
        click(ad9.getadcRegisterBtn());
        Thread.sleep(20000);

        st.assertTrue(getDriver().getCurrentUrl().equals("https://adactinhotelapp.com/Register.php"));
        st.assertAll();
    }

    //empty registration tc2
//		@Test
//		public void TC6() throws InterruptedException {
//			launchUrl("https://adactinhotelapp.com/Register.php");
//			POJOFaceBook fb5 = new POJOFaceBook();
//			click(fb5.getRegister());
//			System.out.println(fb5.getUsernameEmptyErr().isDisplayed());
//			  Assert.assertTrue(fb5.getUsernameEmptyErr().isDisplayed());
//			    Assert.assertTrue(fb5.getPasswordEmptyErr().isDisplayed());
//			    Assert.assertTrue(fb5.getConfirmPassEmptyErr().isDisplayed());
//			    Assert.assertTrue(fb5.getFullNameEmptyErr().isDisplayed());
//			    Assert.assertTrue(fb5.getEmailEmptyErr().isDisplayed());
//			    Assert.assertTrue(fb5.getCaptchaEmptyErr().isDisplayed());
//
//		}
    //
    //tc1 valid creds
    //
    @Test(groups = "smoke")
    public void TC101() throws InterruptedException {
        launchUrl("https://adactinhotelapp.com/Register.php");
        POJOAdactin ad = new POJOAdactin();
        passvalue(ad.getadcUsername(), "JeffTest123");
        passvalue(ad.getadcPassword(), "Jeff@12345");
        passvalue(ad.getadcConfirmPassword(), "Jeff@12345");
        passvalue(ad.getadcFullName(), "Jeff Tester");
        passvalue(ad.getadcEmail(), "jefftest123@gmail.com");
        Thread.sleep(10000);
        click(ad.getadcTermsCheckBox());
        click(ad.getadcRegisterBtn());
        Thread.sleep(20000);

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://adactinhotelapp.com/Register.php");

    }

    //tc2 empty pass nd confirmpass
    @Test(groups = "regression")
    public void TC8() throws InterruptedException {
        launchUrl("https://adactinhotelapp.com/Register.php");
        POJOAdactin ad1 = new POJOAdactin();
        passvalue(ad1.getadcUsername(), "Jeffrinll123");
        passvalue(ad1.getadcFullName(), "Jeffri");
        passvalue(ad1.getadcEmail(), "jefftest1234@gmail.com");
        Thread.sleep(10000);
        click(ad1.getadcTermsCheckBox());
        click(ad1.getadcRegisterBtn());
        Thread.sleep(20000);
        Assert.assertEquals("Password is Empty", ad1.getPasswordEmptyErr().getText());
        Assert.assertEquals("Confirm Password is Empty", ad1.getConfirmPassEmptyErr().getText());


    }
    //tc4 pass min char

    //tc3 without fullname nd username
    @Test
    public void TC7() throws InterruptedException {
        launchUrl("https://adactinhotelapp.com/Register.php");
        POJOAdactin ad3 = new POJOAdactin();


        passvalue(ad3.getadcPassword(), "Jeff@12345");
        passvalue(ad3.getadcConfirmPassword(), "Jeff@12345");

        passvalue(ad3.getadcEmail(), "jefftest123@gmail.com");
        Thread.sleep(10000);
        click(ad3.getadcTermsCheckBox());
        click(ad3.getadcRegisterBtn());
//		    Assert.assertTrue(fb7.getUsernameEmptyErr().isDisplayed());
//		    Assert.assertTrue(fb7.getFullNameEmptyErr().isDisplayed());
        Assert.assertEquals(ad3.getUsernameEmptyErr().getText(), "Username is Empty");
        Assert.assertEquals("Username is Empty", ad3.getUsernameEmptyErr().getText());
        Assert.assertEquals(ad3.getFullNameEmptyErr().getText(), "Full Name is Empty");
        Assert.assertEquals("Full Name is Empty", ad3.getFullNameEmptyErr().getText());
    }

    @AfterMethod
    public void executionEndTime() {
        Date d = new Date();
        System.out.println(d);
    }


}
