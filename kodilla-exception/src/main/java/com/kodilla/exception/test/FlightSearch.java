package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Berlin", true);
        flights.put("London", false);

        String arrival = flight.getArrivalAirport();
        String departure = flight.getDepartureAirport();

        if (flights.containsKey(arrival) && flights.containsKey(departure)) {
            return flights.get(arrival) && flights.get(departure);
        } else {
            throw new RouteNotFoundException("No such an airport in the database.");
        }
    }

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight flightOne = new Flight("Warsaw", "Oslo");

        try {
            boolean isPossible = flightSearch.findFlight(flightOne);
            if (isPossible) {
                System.out.println("You can fly!");
            } else {
                System.out.println("You can't fly :(");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Try again. " + e.getMessage());
        }
    }
}
