package runapplication;

import java.util.Scanner;


public class RunApplication {

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // User input for vehicle type, city, and accident total
        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = sc.nextLine();

        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int accidentTotal = sc.nextInt();

        // Create RoadAccidentReport object and print the accident report
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
        report.printAccidentReport();

        sc.close();
       
    }
    
     
    //all coding within the RunApplication.java, IRoadAccidents.java, RoadAccidents.java, RoadAccidentReport.java, unless stated otherwise are original in nature and written by the author J.M.Parduman
    //knowledge of coding has been referenced solely from activities done at campus together with the teachings and notes provided by lecturer D.S Govender >> VCDN 2024 BCAD G2
    //Farrell, J. 2019. Java Programming. 9th ed. 2019. Course Technology, Cengage Learning 
}
