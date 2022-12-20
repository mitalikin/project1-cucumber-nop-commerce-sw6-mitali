$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("electronics.feature");
formatter.feature({
  "line": 2,
  "name": "Electronics Test",
  "description": "As user I want to navigate computer page into nop commerce website",
  "id": "electronics-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Electronics"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 15106841900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "verify That The Product Added Successfully And Place Order Successfully",
  "description": "",
  "id": "electronics-test;verify-that-the-product-added-successfully-and-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on homepage page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Mouse Hover on “Electronics”Tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Muuseover and click on cellphone",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify the text “Cell phones\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click on List View Tab",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Click on product name \"NokiaLumia1020\" on page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify the Product text \"Nokia Lumia 1020\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Verify the price \"$349.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Change quantity to \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on “ADD TO CART” tab",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify the Message \"The product has been added to your shopping cart\" on Topgreen Bar",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "close the bar clicking on the cross button.",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "MouseHover on Shopping cart Click on GO TO CART button.",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the Text Shopping cart on Electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Verify the Total \"$698.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "click on checkbox “I agree with the terms of service”",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Click on “CHECKOUT” On Electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Verify the Text “Welcome, Please Sign In!”",
  "keyword": "And "
});
formatter.match({
  "location": "ElectronicsStep.iAmOnHomepagePage()"
});
formatter.result({
  "duration": 749243500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.mouseHoverOnElectronicsTab()"
});
formatter.result({
  "duration": 304490300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.clickOnMuuseoverAndClickOnCellphone()"
});
formatter.result({
  "duration": 1361496500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.verifyTheTextCellPhones()"
});
formatter.result({
  "duration": 147645000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.clickOnListViewTab()"
});
formatter.result({
  "duration": 221636100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NokiaLumia1020",
      "offset": 23
    }
  ],
  "location": "ElectronicsStep.clickOnProductNameOnPage(String)"
});
formatter.result({
  "duration": 2614724000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nokia Lumia 1020",
      "offset": 25
    }
  ],
  "location": "ElectronicsStep.verifyTheProductText(String)"
});
formatter.result({
  "duration": 139330500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$349.00",
      "offset": 18
    }
  ],
  "location": "ElectronicsStep.verifyThePrice(String)"
});
formatter.result({
  "duration": 144042900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 20
    }
  ],
  "location": "ElectronicsStep.changeQuantityTo(String)"
});
formatter.result({
  "duration": 528069300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.clickOnADDTOCARTTab()"
});
formatter.result({
  "duration": 262014700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 20
    }
  ],
  "location": "ElectronicsStep.verifyTheMessageOnTopgreenBar(String)"
});
formatter.result({
  "duration": 402422300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.closeTheBarClickingOnTheCrossButton()"
});
formatter.result({
  "duration": 244086600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.mousehoverOnShoppingCartClickOnGOTOCARTButton()"
});
formatter.result({
  "duration": 1634976000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.verifyTheTextShoppingCartOnElectronicsPage()"
});
formatter.result({
  "duration": 91159400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$698.00",
      "offset": 18
    }
  ],
  "location": "ElectronicsStep.verifyTheTotal(String)"
});
formatter.result({
  "duration": 124356700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.clickOnCheckboxIAgreeWithTheTermsOfService()"
});
formatter.result({
  "duration": 193746700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.clickOnCHECKOUTOnElectronicsPage()"
});
formatter.result({
  "duration": 832277400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsStep.verifyTheTextWelcomePleaseSignIn()"
});
formatter.result({
  "duration": 128133800,
  "status": "passed"
});
formatter.after({
  "duration": 1583486400,
  "status": "passed"
});
});