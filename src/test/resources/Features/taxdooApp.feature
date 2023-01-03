Feature: TaxDoo web application booking 
  Scenario Outline: Creating application
    Given User navigates to landing page
    When User selects Average Revenue<revenue> per Month
    And User selects Package
    And User clicks Next button
    And User enters data in the second page <Company_name> and <Salutation> and  <First_name> and <Last_name> and <Address> and <Vat_ID> and <Email> and <Telephone>
    And User redirects to summary page and select complete booking
    Then User redirects to Booking sucessful page and verifies that booking is successful
    #And check more outcomes

  
    Examples: 
      | revenue|Company_name  |Salutation|First_name|Last_name|Address                        |Vat_ID      |Email      |Telephone |
      | 1000   | Prachi Test  |Mrs       |Prachi |Kapoor   |Valentinskamp 70, 20355 Hamburg|DE123456789 |xyz@pqr.com|4536646547|
