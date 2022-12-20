package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on topmenu link$")
    public void iClickOnTopmenuLink() {
        new TopMenuPage().clickOnMenuTab("Computers");
        new TopMenuPage().clickOnMenuTab("Electronics");
        new TopMenuPage().clickOnMenuTab("Apparel");
        new TopMenuPage().clickOnMenuTab("Digital downloads");
        new TopMenuPage().clickOnMenuTab("Books");
        new TopMenuPage().clickOnMenuTab("Jewelry");
        new TopMenuPage().clickOnMenuTab("Gift Cards");


    }

    @Then("^I should navigate to each topmenu link successfully$")
    public void iShouldNavigateToEachTopmenuLinkSuccessfully() {
       new TopMenuPage().mouseHoverToElementAndClickOnComputer();
        String expectedText = "Computers";
        String actualText1 = new TopMenuPage().verifyText("Computers");
        Assert.assertEquals("Text not Matched", expectedText, actualText1);


        String expectedText1= "Electronics";
        String actualText = new TopMenuPage().verifyText1("Electronics");
        Assert.assertEquals("Text not Matched", expectedText1, actualText);


        String expectedText2= "Apparel";
        String actualText2 = new TopMenuPage().verifyText3("Apparel");
        Assert.assertEquals("Text not Matched", expectedText2, actualText2);

    }

}
