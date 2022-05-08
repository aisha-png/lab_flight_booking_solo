import java.util.ArrayList;
import java.util.List;

public class PassengerList {

    List<Passenger> passengerList;

    public PassengerList(){
        this.passengerList = new ArrayList<>();
        passengerList.add(new Passenger("Tom", "07941432678", "001"));
        passengerList.add(new Passenger("Ben", "07941432546", "002"));
        passengerList.add(new Passenger("Harry", "07941432123", "003"));
        passengerList.add(new Passenger("Mike", "07941432876", "004"));
        passengerList.add(new Passenger("Eren", "07941432468", "005"));
        passengerList.add(new Passenger("Sasha", "07941432258", "006"));
        passengerList.add(new Passenger("Mikasa", "07941432986", "007"));
        passengerList.add(new Passenger("Reiner", "07941432667", "008"));
        passengerList.add(new Passenger("Levi", "07941432890", "009"));
        passengerList.add(new Passenger("Henry", "07941432113", "010"));
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public void addPassengerToFlight(Passenger passenger){
        this.passengerList.add(passenger);
    }
}
