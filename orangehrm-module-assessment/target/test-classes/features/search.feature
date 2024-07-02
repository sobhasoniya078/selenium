Feature: Search Functionality of orangeHRM

Scenario: Search with null value
		   Given the user in the search page
		   When user simply click the search
		   Then the error msg should be displayed
		   
Scenario: Search the invalid value
		   Given the user in the search page
		   When user pass the invalid value
		   
		   Then the error message should be displayed
		   
Scenario: Search the valid item
		   Given the user in the search page
		   When user pass the valid value
		   Then the results will be displayed	