package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class LoginPage extends Utility {

    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log In']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement acceptCookie;
    @CacheLookup
    @FindBy(xpath = "//a[@class='active']")
    WebElement loginText;


    public void clickOnLoginLink(){
        log.info("clickon login link : " + loginLink.toString());
        clickOnElement(loginLink);
    }
    public void clickOnAcceptCookies(){
        log.info("clickon acceptcookie link : " + acceptCookie.toString());
        clickOnElement(acceptCookie);
    }
    public String getLoginText (){
        String message = getTextFromElement(loginText);
        log.info("Getting text from : " + loginText.toString());
        return message;
    }

}
