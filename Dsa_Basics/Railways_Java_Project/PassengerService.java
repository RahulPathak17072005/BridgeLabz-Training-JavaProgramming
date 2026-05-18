package Dsa_Basics.Railways_Java_Project;

import java.util.*;

public class PassengerService {

    private ArrayList<Passenger> passengers =
            new ArrayList<>();

    public void addPassenger(Passenger p) {

        for (Passenger passenger : passengers) {

            if (passenger.getId() == p.getId()) {

                System.out.println(
                        "Passenger ID must be unique"
                );

                return;
            }
        }

        passengers.add(p);

        System.out.println(
                "Passenger Added Successfully"
        );
    }

    public void displayPassenger() {

        if (passengers.isEmpty()) {

            System.out.println(
                    "No Passenger Found"
            );

            return;
        }

        for (Passenger p : passengers) {

            System.out.println(p);
        }
    }

    public void searchPassengerById(int passenger_id) {

        for (Passenger p : passengers) {

            if (p.getId() == passenger_id) {

                System.out.println(p);

                return;
            }
        }

        System.out.println("Passenger Not Found");
    }

    public void removePassenger(int passenger_id) {

        Iterator<Passenger> iterator =
                passengers.iterator();

        while (iterator.hasNext()) {

            Passenger p = iterator.next();

            if (p.getId() == passenger_id) {

                iterator.remove();

                System.out.println(
                        "Passenger Removed Successfully"
                );

                return;
            }
        }

        System.out.println("Passenger Not Found");
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}