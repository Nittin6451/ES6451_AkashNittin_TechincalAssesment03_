Feature: Regsitering into Demo Web Shop Application

  Scenario Outline: 
    Given user is on homepage
    Then user clicks on Register
    Then user selects the gender
    Then user enters the firstname
      | firstname |
      | Akash     |
    Then user enters the lastname
      | lastname    |
      | Nittinakash |
    Then user enters the emailid
      | emailid              |
      | aknittin00@gmail.com |
    Then user enters the password
      | password  |
      | Nittin@46 |
    Then user enters the confirmpassword
      | cpassword |
      | Nittin@46 |
    Then user clicks the registerbutton
    Then user gets the confirmation message
    Then user clicks the logout
