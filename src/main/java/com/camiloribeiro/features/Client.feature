Feature: Clients Verification

  Scenario: To Verify the client search
    Given I enter credentials <username> and <password> in Account Demo
    Then I should see dashboard page
    When I click clients link in the navigation bar
    Then I should see clients pgae
