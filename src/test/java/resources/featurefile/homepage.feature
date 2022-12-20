@Homepage@regression

  Feature: TopMenu Test
    As user I want to click onto TopMenuTab nop commerce website
    @sanity
     Scenario: User should navigate to Homepage successfully
      Given I am on homepage
      When I click on topmenu link
      Then I should navigate to each topmenu link successfully

