@Electronics@regression
Feature: Electronics Test
  As user I want to navigate computer page into nop commerce website
  @sanity
  Scenario:Verify User Should Navigate To CellPhonesPage Successfully
    Given I am on homepage page
    When  Mouse Hover on “Electronics”Tab
    And Click on Muuseover and click on cellphone

  @smoke
  Scenario: verify That The Product Added Successfully And Place Order Successfully
    Given I am on homepage page
    When  Mouse Hover on “Electronics”Tab
    And Click on Muuseover and click on cellphone
    And  Verify the text “Cell phones"
    And Click on List View Tab
    And Click on product name "NokiaLumia1020" on page
    And  Verify the Product text "Nokia Lumia 1020"
    And Verify the price "$349.00"
    And Change quantity to "2"
    And Click on “ADD TO CART” tab
    And Verify the Message "The product has been added to your shopping cart" on Topgreen Bar
    And close the bar clicking on the cross button.
    And MouseHover on Shopping cart Click on GO TO CART button.
    And Verify the Text Shopping cart on Electronics page
    And Verify the Total "$698.00"
    And click on checkbox “I agree with the terms of service”
    And Click on “CHECKOUT” On Electronics page
    And Verify the Text “Welcome, Please Sign In!”

