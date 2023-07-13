Public Transport Service

Our goal is to overhaul and digitize the management system for the public transport service in our city.

The first step is to create an inventory of all the vehicles in stock. All vehicles have an internal unique identifier, a license plate number, the max capacity of passengers, a status (need repair / in operation / for scrap), fuel type (electric, gas or hybrid) and last service date. In general, the status is given by the last time they were serviced (0-6 months “in operation”, 7-36 “need repair”, 37+ “scrap”). Each vehicle type has some extra characteristics:

Buses are all powered by gas and have a pollution indicator. A bus is “in operation” if the last service date was 0-6 months ago and its pollution indicator is higher than 5; “need repair” if the service date was 0-12 months ago and pollution indicator is between 3 and 5, and “for scrap” otherwise.
Trolleybuses have both an electric and a gas powered engine (hybrid).
Trams are all electric and store the number of years in service.

The first goal for the Public Transport Service is to find out how many vehicles of a specific type have a particular status.

The next step in digitalization is tracking of routes. A route is described by two or more stations, and a list of vehicles that operate on it. Remember that only “in operation” vehicles can be assigned to a route. Each station has a name. 