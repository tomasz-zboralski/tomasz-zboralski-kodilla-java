package com.kodilla.good.patterns.tinyAirlines;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearch {

    private final ArrayList<Flight> flights = new ArrayList<>();

    public FlightSearch() {

        this.flights.add(new Flight("Warszawa", "Kraków"));
        this.flights.add(new Flight("Warszawa", "Wrocław"));
        this.flights.add(new Flight("Warszawa", "Gdańsk"));
        this.flights.add(new Flight("Kraków", "Gdańsk"));
        this.flights.add(new Flight("Kraków", "Warszawa"));
    }

    public String checkIfFlightExist(Flight flight) {

        boolean directFlightIsFound = flights.contains(flight);

        if (directFlightIsFound) {
            return "Direct flight: \n" + flight;
        } else {
            return "Direct flight not found";
        }
    }

    public String checkIfIndirectFlightExist(Flight flight) {

        String departure = flight.getDeparture();
        String arrival = flight.getArrival();

        ArrayList<Flight> departureFlights = getFlightsFromCity(departure);
        ArrayList<Flight> arrivalFlights = getFlightsToCity(arrival);

        ArrayList<Flight> indirectFLightsFrom = departureFlights.stream()
                .filter(two -> arrivalFlights.stream()
                        .anyMatch(one -> one.getDeparture().equals(two.getArrival())))
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Flight> indirectFLightsTo = arrivalFlights.stream()
                .filter(two -> departureFlights.stream()
                        .anyMatch(one -> one.getArrival().equals(two.getDeparture())))
                .collect(Collectors.toCollection(ArrayList::new));

        String indirectFlights = Stream.of(indirectFLightsFrom, indirectFLightsTo)
                .flatMap(Collection::stream)
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        if (indirectFLightsFrom.isEmpty() && indirectFLightsTo.isEmpty()) {
            return "\nIndirect flights not found";
        } else {
            return "\nIndirect flights:\n" + indirectFlights;
        }
    }

    public ArrayList<Flight> getFlightsFromCity(String city) {

        return flights.stream()
                .filter(f -> f.getDeparture().equals(city))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Flight> getFlightsToCity(String city) {

        return flights.stream()
                .filter(f -> f.getArrival().equals(city))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
