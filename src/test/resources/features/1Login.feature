#@smoketest kalau ditaruh diatas fitur, dia bakal jalanin semua di fitur ini
Feature: Login Test
  Scenario: Login with valid credentials
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User should be directed to the dashboard page
    # @regression kalau ditaruh diatas scenario, dia bakal jalanin yang ada di scenario ini saja
  Scenario: Login with 1 step
    Given User login with valid username "standard_user" and password "secret_sauce"

    #
    #Scenario outline: Login with valid credentials
    #    Given User open the web sauce demo
    #    When User input "<username>" as userName and "<password>" as password and click login
    #    Then User should be directed to the dashboard page
    #    Examples:
    #    |username     |password     |
    #    |standard_user|secret_sauce |
    #    |standard_user|secret_sauce |
    #    |standard_user|secret_sauce |
    #    |standard_user|secret_sauce |