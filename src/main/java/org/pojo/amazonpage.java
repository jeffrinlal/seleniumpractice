package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

import java.util.List;

public class amazonpage extends BaseClass {
  public  amazonpage(){
      PageFactory.initElements(getDriver(), this);

    }
    @FindBy(xpath = "//a[@class='nav-a  ']")
    private List<WebElement>  commonlocators;


    public List<WebElement> getCommonlocators() {
        return commonlocators;
    }
}
