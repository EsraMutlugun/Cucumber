Feature: User login with userId
  As a customer,
  I should login using  id and password to check account balance
  
Scenario: Login to site
  Given the user is Login page
  When user send %mngr333453% as userId
  And the user send %gUzerYh% as password
  Then the user click login page
  And user click balance enquiry page
  And user enters %93778% as Account No
  And ensure the Account No is %93778%
  And ensure the Type of Account is %Savings%
  And ensure the Balance is %10000%
  










