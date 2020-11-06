Feature: Login Functionality

  Scenario: Login wiht valid username and password

 #siteyi aç - basgara a git
    Given Navigate to basqar

    And  User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    When User click on the element in the dialog  content class
      | loginButton |
      | gotItBtn    |
    #username ve passwordu gir ve login butonuna tıklat

    #Login olduğunu doğrula
    Then User should login successfully