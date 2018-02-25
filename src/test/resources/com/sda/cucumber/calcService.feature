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

  Scenario Outline: Should check miexed values
    Given I initialize CalcService
    And I pass <text> value
    When I execute calculate method
    Then I get <result> as a result
    Examples:
    | text | result |
    | 2 jablka;3 jajka;5zmieniakow | 10 |
    | 3a;2;4;5b                    | 14 |
