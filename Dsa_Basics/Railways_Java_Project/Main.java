package Dsa_Basics.Railways_Java_Project;

public class Main {

    public static void main(String[] args) {

        PassengerService service =
                new PassengerService();

        Passenger p1 =
                new Passenger(
                        101,
                        "Rahul",
                        21,
                        "Mathura",
                        "Delhi",
                        500
                );

        Passenger p2 =
                new Passenger(
                        102,
                        "Aman",
                        22,
                        "Agra",
                        "Noida",
                        700
                );

        service.addPassenger(p1);
        service.addPassenger(p2);

        service.displayPassenger();
    }
}