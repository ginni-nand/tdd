package co.interleap.courses.tdd;
public class StatementGenrator{
    public static final int FARE_PER_KM=10;
    public static final int FARE_PER_MINUTE=1;
    public double create(double distance,double time)
    {
        return FARE_PER_KM*distance + FARE_PER_MINUTE*time;
    }
}