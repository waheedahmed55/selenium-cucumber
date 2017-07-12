#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: Test Facebook smoke test

	Scenario Outline: Test login with valid credentials
	Given Open IE and start application
	When I enter valid "<username>" and valid "<password>"
	Then user should be able to login successfully.
	Then application should be closed
	
	Examples:
	| username | password |
	| waheedahmed56@gmail.com | pwd2 |
	| moeedahmed55@gmail.com | pwd3 |
	| mudiahmed55@gmail.com | pwd4 |
	

