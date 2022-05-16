import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CLITest {

    CLI cli;
    Flight flightList;
    Passenger passengerList;
    Passenger passengers;
//    Flight flights;

    @BeforeEach
    public void setUp(){
        this.flightList = new Flight();
//        this.passengerList = new Passenger();
        //this.flights = new Flight("New Zealand", "001-013");
    }

//    @Test
//    public void canRemoveFlight(){
//        //flightList.addFlight(new Flight("Maldives", "001-014"));
//        //assertThat(flightList.getFlightList()).isEqualTo(flightList);
//        assertThat(flightList.flightList.remove(1));
//    }

//    @Test
//    public void canAddNewFlight(){
//        assertThat(cli.getAllAvailableFlights());
//    }


}
