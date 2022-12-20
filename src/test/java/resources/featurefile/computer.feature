@Computer@regression
Feature: Computer Test
  As user I want to navigate to nop commerce website
@sanity
  Scenario: User can verify Product Arrange In Alphabetical Order
    Given I am on homepage
    When I Mouse hover on “Computer” Tab and click
    And click mousehoover and click on Desktop
    And I can Select Sort By position Name: Z to A
    Then  Verify the Product will arrange in Descending order

  @smoke
  Scenario: User can verify Product  Added to Shopping Cart Successfully
    Given  I am on homepage
    When I Mouse hover on “Computer” Tab and click
    And click mousehoover and click on Desktop
    And Select Sort By position "Name: A to Z"
    And click on Add to cart Tab
    And i can verify the text 'Build your own computer'
    And Select "2.2 GHz Intel Pentium Dual-Core E2200"
    And Select "8GB [+$60.00]" fromdropdown
    And click on HDD radio "400 GB [+$100.00]"
    And Select OS radio "Vista Premium [+$60.00]"
    And select checkBox
    And verify the  Verify the price "$1,475.00"
    And  Click on ADD TO CARD Button
    And  Verify the Message "The product has been added to your shopping cart" on TopGreen Bar After that close the bar clicking on the cross button
    And close the bar clicking on the cross button
    And MouseHover on Shopping cart and Click on GO TO CART button
    And Verify the Text "Shopping cart"
    And  Change the Qty to "2"
    And Click on Update shopping cart
    And Verify the Total"$2,950.00"
    And  click on checkbox “I agree with the terms of service"
    And Click on “CHECKOUT”
    Then User can navigate to Register page
