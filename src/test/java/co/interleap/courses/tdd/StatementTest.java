package co.interleap.courses.tdd;
import org.junit.Test;


import java.util.Arrays;
import java.util.*;
import static org.junit.Assert.assertEquals;
public class StatementTest {
    /*@Test
    public void shouldCalculateFareGivenTime()
    {
        StatementGenrator sgt=new StatementGenrator();
        List<Ride> rides=Collections.singletonList(new Ride(0,1));
        double totalfare=sgt.create(rides);

        assertEquals(1,totalfare,.01);
    }
    @Test
    public void shouldCalculateFareGivenDistanceAndTime()
    {
        StatementGenrator sgt1=new StatementGenrator();
        List<Ride> rides=Collections.singletonList(new Ride(3,2));

        double totalfare=sgt1.create(rides);
        assertEquals(32,totalfare,.01);
    }*/

    @Test
    public void genrateStatementForMultipleJourneyGivenTotalDistanceAndTime()
    {

        List rides= Arrays.asList(new Ride(3,4),new Ride(5,1) );
        Statement sg=new Statement(rides);
        assertEquals(85,sg.getTotalFare(),.01);
        assertEquals(42.5,sg.getAverageFare(),.01);
        assertEquals(2,sg.getNumberOfRides(),.01);

    }
}