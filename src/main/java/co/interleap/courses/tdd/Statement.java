package co.interleap.courses.tdd;

public class Statement {
    private double totalFare;
    private double averageFarePerRides;
    private double numberOfRides;
    public Statement(double totalFare,double averageFarePerRides,double numberOfRides)
    {
        this.totalFare=totalFare;
        this.averageFarePerRides=averageFarePerRides;
        this.numberOfRides=numberOfRides;
    }
    public double getTotalFare() {
        return totalFare;
    }

    public double getAverageFare() {
        return averageFarePerRides;
    }

    public double getNumberOfRides() {
        return numberOfRides;
    }
}
