import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightListTest {

    Flight flights;

    @BeforeEach
    public void setUp(){
        this.flights = new Flight();
    }

    @Test
    public void canGetFlightCount(){
        assertThat(flights.getFlights().size()).isEqualTo(10);
    }

    @Test
    public void canAddFlightToList(){
        flights.addFlight(new Flight());
        assertThat(flights.getFlights().size()).isEqualTo(11);
    }

//    @Test
//    public void canCancelAFlight(FlightList flight){
//        flightList.cancelFlight(flight);
//        assertThat(flightList.getFlightList().size()).isEqualTo(9);
//    }



}
