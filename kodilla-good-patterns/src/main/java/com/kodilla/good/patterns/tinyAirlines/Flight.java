package com.kodilla.good.patterns.tinyAirlines;

public class Flight {
    private final String DEPARTURE;
    private final String ARRIVAL;

    public Flight(String DEPARTURE, String ARRIVAL) {
        this.DEPARTURE = DEPARTURE;
        this.ARRIVAL = ARRIVAL;
    }

    public String getDEPARTURE() {
        return DEPARTURE;
    }

    public String getARRIVAL() {
        return ARRIVAL;
    }

    @Override
    public String toString() {
        return "Flight from: " + DEPARTURE + " to: " + ARRIVAL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (DEPARTURE != null ? !DEPARTURE.equals(flight.DEPARTURE) : flight.DEPARTURE != null) return false;
        return ARRIVAL != null ? ARRIVAL.equals(flight.ARRIVAL) : flight.ARRIVAL == null;
    }

    @Override
    public int hashCode() {
        int result = DEPARTURE != null ? DEPARTURE.hashCode() : 0;
        result = 31 * result + (ARRIVAL != null ? ARRIVAL.hashCode() : 0);
        return result;
    }
}
