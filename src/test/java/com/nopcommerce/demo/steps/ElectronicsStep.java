package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicsStep {
//    @Given("^I am on electronics page$")
//    public void iAmOnElectronicsPage() {
////new ElectronicsPage().electronicsText();
//
//    }
@Given("^I am on homepage page$")
public void iAmOnHomepagePage() {
new TopMenuPage().logoDisplay();
}
    @When("^Mouse Hover on “Electronics”Tab$")
    public void mouseHoverOnElectronicsTab() {
   new ElectronicsPage().electronicsPage();
    }


    @And("^Click on Muuseover and click on cellphone$")
    public void clickOnMuuseoverAndClickOnCellphone() {
        new ElectronicsPage().setMouseHooverOnCellPhone();
    }

    @Then("^Verify the text “Cell phones\"$")
    public void verifyTheTextCellPhones()  {
        String expectedMessage = "Cell phones";
        String actualMessage = new ElectronicsPage().cellPhone();
        Assert.assertEquals("Text not displayed",expectedMessage, actualMessage) ;

        // Assert.assertEquals("Text not displayed", text, new ElectronicsPage().cellPhone());
    }


    @And("^Click on List View Tab$")
    public void clickOnListViewTab() {
    new ElectronicsPage().listView();
    }
    @And("^Click on product name \"([^\"]*)\" on page$")
    public void clickOnProductNameOnPage(String text)  {
        new ElectronicsPage().nokiaLumia();
    }
    @And("^Verify the Product text \"([^\"]*)\"$")
    public void verifyTheProductText(String text) {
        String expectedText1 = "Nokia Lumia 1020";
        String actualMessage1 = new ElectronicsPage().nokiaLumia1();
        Assert.assertEquals("Text not displayed",expectedText1, actualMessage1) ;
    }

    @And("^Verify the price \"([^\"]*)\"$")
    public void verifyThePrice(String arg0)  {
        String expectedMessage2 = "$349.00";
       String actualMessage2 = new ElectronicsPage().verifyText1$349();
     Assert.assertEquals("Text not displayed",expectedMessage2, actualMessage2);
    }


    @And("^Change quantity to \"([^\"]*)\"$")
    public void changeQuantityTo(String text)  {
       new ElectronicsPage().changeQuntity1("2");
    }

    @And("^Click on “ADD TO CART” tab$")
    public void clickOnADDTOCARTTab() {
    new ElectronicsPage().addToCart();
    }

    @And("^Verify the Message \"([^\"]*)\" on Topgreen Bar$")
    public void verifyTheMessageOnTopgreenBar(String text)  {
        //String expectedMessage2 = "$349.00";
        String actualMessage2 = new ElectronicsPage().message1();
        Assert.assertEquals("Text not displayed",text, actualMessage2);
    }

    @And("^close the bar clicking on the cross button\\.$")
    public void closeTheBarClickingOnTheCrossButton() {
    new ElectronicsPage().closeButton();
    }


    @And("^MouseHover on Shopping cart Click on GO TO CART button\\.$")
    public void mousehoverOnShoppingCartClickOnGOTOCARTButton() {
    new ElectronicsPage().clickOnShoppingCart();
    }

    @And("^Verify the Text Shopping cart on Electronics page$")
    public void verifyTheTextShoppingCartOnElectronicsPage() {
        String expectedMessage3 = "Shopping cart";
        String actualMessage3 = new ElectronicsPage().verifyShoppingCart();
        Assert.assertEquals("Text not displayed",expectedMessage3, actualMessage3);
    }


    @And("^Verify the Total \"([^\"]*)\"$")
    public void verifyTheTotal(String text)  {
        String actualMessage4 = new ElectronicsPage().totalText698();
        Assert.assertEquals("Text not displayed",text, actualMessage4);
    }

    @And("^click on checkbox “I agree with the terms of service”$")
    public void clickOnCheckboxIAgreeWithTheTermsOfService() {
    new ElectronicsPage().checkBox();
    }

    @And("^Click on “CHECKOUT” On Electronics page$")
    public void clickOnCHECKOUTOnElectronicsPage() {
    new ElectronicsPage().checkOut();
    }

    @And("^Verify the Text “Welcome, Please Sign In!”$")
    public void verifyTheTextWelcomePleaseSignIn() {
        String expectedMessage5 = "Welcome, Please Sign In!";
        String actualMessage5 = new ElectronicsPage().welcomeMessage1();
        Assert.assertEquals("Text not displayed",expectedMessage5, actualMessage5);
    }
}
