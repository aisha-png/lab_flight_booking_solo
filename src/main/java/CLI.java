import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {
    private Scanner scanner;
    Passenger passengers;
    private boolean EXIT;
    List<Flight> allFlights;
    CLI cli;
    //private List<FlightList> flights;
    //FlightList flightList;
//    Flight flight;


    public CLI(){
        this.scanner = new Scanner(System.in);
        //this.flights = new ArrayList<>();
        this.passengers = new Passenger();
        this.allFlights = new ArrayList<>();
        this.cli = cli;
        this.EXIT = false;
    }

//    Getting all passengers and flights

//    public List<FlightList> getAllAvailableFlights(FlightList flights){
//        return flights.getFlights();
//    }
//
//    public List<PassengerList> getAllPassengers(){
//        return allPassengers;
//        }

//    CLI

    public void START() {

//        this.EXIT = false;
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
                            "  6   Exit" + System.lineSeparator() +
                            "--------------------------------------------------" + System.lineSeparator() +
                            "  Please select a number between 1 and 6" + System.lineSeparator() +
                            "--------------------------------------------------" + System.lineSeparator();

            System.out.println(instructions);
            int userInput = scanner.nextInt();


            switch(userInput){
                case 1:
                    String response1 = " You selected " + userInput + " - Book a flight";
                    System.out.println(response1);
                    System.out.println("\nUser Action: Book a flight");
                    addANewFlight();
                    break;
                case 2:
                    String response2 = " You selected 2 - Here are all available flights";
                    System.out.println(response2);
                    System.out.println("\nSystem Action: Display all available flights");
                    displayAllFlights();
                    break;
                case 3:
                    String response3 = " You selected 3 - Cancel a flight.";
                    System.out.println(response3);
//                    System.out.println("Pleas enter the flightId you which to cancel");
                    cancelAFlight();
                    break;
                case 4:
                    String response4 = " You selected 4 - Add a passenger onto a flight";
                    System.out.println(response4);
                    addAPassengerToFlight();
                    break;
                case 5:
                    String response5 = " You selected 5 - Remove a passenger from a flight";
                    System.out.println(response5);
                    removeAPassengerFromFlight();
                    break;
                case 6:
                    String response6 = " You selected 6 - Exit - ";
                    System.out.println(response6);
                    System.out.println("\nThank you for using our service");
                    EXIT = true;
                    break;
            }
        }
    }

    public void addANewFlight(){
        System.out.println("Please enter the destination you wish to travel to: ");
        scanner.nextLine();
        String input= scanner.nextLine();
        String answer = "You selected " + input.toUpperCase();
        System.out.println(answer);
        //need to initialise a method that adds a flight onto
        String destination = scanner.nextLine();
        System.out.println("Your selected destination is: " + destination + ".");
//        add method for the flight. then next line confirms flight.
        this.allFlights.add(new Flight());
        System.out.println(allFlights);


    }

    public void displayAllFlights(){
//        display all flights method goes here
        System.out.println("Here is a list of available flights: ");
        for (int i = 0; i < allFlights.size(); i++){
            System.out.println(allFlights);
        }
        START();
    }

    public void cancelAFlight(){
//        cancel flight method here
        START();
    }

    public void addAPassengerToFlight(){
//        add passenger to flight method here
        START();
    }

    public void removeAPassengerFromFlight(){
//        remove passenger from flight method here
        START();
    }



}
