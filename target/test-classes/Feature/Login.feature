Feature: Logging into Demo Web Shop Application

Background:
	Given User is on the Home Page""
	
  @ValidCredentials
  Scenario: Logging with valid credentials
    Given User is on the Home Page
    When clicks the Login Homepage
    Then entering the Email
    Then entring the password
    Then clicks the LoginButton
    Then login is successfull

  @InvalidCredentials
  Scenario Outline: Logging with Invalid credentials
    Given user in the home page
    When clicks the Login in Hompage2
    Then entering the inavlidemail <"Invalidemail">
    Then entering the invaildpassword <"Invalidpassword">
    Then clicks the LoginButton2
    Then login is unsuccessfull

    Examples: 
      | Invalidemail          | Invalidpassword |
      | akashnittin@gmail.com | Nittin@46       |
      | aknittin00@gmail.com  | Nittt@46        |
      | akashnittin@gmail.com | Nittt@46        |
