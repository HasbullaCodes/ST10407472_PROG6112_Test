package runapplication;


// Abstract class RoadAccidents
abstract class RoadAccidents implements IRoadAccidents 
{
    private String vehicleType;
    private String city;
    private int accidentTotal;

    // Constructor
    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Get methods to implement the interface methods
    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return accidentTotal;
    }

    // Abstract method to print the report
    public abstract void printAccidentReport();
}