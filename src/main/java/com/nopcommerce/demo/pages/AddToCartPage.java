package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddToCartPage.class.getName());

    public AddToCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy
            (id = "add-to-cart-button-1")
    WebElement addToCart;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class='bar-notification success']/p[1]")
    WebElement textMessage1;
    @CacheLookup
    @FindBy
            (xpath = "//span[@class='close']")
    WebElement closeMessage;
    @CacheLookup
    @FindBy
            (xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCar;
    @CacheLookup
    @FindBy
            (xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnAddToCart1;
    @CacheLookup
    @FindBy
            (xpath = "//h1[text()='Shopping cart']")
    WebElement textMessage2;

    @CacheLookup
    @FindBy
    // (xpath = "//input[@class='qty-input']")//--//input[@id='itemquantity11263']//----//input[@class='qty-input']
    WebElement clickOnUpdateBasket1;
    @CacheLookup
    @FindBy
            (xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy
            (xpath = "//tbody/tr[4]/td[2]/span[1]/strong[1]")
    WebElement verifyTotal$2950;
    @CacheLookup
    @FindBy
            (xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/input[1]")
    WebElement clickOnCheckBox;
    @CacheLookup
    @FindBy
            (xpath = "//button[@class='button-1 checkout-button']")
    WebElement checkoutTab;
    @CacheLookup
    @FindBy
            (xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;
    @CacheLookup
    @FindBy
            (xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkoutGuest;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_LastName")
    WebElement LastName;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_Address1")
    WebElement address1;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_ZipPostalCode")
    WebElement zipPostalCode;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy
            (xpath = "//div[@id='billing-buttons-container']//button[text()='Continue']")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy
            (id = "shippingoption_1")
    WebElement nextDayAir;
    @CacheLookup
    @FindBy
            (xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement clickOnContinue1;
    @CacheLookup
    @FindBy
            (id = "paymentmethod_1")
    WebElement selectRadioButton2;
    @CacheLookup
    @FindBy
            (xpath = "//button[@type='button'and@onclick='PaymentMethod.save()']")
    WebElement clickOnRadioButton;
    @CacheLookup
    @FindBy
            (id = "CreditCardType")
    WebElement masterCard;
    @FindBy
            (xpath = "//select[@id='CreditCardType']")
    WebElement selectMasterCard;
    @CacheLookup
    @FindBy
            (id = "CardholderName")
    WebElement cardholderName;
    @CacheLookup
    @FindBy
            (id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy
            (id = "ExpireMonth")
    WebElement expireMonth;
    @CacheLookup
    @FindBy
            (id = "ExpireYear")
    WebElement expireYear;
    @CacheLookup
    @FindBy
            (xpath = "//input[@data-val-regex='Wrong card code']")
    WebElement cvv;
    @CacheLookup
    @FindBy
            (xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement getClickOnContinue;
    @CacheLookup
    @FindBy
            (xpath = "//span[contains(text(),'Payment Method:')]")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy
            (xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyMessage6;
    @CacheLookup
    @FindBy
            (xpath = "//span[contains(text(),'Shipping Method:')]")
    WebElement verifyMessage7;
    @CacheLookup
    @FindBy
            (xpath = "//ul//li//span[contains(text(),'Next Day Air')]")
    WebElement verifyMessage8;
    @CacheLookup
    @FindBy
            (xpath = "//span//strong[contains(text(),'$2,950.00')]")
    WebElement total;
    @CacheLookup
    @FindBy
            (xpath = "//button[@type='button' and @onclick='ConfirmOrder.save()']")
    WebElement confirmButton1;
    @CacheLookup
    @FindBy
            (xpath = "//h1[text()='Thank you']")
    WebElement thankYou;
    @CacheLookup
    @FindBy
            (xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement yourOrder;
    @CacheLookup
    @FindBy
            (xpath = "//button[@onclick='setLocation(\"/\")']")
    WebElement continue3;
    @CacheLookup
    @FindBy
            (xpath = "//h2[text()='Welcome to our store']")
    WebElement welcomeToOurStore;

    public void clickOnAddToCart() {
        log.info("Clicking on Add to oCart Link : " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getText1() {
        log.info("Get Text Message : " + textMessage1.toString());
        return getTextFromElement(textMessage1);
    }

    public void clickOnCloseBox() {
        log.info("Clicking on Cross button : " + closeMessage.toString());
        clickOnElement(closeMessage);
    }

    public void mouseHooverAndClickOnAddToCart() {

        mouseHoverToElement(mouseHoverOnShoppingCar);
        clickOnElement(clickOnAddToCart1);
    }

    public String getText2() {
        log.info("Verify Text Message : " + textMessage2.toString());
        return getTextFromElement(textMessage2);
    }

    public void updateBasket(String text) {
        Actions action = new Actions(driver);
        WebElement qty = driver.findElement(By.xpath("//input[@class='qty-input']"));//chnge from by
        qty.click();
        qty.clear();
        qty.sendKeys(text);

    }

    public void updateOnShoppingCart() {
        log.info("Clicking on Update ShoppingCart : " + clickOnUpdateShoppingCart.toString());
        clickOnElement(clickOnUpdateShoppingCart);
    }

    public String getTextTotal() {
        log.info("Verify Text  : " + verifyTotal$2950.toString());
        return getTextFromElement(verifyTotal$2950);
    }

    public void clickOnCheckBox() {
        log.info("Clicking on CheckBox : " + clickOnCheckBox.toString());
        clickOnElement(clickOnCheckBox);
    }

    public void clickOnCheckOut() {
        log.info("Clicking on CheckOut : " + checkoutTab.toString());
        clickOnElement(checkoutTab);
    }

    public String getTexts() {
        log.info("Verify Text Message : " + welcomeMessage.toString());
        return getTextFromElement(welcomeMessage);
    }

    public void setCheckoutGuest() {
        log.info("Clicking on Guest Checkout Tab : " + checkoutGuest.toString());
        clickOnElement(checkoutGuest);
    }

    public void enterFirstname(String text) {
        log.info("Sending FirstName  : " + text + " to " + firstName.toString());
        sendTextToElement(firstName, text);
    }

    public void enterLastname(String text) {
        log.info("Sending Lastname  : " + text + " to " + LastName.toString());
        sendTextToElement(LastName, text);
    }

    public void enterEmail1(String text) {
        log.info("Sending email  : " + text + " to " + email.toString());
        sendTextToElement(email, text);
    }

    public void enterCountry(String text) {
        log.info("Select Country  : " + text + " to " + country.toString());
        selectByVisibleTextFromDropDown(country, text);
    }

    public void enterCity(String text) {
        log.info("Enter City  : " + text + " to " + city.toString());
        sendTextToElement(city, text);
    }

    public void enterZipPostalCode(String text) {
        log.info("Enter PostCode  : " + text + " to " + zipPostalCode.toString());
        sendTextToElement(zipPostalCode, text);
    }

    public void enterAddress1(String text) {
        log.info("Enter address1  : " + text + " to " + address1.toString());
        sendTextToElement(address1, text);
    }

    public void enterPhoneNumber(String text) {
        log.info("Enter phoneNumber  : " + text + " to " + phoneNumber.toString());
        sendTextToElement(phoneNumber, text);
    }

    public void setClickOnContinue() {
        log.info("Clicking on Continue Tab : " + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    public void setNextDayAir() {
        log.info("Clicking on RadioButton : " + nextDayAir.toString());
        clickOnElement(nextDayAir);
    }

    public void setClickOnContinue1() {
        log.info("Clicking on Continue Tab : " + clickOnContinue1.toString());
        clickOnElement(clickOnContinue1);
    }

    public void selectRadioButton2Tab() {
        clickOnElement(selectRadioButton2);
        clickOnElement(clickOnRadioButton);
    }

    public void setSelectMasterCard(String text) {
        clickOnElement(masterCard);
        selectByVisibleTextFromDropDown(selectMasterCard, text);
    }

    public void enterCardHolderName(String text) {
        log.info("Enter cardholder name  : " + text + " to " + cardholderName.toString());
        sendTextToElement(cardholderName, text);
    }

    public void cardNumber(String text) {
        log.info("Enter cardNumber name  : " + text + " to " + cardNumber.toString());
        sendTextToElement(cardNumber, text);

    }

    public void expireMonth(String text) {
        log.info("Enter expireMonth  : " + text + " to " + expireMonth.toString());
        sendTextToElement(expireMonth, text);

    }

    public void expireYear(String text) {
        log.info("Enter expireYear  : " + text + " to " + expireYear.toString());
        sendTextToElement(expireYear, text);

    }

    public void cvv(String text) {
        log.info("Enter cvvNumber  : " + text + " to " + cvv.toString());
        sendTextToElement(cvv, text);

    }

    public void continue1() {
        log.info("Clicking on Continue Tab : " + getClickOnContinue.toString());
        clickOnElement(getClickOnContinue);
    }

    public String getPaymentMethod() {
        log.info("Verify PaymentMethod : " + paymentMethod.toString());
        return getTextFromElement(paymentMethod);
    }

    public String verifyMessage6() {
        log.info("Verify Message : " + verifyMessage6.toString());
        return getTextFromElement(verifyMessage6);
    }

    public String verifyMessage7() {
        log.info("Verify Message : " + verifyMessage7.toString());
        return getTextFromElement(verifyMessage7);
    }

    public String verifyMessage8() {
        log.info("Verify Message : " + verifyMessage8.toString());
        return getTextFromElement(verifyMessage8);
    }

    public String verifyTotal() {
        log.info("Verify Total : " + total.toString());
        return getTextFromElement(total);
    }

    public void confirm1() {
        log.info("Clicking on confirm Tab : " + confirmButton1.toString());
        clickOnElement(confirmButton1);
    }

    public String verifyThankYou() {
        log.info("Verify Message : " + thankYou.toString());
        return getTextFromElement(thankYou);
    }

    public String verifyYourOrder() {
        log.info("Verify Message : " + yourOrder.toString());
        return getTextFromElement(yourOrder);
    }

    public void clickContinue3() {
        log.info("Clicking on Continue Tab : " + continue3.toString());
        clickOnElement(continue3);
    }

    public String welcomeToStore() {
        log.info("Verify Text : " + welcomeToOurStore.toString());
        return getTextFromElement(welcomeToOurStore);
    }


}
