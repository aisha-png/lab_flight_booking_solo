import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {
    private Scanner scanner;
    private List<FlightList> allAvailableFlights;
    private List<PassengerList> allPassengers;
    private boolean EXIT;

    public CLI(){
        this.scanner = new Scanner(System.in);
        this.allAvailableFlights = new ArrayList<>();
        this.allPassengers = new ArrayList<>();
    }

//    Getting all passengers and flights

    public List<FlightList> getAllAvailableFlights(FlightList flights){
        return allAvailableFlights;
    }

    public List<PassengerList> getAllPassengers(){
        return allPassengers;
    }

//    CLI

    public void START() {

        this.EXIT = false;
        while (!EXIT) {
            String instructions =
                    "What would you like to do" + System.lineSeparator() +
                            "Please select from the following:" + System.lineSeparator() +
                            "--------------------------------------------------" + System.lineSeparator() +
                            "  0   Exit" + System.lineSeparator() +
                            "  1   Book a flight" + System.lineSeparator() +
                            "  2   Display all available flights" + System.lineSeparator() +
                            "  3   Cancel a flight" + System.lineSeparator() +
                            "  4   Add a new passenger onto a flight" + System.lineSeparator() +
                            "  5   Remove a passenger from a flight";
            System.out.println(instructions);
            int userInput = scanner.nextInt();

            String response = "You selected " + userInput;
            System.out.println(response);


        }
    }



}
