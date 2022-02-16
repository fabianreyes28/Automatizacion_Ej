# Created by DiegoPinzon at 06/02/2022
# Author: Diegopip62@gmail.com

Feature: Users complete the form

  Rule: A user can send the form with all information

  A user can submit basic information through the form
  provided on Aquabot's web site

    @SuccessfulForm @WithoutMessage
    Scenario: Christina sends a successful request on Testing
      Given Christina is on the Aquabot home page
      And she navigates to the Demo Contact Form
      When she enters the following data
        | item           | value                    |
        | name           | Christina Martinelli     |
        | email          | Christina@martinelli.com |
        | phone number   | +1 559 123 0987          |
        | type phone     | Mobile Phone             |
        | message        |                          |
        | question about | Testing                  |
        | result message | Success Message          |
      Then Christina should see the "message submitted"


    @UnsuccessfulForm
    Scenario: Micky sends a unsuccessful request on Testing
      Given Mickey is on the Aquabot home page
      And he navigates to the Demo Contact Form
      When he enters the following data
        | item           | value                                   |
        | name           | Mickey                                  |
        | email          | Mickey@mail.com                         |
        | phone number   | 310 987 1234                            |
        | type phone     | Home Phone                              |
        | message        | Gestionar una prueba de mensaje fallida |
        | question about | The Universe                            |
        | result message | Error Message                           |
      Then Mickey should see the "error message failed"

  Rule: A user cannot clear the form information
   # Scenario: # Enter scenario name here
    # Enter steps here