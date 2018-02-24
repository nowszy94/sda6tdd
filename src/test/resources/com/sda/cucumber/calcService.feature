Feature: CalcService
  Scenario: Should Add Digits In String And Produce Result
    Given I initialize CalcService
      And I pass 2;3;4 value
    When I execute calculate method
    Then I get 9 as a result

  Scenario: Should return 0 when null text is passed
    Given I initialize CalcService
      And I pass null
    When I execute calculate method
    Then I get 0 as a result

  Scenario: Should return 0 when blank text is passed
    Given I initialize CalcService
    And I pass blank
    When I execute calculate method
    Then I get 0 as a result

  Scenario: Should return correct value when mixed with letters text is passed
    Given I initialize CalcService
    And I pass 3a;2;4;5b value
    When I execute calculate method
    Then I get 14 as a result

  Scenario: Should return correct value when recipe list is pased
    Given I initialize CalcService
    And I pass 2 jablka;3 jajka;5zmieniakow value
    When I execute calculate method
    Then I get 10 as a result
