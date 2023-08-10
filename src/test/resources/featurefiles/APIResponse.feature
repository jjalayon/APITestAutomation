@TestAPI
Feature: API Test

  Background:
    When API is called "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false"

  Scenario Outline: Verify JSON response contains correct value
    Then Verify response body if it contains "<field>" with value of "<value>"
    Examples:
      | field     | value          |
      | Name      | Carbon credits |
      | CanRelist | true           |

  Scenario:   Verify Promotion Element has correct value
    Then Promotion Element with Name "Gallery" has a description "Good position in category"