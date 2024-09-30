package runapplication;


// Subclass RoadAccidentReport that extends RoadAccidents
class RoadAccidentReport extends RoadAccidents {

    // Constructor
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    // Implementation of the printAccidentReport method
    @Override
    public void printAccidentReport() {
        System.out.println("\nVEHICLE ACCIDENT REPORT");
        System.out.println("***************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("***************************");
    }
}
