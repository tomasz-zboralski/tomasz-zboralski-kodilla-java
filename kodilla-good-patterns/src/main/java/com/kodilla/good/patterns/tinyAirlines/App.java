package com.kodilla.good.patterns.tinyAirlines;

public class App {
    public static void main(String[] args) {
        String departure = "Warszawa";
        String arrival = "Gdańsk";

        Flight myFlight = new Flight(departure, arrival);
        FlightSearch flightSearch = new FlightSearch();

        flightSearch.checkIfFlightExist(myFlight);

        System.out.println("\nFlights from " + departure);
        flightSearch.getFlightsFromCity(departure).forEach(System.out::println);

        System.out.println("\nFlights to " + arrival);
        flightSearch.getFlightsToCity(arrival).forEach(System.out::println);
    }
}
