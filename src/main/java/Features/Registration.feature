Feature: Mercury Tour Registraion page feature

Scenario Outline: Registration Page Test Scenario

Given user is on home page
When user navigates to the registration page
And  user enters all the details in the registration page
And taps on submit button
Then user should land on registration successful page

Examples:

|Suman|Dey|8796541235|Tester89@yopmail.com|Nutan Pally|Bengaluru|Karnataka|800054|Argentina|Tester22|Tester1234|Tester1234|  