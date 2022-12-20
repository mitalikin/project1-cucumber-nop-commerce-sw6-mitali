package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class TopMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy
            (xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logo;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;
    @CacheLookup
    @FindBy
            (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")////ul[@class='top-menu notmobile']/li[1]/a[1]
    WebElement clickOnComputer;
    @CacheLookup
    @FindBy
            (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")// (linkText = "Electronics")
    WebElement clickOnElectronics;
    @CacheLookup
    @FindBy
            (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")//(linkText = "Apparel")
    WebElement clickOnApparel;

    public void logoDisplay() {
        logo.isDisplayed();
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public void mouseHoverToElementAndClickOnComputer() {
        Reporter.log("Clicking on Computer Link : " + clickOnComputer.toString());
        clickOnElement(clickOnComputer);
    }

    public String verifyText(String text) {
        String message = getTextFromElement(clickOnComputer);
        log.info("Getting text from : " + text.toString());
        return message;
    }

    public String verifyText1(String text) {
        //clickOnElement(clickOnElectronics);
        String message = getTextFromElement(clickOnElectronics);
        return message;
    }

    public String verifyText3(String text) {
        // clickOnElement(clickOnApparel);
        String message = getTextFromElement(clickOnApparel);
        log.info("Getting text from : " + text.toString());
        return message;
    }

}
