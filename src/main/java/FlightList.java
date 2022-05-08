import java.util.ArrayList;
import java.util.List;

public class FlightList {

    List<Flight> flightList;

    public FlightList() {
        this.flightList = new ArrayList<>();

        flightList.add(new Flight("Malta", "001-001"));
        flightList.add(new Flight("UAE", "001-002"));
        flightList.add(new Flight("Saudi Arabia", "001-003"));
        flightList.add(new Flight("Qatar", "001-004"));
        flightList.add(new Flight("Kenya", "001-005"));
        flightList.add(new Flight("South Korea", "001-006"));
        flightList.add(new Flight("China", "001-007"));
        flightList.add(new Flight("Sweden", "001-008"));
        flightList.add(new Flight("Germany", "001-009"));
        flightList.add(new Flight("India", "001-010"));
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public void addFlight (Flight flight){
        this.flightList.add(flight);
    }
}

