package Dsa_Basics.Railways_Java_Project;
import java.util.*;
//import Dsa_Basics.Railways_Java_Project.PassengerRegistration;
public class SortingService {

    public void bubbleSortByAge(ArrayList<Passenger> passengers) {

        int n = passengers.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (passengers.get(j).getAge() >
                        passengers.get(j + 1).getAge()) {

                    Passenger temp = passengers.get(j);

                    passengers.set(j, passengers.get(j + 1));

                    passengers.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted By Age");
    }

    public void insertionSortByWallet(
            ArrayList<Passenger> passengers) {

        for (int i = 1; i < passengers.size(); i++) {

            Passenger current = passengers.get(i);

            int j = i - 1;

            while (j >= 0 &&
                    passengers.get(j).getWalletBalance()
                            > current.getWalletBalance()) {

                passengers.set(j + 1, passengers.get(j));

                j--;
            }

            passengers.set(j + 1, current);
        }

        System.out.println("Sorted By Wallet Balance");
    }

    public Passenger binarySearchById(
            ArrayList<Passenger> passengers,
            int id) {

        int low = 0;
        int high = passengers.size() - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (passengers.get(mid).getId() == id) {
                return passengers.get(mid);
            }

            else if (passengers.get(mid).getId() < id) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return null;
    }
}