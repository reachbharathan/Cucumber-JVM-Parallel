Feature: Tax Verification

  Scenario: To Verify the tax search
    Given I enter credentials <username> and <password> in Account Demo
    Then I should see dashboard page
    When I click taxes link in the navigation bar
    Then I should see taxes pgae
