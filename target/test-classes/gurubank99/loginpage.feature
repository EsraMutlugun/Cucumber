Feature: Customer access login page

  As a customer,
  I should login using id and password
  
Scenario: Login to site
  Given the user is on Login page
  When user enters %mngr333453% as userId
  And the enters %gUzerYh% as password
  Then the user click login
  

