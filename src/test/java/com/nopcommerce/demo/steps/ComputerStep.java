package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.AddToCartPage;
import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;

public class ComputerStep {
    @When("^I Mouse hover on “Computer” Tab and click$")
    public void iMouseHoverOnComputerTabAndClick() {
        new ComputerPage().mouseHoverToElementAndClickOnComputer();
    }

    @And("^click mousehoover and click on Desktop$")
    public void clickMousehooverAndClickOnDesktop() {
        new ComputerPage().setClickOnDeskTop();
    }

    @And("^I can Select Sort By position Name: Z to A$")
    public void iCanSelectSortByPositionNameZToA() {
        new ComputerPage().setSelectSortByZToA("Name: Z to A");
    }

    @Then("^Verify the Product will arrange in Descending order$")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        ArrayList<String> originalProductsName = new ComputerPage().getProductsNameList();
        Collections.reverse(originalProductsName);
        ArrayList<String> afterSortByZToAProductsName = new ComputerPage().getProductsNameList();
        Assert.assertEquals("Login page not displayed", afterSortByZToAProductsName, originalProductsName);
    }

    @And("^Select Sort By position \"([^\"]*)\"$")
    public void selectSortByPosition(String text) {
        new ComputerPage().setSelectSortByAToZ("Name: A to Z");
    }

    @And("^click on Add to cart Tab$")
    public void clickOnAddToCartTab() {
        new ComputerPage().setClickOnAddToCart();

    }

    @And("^i can verify the text 'Build your own computer'$")
    public void iCanVerifyTheTextBuildYourOwnComputer() {
        String expectedMessage = "Build your own computer";
        String actualMessage = new ComputerPage().getBuildYourComputerText();
        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);
    }


    @And("^Select \"([^\"]*)\"$")
    public void select(String option) {
        new ComputerPage().selectFirstOptionFromDropDown(option);
    }


    @And("^Select \"([^\"]*)\" fromdropdown$")
    public void selectFromdropdown(String option) {
        new ComputerPage().selectFirstOptionFromDropDown2(option);
    }

    @When("^click on HDD radio \"([^\"]*)\"$")
    public void click_on_HDD_radio(String text) {
        new ComputerPage().selectRadioButtonTab(text);
    }

    @And("^Select OS radio \"([^\"]*)\"$")
    public void selectOSRadio(String text) {
        new ComputerPage().selectRadioButton1Tab(text);
    }

    @And("^select checkBox$")
    public void selectCheckBox() {
        new ComputerPage().selectCheckbox();
    }

    @And("^verify the  Verify the price \"([^\"]*)\"$")
    public void verifyTheVerifyThePrice(String text) {
        String expectedMessage2 = "$1,475.00";
        Assert.assertEquals("Text not displayed", expectedMessage2, text);
    }
    @And("^Click on ADD TO CARD Button$")
    public void clickOnADDTOCARDButton() {
        new AddToCartPage().clickOnAddToCart();
    }
    @And("^Verify the Message \"([^\"]*)\" on TopGreen Bar After that close the bar clicking on the cross button$")
    public void verifyTheMessageOnTopGreenBarAfterThatCloseTheBarClickingOnTheCrossButton(String text) {
        String expectedMessage3 = "The product has been added to your shopping cart";
        Assert.assertEquals("Error not displayed", text, new AddToCartPage().getText1());
    }


    @And("^close the bar clicking on the cross button$")
    public void closeTheBarClickingOnTheCrossButton() {
        new AddToCartPage().clickOnCloseBox();
    }

    @And("^MouseHover on Shopping cart and Click on GO TO CART button$")
    public void mousehoverOnShoppingCartAndClickOnGOTOCARTButton() {
        new AddToCartPage().mouseHooverAndClickOnAddToCart();
    }


    @And("^Verify the Text \"([^\"]*)\"$")
    public void verifyTheText(String text) {
        String expectedMessage4 = "Shopping cart";
        //String actualMessage4 = new AddToCartPage().getText2();
        Assert.assertEquals("Text not displayed", expectedMessage4, text);
    }

    @And("^Change the Qty to \"([^\"]*)\"$")
    public void changeTheQtyTo(String text) {
        new AddToCartPage().updateBasket("2");
    }

    @And("^Click on Update shopping cart$")
    public void clickOnUpdateShoppingCart() {
        new AddToCartPage().updateOnShoppingCart();
    }

    @And("^Verify the Total\"([^\"]*)\"$")
    public void verifyTheTotal(String text) {
        Assert.assertEquals("Error not displayed", text, new AddToCartPage().getTextTotal());
    }
    @And("^click on checkbox “I agree with the terms of service\"$")
    public void clickOnCheckboxIAgreeWithTheTermsOfService() {
        new AddToCartPage().clickOnCheckBox();
    }

    @And("^Click on “CHECKOUT”$")
    public void clickOnCHECKOUT() {
        new AddToCartPage().clickOnCheckOut();
    }

    @Then("^User can navigate to Register page$")
    public void userCanNavigateToRegisterPage() {
        String expectedMessage6 = "Welcome, Please Sign In!";
        String actualMessage6 = new AddToCartPage().getTexts();
        Assert.assertEquals("Text not displayed", expectedMessage6, actualMessage6);
    }


}
