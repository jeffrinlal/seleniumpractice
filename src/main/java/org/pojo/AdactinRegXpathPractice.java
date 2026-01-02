package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

public class AdactinRegXpathPractice extends BaseClass {

    @FindBy(xpath = "/html/body/table[2]/tbody/tr/td[1]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement absolutexpathUsername;

    // Absolute Xpath
    @FindBy(xpath = "//*[@id='password']")
    private WebElement relativexpathPassword;

    //Relative xpath

    //    With attribute
//----------------
//  //tagname[@attributename='attribute']
    @FindBy(xpath = "//a[text()='Adactin.com']")
    private WebElement adactindotcom;

//    with text:
//            ---------------
// //taganme[text()='text']
    @FindBy(xpath = "//a[contains(text(),'Adactin')]")
    private WebElement adactindotcom2;

//    contains with text
//-------------------

//tagname[contains(text(),'partial text')]
    @FindBy(xpath = "//*[contains(text(),'Adactin')]")
    private WebElement adactindotcom3;

//    xpath with * operator
//-------------------------
    @FindBy(xpath = "//input[contains(@id,'form')]")
    private WebElement captchaText;

//    xpath with index
//-------------------
//        (//*[@attributename='attribute'])[1]

//    contains with attribute
//------------------------
// //tagname[contains(@attibutename,'partialattributevalue')]
    @FindBy(xpath = "//*[@id='password' or @name='password']")
    private WebElement passwordwithORoperator;

//    xpath with or Operator
//--------------------------
// //*[@name='firstname' or @id='u_0_8_Gg' or text()='FirstName']
    @FindBy(xpath = "//input[starts-with(@name,'pass')]")
    private WebElement passwordwithstartswith;

//    xpath with starts-with:
//            -----------------------
//
// //tagname[starts-with(@name,'Fir')]
//
// //input[starts-with(@name,'fir')]
    //
//    xpath with position
//----------------------
//        (//input)[@type='text'] [position()=6]
    @FindBy(xpath = "((//input)[@type='text'][position()=2]]")
    private WebElement positionexample;
    //
//    xpath with last()
//----------------------
//        (//input[@type='text'])[last()]  //last elmenet
//        (//input[@type='text'])[last()-1] //second last
    @FindBy(xpath = "//*[@type='text'][last()]")
    private WebElement lastexample;
    //
// //tagname[normalize space(text()='Login')]
// //button[normalize-space(text())='Login']
    @FindBy(xpath = "//button[normalize-space(text())='Login']")
    private WebElement normalizespaceexample;
//
//    xpath with normalize space
//-----------------------------
    //
// //xpath with self
//        -----------------------
//    selecting the same node or current node
//--------------------------------------
// //input[@name='firstname']/self::input
    @FindBy(xpath = "//input[@name='username']/self::input")
    private WebElement selfexample;
    @FindBy(xpath = "//div[@id='reg_form_box']/descendant::input")
    private WebElement descendantexample;
//
// //xpath with descendant
//        -----------------------------
// //div[@id='reg_form_box']/descendant::input
    @FindBy(xpath = "//input[contains(@name,'last') or contains(@placeholder,'Sur')]")
    private WebElement descendantexample2;

//
//
// //input[contains(@name,'last') or contains(@placeholder aria-label,'Sur')]
    @FindBy(xpath = "//input[@name='firstname']//ancestor::div[@id='u_0_7_kf']")
    private WebElement ancestorexample;


//
//
//
//
//    Axes and coordinates:
//            ---------------------
//
//
//    ancestor:
//            ----------------
//
// //input[@name='firstname']//ancestor::div[14] with tag only
// //input[@name='firstname']//ancestor::div[@id='u_0_7_Op']   with attribute it matches  the exact ancestor node
    @FindBy(xpath = "//input[@name='firstname']//parent::div[@class='value']")
    private WebElement parentexample;


//
//
//    parent:
//            ----------------
//    child with parent
//
//-----------------------
// //input[@name='firstname']//parent::div
// //input//parent::div[@class='value']
    @FindBy(xpath = "//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//child::input[@name='firstname']")
    private WebElement childexample;


//
//    child:
//            ---------------
//
//    parent to child
//
// //div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//child::input[@name='firstname']
    @FindBy(xpath = "//div[text()='First name']//following-sibling::input[@name='firstname']")
    private WebElement followingsiblingexample;
//
//    Following-sibling:
//            ------------------------
//
// //div[text()='First name']//following-sibling::input[@name='firstname']
    @FindBy(xpath = "//input[@name='firstname']//preceding-sibling::div[text()='First name']")
    private WebElement precedingsiblingexample;
//
//    preceding-sibling:
//            --------------------------
// //input[@name='firstname']//preceding-sibling::div[text()='First name']

    public AdactinRegXpathPractice() {
        PageFactory.initElements(getDriver(), this);
    }
//
//
//


}

