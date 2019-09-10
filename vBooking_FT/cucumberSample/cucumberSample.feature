@ClassicsjavaAFeatures
Feature: Test ClassicsJavaA App
	I want to use this template for my feature file
	
	@Smoke
	Scenario: Open and Close ClassicsJavaA App
	Given I Start ClassicsJavaA App
	Then I Close the App

	@Smoke
	Scenario: Maximize and Restore ClassicsJavaA App
	Given I Start ClassicsJavaA App
	Then I Maximize the App
	Then I Restore the App
	Then I Close the App
	
	@Smoke
	Scenario: Use all top options of ClassicsJavaA App
	Given I Start ClassicsJavaA App
	Then I use all top options of the App
	Then I Close the App
	
	
	
	