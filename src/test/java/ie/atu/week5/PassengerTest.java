package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    Passenger isPassenger;

    @BeforeEach
    void setUp(){
        isPassenger = new Passenger(null,null,null,null,0);

    }
    @Test
    void testTitle(){
        isPassenger.setTitle("Mr");
        assertEquals("Mr",isPassenger.getTitle());
    }
    @Test
    void testName(){
        isPassenger.setName("John");
        assertEquals("John", isPassenger.getName());
    }
    @Test
    void testID(){
        isPassenger.setID("007JAMESBOND");
        assertEquals("007JAMESBOND", isPassenger.getID());
    }
    @Test
    void testPhone(){
        isPassenger.setPhone("0891234123");
        assertEquals("0891234123",isPassenger.getPhone());
    }
    @Test
    void testAge(){
        isPassenger.setAge(21);
        assertEquals(21,isPassenger.getAge());
    }
    @AfterEach
    void tearDown(){

    }

}
