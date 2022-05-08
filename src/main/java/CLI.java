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
                            "  1   Book a flight" + System.lineSeparator() +
                            "  2   Display all available flights" + System.lineSeparator() +
                            "  3   Cancel a flight" + System.lineSeparator() +
                            "  4   Add a new passenger onto a flight" + System.lineSeparator() +
                            "  5   Remove a passenger from a flight"+ System.lineSeparator() +
                            "  6   Exit" + System.lineSeparator();
            System.out.println(instructions);
            int userInput = scanner.nextInt();

            String response = "You selected " + userInput + " - Book a flight";
            System.out.println(response);

            switch(userInput){
                case 1:
                    System.out.println("\nAction: Book a flight");
                    addANewFlight();
                    break;
                case 6:
                    System.out.println("\nThank you for ");
            }
        }
    }

    public void addANewFlight(){
        System.out.println("Please enter the destination you wish to get to: ");
        scanner.nextLine();
        String input= scanner.nextLine();
        String answer = "You selected " + input.toUpperCase();
        System.out.println(answer);



    }



}
