import java.util.List;

public class Flight {

    private String destination;
    private String flightID;
    List<Passenger> passengerList;

    public Flight(String destination, String flightID) {
        this.destination = destination;
        this.flightID = flightID;
        //this.passengerList = new List<PassengerList>();

    }

//    Getters & Setters

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
