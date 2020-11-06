Feature:  Creat and Delete Functionality for Countries
  Background:
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

  Scenario: Create and delete a country
    When  User click on the in the leftNav class
      | setup      |
      | parameters |
      | countries  |

    And User click on the element in the dialog  content class
      | addButton |
    Then  User sending the keys in the dialog content class
      | name | basqarCountry |
      | code | 12345@        |
    And User click on the element in the dialog  content class
      | saveButton |

    Then User should see  success/error message
      | successfully |


    Then  User delete  value
      | basqarCountry |

    Then User should see success/error message
      | successfully |
