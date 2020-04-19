Meta:

Narrative:
As a user
I want to make an operation an action
So that I can get the results of two numbers

Scenario: scenario Addition
Given a Operations class with the operation sing as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the results as <result>

Examples:
|sign|number1|number2|result|
|+|3|4|7|

Scenario: scenario Subtraction
Given a Operations class with the operation sing as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the results as <result>

Examples:
|sign|number1|number2|result|
|-|23|4|19|

Scenario: scenario Multiplication
Given a Operations class with the operation sing as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the results as <result>

Examples:
|sign|number1|number2|result|
|*|3|4|12|

Scenario: scenario Division
Given a Operations class with the operation sing as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the results as <result>

Examples:
|sign|number1|number2|result|
|/|25|5|5|