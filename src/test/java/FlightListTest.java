import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightListTest {

    FlightList flightList;

    @BeforeEach
    public void setUp(){
        this.flightList = new FlightList();
    }

    @Test
    public void canGetFlightCount(){
        assertThat(flightList.getFlightList().size()).isEqualTo(10);
    }

    @Test
    public void canAddFlightToList(){
        flightList.addFlight(new Flight("New York, USA", "001-011"));
        assertThat(flightList.getFlightList().size()).isEqualTo(11);
    }



}
