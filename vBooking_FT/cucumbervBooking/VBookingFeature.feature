
@VacationBookingFeatures
	Feature: Test Vacation Booking Portal
		I want to use this template for my feature file

	@Smoke
	Scenario: Book a Flight
		Given I Open Vacation Booking Portal
#		Then I Book a Flight from "London Stansted (STN)" to "Edinburgh (EDI)" on "30/09/2019" for "David"
		Then I Close Portal
	
	@Smoke
	Scenario: Check-in Passenger
		Given I Open Vacation Booking Admin Portal
#		Then I Check-in above Passenger
		Then I Close Portal
	
#	@Smoke
#	Scenario: Board the Passenger
#		Given I Open Vacation Booking Admin Portal
#		Then I Board above Passenger with Passport Num "1234567"
#		Then I Close Portal
	
#	@Smoke
#	Scenario: Check-in Passenger with Reservation Number
#		Given I Open Vacation Booking Admin Portal
#		Then I Check-in Passenger with ReserveNum "A00003" in Flight "VB297"
#		Then I Close Portal

#	@Smoke
#	Scenario: Board the Passenger with Reservation Number
#		Given I Open Vacation Booking Admin Portal
#		Then I Board Passenger with ReserveNum "A00003" and Passport Num "7654321" in Flight "VB297"
#		Then I Close Portal
	
#	@Smoke
#	Scenario Outline: Book a Flight
#		Given I Open Vacation Booking Portal
#		Then I Book a Flight from "<source>" to "<destination>" on "<date>" for "<passenger>"
#		Then I Close Portal
	
#		Examples:
#			|source                |destination     | date      | passenger |
#			|London Stansted (STN) |Edinburgh (EDI) |30/09/2019 | David 	|
#			|London Stansted (STN) |Edinburgh (EDI) |30/10/2019 | Ling 	 	|

	
	
	