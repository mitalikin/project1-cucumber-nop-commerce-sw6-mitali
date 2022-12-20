package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy
            (xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logo;
    @CacheLookup
    @FindBy
            (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")//ul[@class='top-menu notmobile']/li[1]/a[1]
    WebElement mouseHoverAndClickOnComputer;
    @CacheLookup
    @FindBy
            (linkText = "Desktops")  //(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement clickOnDeskTop;
    @CacheLookup
    @FindBy
            (xpath = "//select[@id='products-orderby']")
    WebElement selectSortByZToA;
    @CacheLookup
    @FindBy
            (xpath = "//select[@id='products-orderby']")
    WebElement selectSortByAToZ;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class='add-info']//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']")
    WebElement clickOnAddToCart;
    @CacheLookup
    @FindBy
            (xpath = "//h1[text()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy
            (xpath = "//select[@id='product_attribute_1']")
    WebElement selectFirstOptionFromProcessor;
    @CacheLookup
    @FindBy
            (name = "product_attribute_2")
    WebElement selectFirstOptionFromRam;
    @CacheLookup
    @FindBy
            (xpath = "//input[@id='product_attribute_3_7']")// (id = "product_attribute_3_7")
    // List<WebElement>selectRadioButton;
    WebElement selectRadioButton;

    @CacheLookup
    @FindBy
            (id = "product_attribute_4_9")
    WebElement selectRadioButton1;
    @CacheLookup
    @FindBy
            (id = "product_attribute_5_12")
    WebElement selectTotalCommander;

    @FindBy
            (id = "price-value-1")
    WebElement textPrice$1475;

    public void homepage() {
        logo.isDisplayed();
    }

    public void mouseHoverToElementAndClickOnComputer() {
        log.info("Clicking on Computer Tab : " + mouseHoverAndClickOnComputer.toString());
        clickOnElement(mouseHoverAndClickOnComputer);
    }

    public void setClickOnDeskTop() {
        log.info("Clicking on Desktop : " + clickOnDeskTop.toString());
        clickOnElement(clickOnDeskTop);
    }

    public void setSelectSortByZToA(String sortZToA) {
        clickOnElement(selectSortByZToA);
        selectByVisibleTextFromDropDown(selectSortByZToA, sortZToA);
    }

    public void setSelectSortByAToZ(String sortAToZ) {

        clickOnElement(selectSortByAToZ);

    }

    public void setClickOnAddToCart() {
        log.info("Clicking on Add to cart Tab : " + clickOnAddToCart.toString());
        clickOnElement(clickOnAddToCart);
    }

    public String getBuildYourComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectFirstOptionFromDropDown(String option) {
        selectByVisibleTextFromDropDown(selectFirstOptionFromProcessor, option);
    }

    public void selectFirstOptionFromDropDown2(String option) {
        selectByVisibleTextFromDropDown(selectFirstOptionFromRam, option);
    }

    public void selectRadioButtonTab(String text) {
        clickOnElementt(selectRadioButton, text);
        //clickOnElement(selectRadioButton);
    }

    public void selectRadioButton1Tab(String text) {
        clickOnElementt(selectRadioButton1, text);
        //clickOnElement(selectRadioButton1);
    }

    public void selectCheckbox() {
        // clickOnElementt(selectTotalCommander,text);
        clickOnElement(selectTotalCommander);
    }

    public String verifyPriceText() {
        return getTextFromElement(textPrice$1475);
    }

    @FindBy
            (xpath = "//select[@id='products-orderby']")
    List<WebElement> list;

    public ArrayList<String> getProductsNameList() {
        List<WebElement> products = list;// getListOfElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }

    public void selectProductByName(String product) {
        List<WebElement> products = list;//getListOfElements(By.xpath("//h4/a"));
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }

//    public void selectRadio(String gender) {
//        for (WebElement radio : selectRadioButton) {
//            if (radio.getText().contains(gender)) {
//               // CustomListeners.node.log(Status.PASS, "Select '" + gender + "' radio button");
//                Reporter.log("Select '" + gender + "' radio button" + "<br>");
//                clickOnElement(radio);
//                break;
//            }
//        }
//    }


}
