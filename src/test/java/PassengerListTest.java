import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerListTest {

    PassengerList passengerList;

    @BeforeEach
    public void setUp(){
        this.passengerList = new PassengerList();
    }

    @Test
    public void canGetPassengerCount(){
        assertThat(passengerList.getPassengerList().size()).isEqualTo(10);
    }

    @Test
    public void canAddPassengerToFlight(){
        passengerList.addPassengerToFlight(new Passenger("Mary", "07643213567", "011"));
        assertThat(passengerList.getPassengerList().size()).isEqualTo(11);
    }

}
