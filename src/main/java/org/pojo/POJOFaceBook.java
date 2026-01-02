package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

public class POJOFaceBook extends BaseClass {


    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "pass")
    private WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//a[text()='Create new account']")
    private WebElement createbtn;
    @FindBy(xpath = "//button[@name='websubmit']")
    private WebElement signUpBtn;
    @FindBy(xpath = "//div[contains(@class,'_5633')]")
    private WebElement nameError;
    @FindBy(id = "username")
    private WebElement usrname;
    @FindBy(id = "password")
    private WebElement passwrd;
    @FindBy(id = "login")
    private WebElement loginbttn;
    @FindBy(id = "Submit")
    private WebElement register;
    @FindBy(xpath = "//a[text()='New User Register Here']")
    private WebElement registeradc;

    public POJOFaceBook() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getRegister() {
        return register;
    }

    public WebElement getRegisterAdc() {
        return registeradc;
    }

    public WebElement getAdaclgbtn() {
        return loginbttn;

    }

    public WebElement getPassword() {
        return passwrd;
    }

    public WebElement getuserName() {
        return usrname;
    }

    public WebElement getNameError() {
        return nameError;
    }

    public WebElement getSignUp() {
        return signUpBtn;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPass() {
        return password;
    }

    public WebElement getClick() {
        return loginBtn;
    }

    public WebElement getClicks() {
        return createbtn;
    }
}
