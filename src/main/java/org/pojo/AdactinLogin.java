package org.pojo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

import java.util.List;

public class AdactinLogin extends BaseClass {

    @FindBy(xpath = "//input[@class='login_input']")
    private List<WebElement> allElementwithattribute;
    @FindBy(id = "login")
    private WebElement aadtLoginBtn;

    public AdactinLogin() {

        PageFactory.initElements(getDriver(), this);
        // TODO Auto-generated constructor stub
    }

    public WebElement getAdtLoginBtn() {
        return aadtLoginBtn;
    }


    public List<WebElement> getAllElementwithattribute() {
        return allElementwithattribute;
    }

}
