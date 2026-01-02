package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;


public class POJOLogin extends BaseClass {


    @FindBy(id = "username")
    private WebElement adtUsername;
    @FindBy(id = "password")
    private WebElement adtPassword;
    @FindBy(id = "login")
    private WebElement adtLoginBtn;
    @FindBy(xpath = "//div[@class='auth_error']")
    private WebElement adtInvalidLoginErr;

    // Constructor
    public POJOLogin() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getAdtUsername() {
        return adtUsername;
    }

    public WebElement getAdtPassword() {
        return adtPassword;
    }

    public WebElement getAdtLoginBtn() {
        return adtLoginBtn;
    }

    public WebElement getAdtInvalidLoginErr() {
        return adtInvalidLoginErr;
    }
}

