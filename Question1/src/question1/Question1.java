package question1;
import java.util.Scanner;

public class Question1 {

    
    public static void main(String[] args) {
        // Scanner to accept user input
        Scanner sc = new Scanner(System.in);

        // Cities array to store the names of the cities
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // 2D array to store accidents for cars and motorbikes in the cities
        int[][] accidents = new int[3][2];  

        // Input accidents for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of car accidents for " + cities[i] + ": ");
            accidents[i][0] = sc.nextInt();  // Car accidents

            System.out.print("Enter the number of motor bike accidents for " + cities[i] + ": ");
            accidents[i][1] = sc.nextInt();  // Motorbike accidents
        }

        // Displaying the road accident report
        System.out.println("\n*************************************************************************");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("*************************************************************************");
        System.out.println("City                            CAR                MOTOR BIKE");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) 
        {
            System.out.printf("%-30s %10d %20d\n", cities[i], accidents[i][0], accidents[i][1]);
        }

        // Calculating and displaying total accidents for each city
        System.out.println("************************************************************************");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("************************************************************************");
        int[] cityTotals = new int[cities.length];
        int maxAccidents = 0;
        String cityWithMostAccidents = "";

        for (int i = 0; i < cities.length; i++) {
            cityTotals[i] = accidents[i][0] + accidents[i][1];
            System.out.printf("%-30s %10d\n", cities[i], cityTotals[i]);

            // Determine city with the most accidents
            if (cityTotals[i] > maxAccidents) {
                maxAccidents = cityTotals[i];
                cityWithMostAccidents = cities[i];
            }
        }

        // Displaying the city with the most vehicle accidents
        System.out.println("\nCITY WITH THE MOST VEHICLE ACCIDENTS: " + cityWithMostAccidents);
        System.out.println("***********************************************************************");

        sc.close();
    }
    
    //all coding within the Question1.java, unless stated otherwise are original in nature and written by the author J.M.Parduman
    //knowledge of coding has been referenced solely from activities done at campus together with the teachings and notes provided by lecturer D.S Govender >> VCDN 2024 BCAD G2
    //Farrell, J. 2019. Java Programming. 9th ed. 2019. Course Technology, Cengage Learning 
}
