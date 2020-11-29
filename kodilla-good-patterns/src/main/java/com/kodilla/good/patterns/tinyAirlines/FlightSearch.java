package com.kodilla.good.patterns.tinyAirlines;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightSearch {
    ArrayList<Flight> flights = new ArrayList<>();

    public FlightSearch() {
        this.flights.add(new Flight("Warszawa", "Kraków"));
        this.flights.add(new Flight("Warszawa", "Wrocław"));
        this.flights.add(new Flight("Warszawa", "Gdańsk"));
        this.flights.add(new Flight("Kraków", "Gdańsk"));
        this.flights.add(new Flight("Kraków", "Warszawa"));
    }

    public void checkIfFlightExist(Flight flight) {
        String departure = flight.getDEPARTURE();
        String arrival = flight.getARRIVAL();

        boolean directFlightIsFound = flights.contains(flight);

        if (directFlightIsFound) {
            System.out.println("Direct flight: \n" + flight);
        } else {
            System.out.println("Direct flight not found");
        }

        ArrayList<Flight> departureFlights = getFlightsFromCity(departure);
        ArrayList<Flight> arrivalFlights = getFlightsToCity(arrival);

        ArrayList<Flight> indirectFLightsFrom = departureFlights.stream()
                .filter(two -> arrivalFlights.stream()
                        .anyMatch(one -> one.getDEPARTURE().equals(two.getARRIVAL())))
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Flight> indirectFLightsTo = arrivalFlights.stream()
                .filter(two -> departureFlights.stream()
                        .anyMatch(one -> one.getARRIVAL().equals(two.getDEPARTURE())))
                .collect(Collectors.toCollection(ArrayList::new));


        if (indirectFLightsFrom.isEmpty() && indirectFLightsTo.isEmpty()){
            System.out.println("\nIndirect flights not found");
        } else {
            System.out.println("\nIndirect flights: ");
            indirectFLightsFrom.forEach(System.out::println);
            indirectFLightsTo.forEach(System.out::println);
        }

    }

    public ArrayList<Flight> getFlightsFromCity(String city) {

        return flights.stream()
                .filter(f -> f.getDEPARTURE().equals(city))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Flight> getFlightsToCity(String city) {

        return flights.stream()
                .filter(f -> f.getARRIVAL().equals(city))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
