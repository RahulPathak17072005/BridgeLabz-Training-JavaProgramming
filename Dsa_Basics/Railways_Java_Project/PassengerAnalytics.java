package Dsa_Basics.Railways_Java_Project;
import java.util.*;
//import Dsa_Basics.Railways_Java_Project.PassengerRegistration;
public class PassengerAnalytics {

    HashMap<String, Integer> stationCount = new HashMap<>();

    public void addVisitStation(String station) {

        stationCount.put(station,
                stationCount.getOrDefault(station, 0) + 1);

        System.out.println("Station Visit Added");
    }

    public void countPassengersPerStation() {

        if (stationCount.isEmpty()) {
            System.out.println("No station data found");
            return;
        }

        for (String station : stationCount.keySet()) {

            System.out.println(
                    station + " -> " + stationCount.get(station)
            );
        }
    }

    public void mostVisitedRoute() {

        int max = 0;
        String mostVisited = "";

        for (String station : stationCount.keySet()) {

            int count = stationCount.get(station);

            if (count > max) {
                max = count;
                mostVisited = station;
            }
        }

        System.out.println(
                "Most Visited Station: " +
                        mostVisited + " -> " + max + " passengers"
        );
    }

    public void searchFrequency(String station) {

        int count = stationCount.getOrDefault(station, 0);

        System.out.println(
                station + " visited by " + count + " passengers"
        );
    }
}