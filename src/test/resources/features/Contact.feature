@Contacts
Feature: Login feature

  Background:
    Given User goes to domain "https://salesbusinessau001.myfreshworks.com/"
    And User provides email "senthilx6@gmail.com" and password "Automation@123"

  @contact_create
  Scenario: User able to create an contact
    Given User sends the contact details to create a contact
    |first_name|last_name|email|work_number|mobile_number|
    |#random_9char_String|#random_10char_String|#random_Email|#random_10digit_Number|#random_10digit_Number|
    When User clicks on save
    Then Contact should be created
