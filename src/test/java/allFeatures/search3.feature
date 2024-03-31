Feature: Title of your feature

@tag1 @tag3
  Scenario Outline: Title of your scenario TAG1
    Given I want to write a step with precondition "<name>"
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes
    
    Examples:
    |name|
    |Nicks1|
    |Nicks2|
    |Nicks3|
    |Nicks4|
    |Nicks5|
    |Nicks6|
    |Nicks7|


@tag2 @tag3
  Scenario: Title of your scenario TAG2
    Given I want to write a step with precondition "Smith"
    And some other preconadition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes
    