package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

public class POJOAdactin extends BaseClass {

    @FindBy(id = "username")
    private WebElement adcusername;
    @FindBy(id = "password")
    private WebElement adcpassword;
    @FindBy(id = "re_password")
    private WebElement adcconfirmPassword;
    @FindBy(id = "full_name")
    private WebElement adcfullname;
    @FindBy(id = "email_add")
    private WebElement adcemail;
    @FindBy(id = "captcha-form")
    private WebElement adccaptchaText;
    @FindBy(id = "tnc_box")
    private WebElement adctermsCheckBox;
    @FindBy(id = "Submit")
    private WebElement adcregisterBtn;
    @FindBy(xpath = "//td[@class='reg_success']")
    private WebElement adcsuccessMessage;
    @FindBy(xpath = "//label[contains(text(),'Username is Empty')]")
    private WebElement usernameEmptyErr;
    @FindBy(xpath = "//*[contains(text(),'Password is Empty')]")
    private WebElement passwordEmptyErr;
    @FindBy(xpath = "//*[contains(text(),'Confirm Password is Empty')]")
    private WebElement confirmPassEmptyErr;
    @FindBy(xpath = "//*[contains(text(),'Full Name is Empty')]")
    private WebElement fullNameEmptyErr;
    @FindBy(xpath = "//*[contains(text(),'Email Address is Empty')]")
    private WebElement emailEmptyErr;
    @FindBy(xpath = "//*[contains(text(),'Captcha is Empty')]")
    private WebElement captchaEmptyErr;
    @FindBy(xpath = "//i[@class=\"_5dbc img sp_98fCI7IVTTz sx_54513f\"][1]")
    private WebElement fbErrbtn;
    @FindBy(xpath = "//*[contains(text(),'Password must contain minimum 6 characters')]")
    private WebElement passchrErrbtn;
    @FindBy(xpath = "//*[contains(text(),'Passwords Do Not Match')]")
    private WebElement confchrerrbtn;
    @FindBy(xpath = "//label[@id='email_add_span']")
    private WebElement ivemailbtn;

    public POJOAdactin() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getIvemlbtn() {
        return ivemailbtn;
    }


    public WebElement getconfchrerrbtn() {
        return confchrerrbtn;
    }

    public WebElement getPasschrErrbtn() {
        return passchrErrbtn;
    }

    public WebElement getFbErrBtn() {
        return fbErrbtn;
    }

    public WebElement getUsernameEmptyErr() {
        return usernameEmptyErr;
    }

    public WebElement getPasswordEmptyErr() {
        return passwordEmptyErr;
    }

    public WebElement getConfirmPassEmptyErr() {
        return confirmPassEmptyErr;
    }

    public WebElement getFullNameEmptyErr() {
        return fullNameEmptyErr;
    }

    public WebElement getEmailEmptyErr() {
        return emailEmptyErr;
    }

    public WebElement getCaptchaEmptyErr() {
        return captchaEmptyErr;
    }


    public WebElement getadcUsername() {
        return adcusername;
    }

    public WebElement getadcPassword() {
        return adcpassword;
    }

    public WebElement getadcConfirmPassword() {
        return adcconfirmPassword;
    }

    public WebElement getadcFullName() {
        return adcfullname;
    }

    public WebElement getadcEmail() {
        return adcemail;
    }

    public WebElement getadcCaptchaText() {
        return adccaptchaText;
    }

    public WebElement getadcTermsCheckBox() {
        return adctermsCheckBox;
    }

    public WebElement getadcRegisterBtn() {
        return adcregisterBtn;
    }

    public WebElement getadcSuccessMessage() {
        return adcsuccessMessage;
    }
}

