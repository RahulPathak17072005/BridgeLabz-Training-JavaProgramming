package Dsa_Basics.Railways_Java_Project;

import java.util.Stack;

//import Dsa_Basics.Railways_Java_Project.PassengerRegistration;
public class RecentStationService {

    Stack<String> stationHistory = new Stack<>();

    public void addRecentStation(String station) {
        stationHistory.push(station);
        System.out.println("Station Added");
    }

    public void undoLastVisitedStation() {
        if (stationHistory.isEmpty()) {
            System.out.println("No history found");
            return;
        }

        String removed = stationHistory.pop();
        System.out.println("Removed: " + removed);
    }

    public void displayHistory() {
        System.out.println(stationHistory);
    }
}