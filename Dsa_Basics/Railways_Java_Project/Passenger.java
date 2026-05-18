package Dsa_Basics.Railways_Java_Project;

public class Passenger {

    private int passenger_id;
    private String name;
    private int age;
    private String source_station;
    private String destination_station;
    private double wallet_Balance;

    public Passenger(int passenger_id,
                     String name,
                     int age,
                     String source_station,
                     String destination_station,
                     double wallet_Balance) {

        this.passenger_id = passenger_id;
        this.name = name;
        this.age = age;
        this.source_station = source_station;
        this.destination_station = destination_station;
        this.wallet_Balance = wallet_Balance;
    }

    public int getId() {
        return passenger_id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSourceStation() {
        return source_station;
    }

    public String getDestinationStation() {
        return destination_station;
    }

    public double getWalletBalance() {
        return wallet_Balance;
    }

    @Override
    public String toString() {

        return "ID: " + passenger_id +
                ", Name: " + name +
                ", Age: " + age +
                ", Source Station: " + source_station +
                ", Destination Station: " + destination_station +
                ", Wallet Balance: " + wallet_Balance;
    }
}