import java.util.ArrayList;
import java.util.List;

public class Flight {

    List<Flight> flights;
    private String destination;
    private String flightID;
    List<Passenger> passengerList;


    public Flight(List<Flight> flights, String destination, String flightID) {
        this.flights = new ArrayList<>();
        this.destination = destination;
        this.flightID = flightID;

    }

    public Flight() {}

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flights = flights;
    }

    public void addFlight (Flight flight){
        this.flights.add(flight);
    }

    public void cancelFlight(Flight flight){
        this.flights.remove(flight);
    }
}

