Feature: Creat and Delete Functionality for Cities

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

  Scenario: Create and Delete  a city

    When  User click on the in the leftNav class
      | setup      |
      | parameters |
      | cities     |

    And User click on the element in the dialog  content class
      | addButton |
      | country   |

    Then  User sending the keys in the dialog content class
      | name | basqarCity |

    And User click on the element in the dialog  content class
      | saveButton |

    Then User should see  success/error message
      | successfully |


    Then  User delete  value
      | basqarCity |

    Then User should see success/error message
      | successfully |
