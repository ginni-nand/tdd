package co.interleap.courses.tdd;
import org.junit.Test;
import junit.Assert.assertEquals;
public class StatementGenratorTest{
    @Test
    public void shouldCalculateFareGivenTime()
    {
        StatementGenrator sgt=new StatementGenrator();
        double totalfare=sgt.create(0,1);
        assertEquals(1,totalfare,.01);
    }
    @Test
    public void shouldCalculateFareGivenDistanceAndTime()
    {
        StatementGenrator sgt1=new StatementGenrator();
        double totalefare=sgt1.create(3,2);
        assertEquals(32,totalefare,.01);
    }

}