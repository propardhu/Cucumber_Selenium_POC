Feature: Search item

Scenario: Search for given item

  Given I'm on amazon
  When I select Search for "jackets"
  Then I'm on result page
  And I click on item
