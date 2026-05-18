package Dsa_Basics.Railways_Java_Project;

//import Dsa_Basics.Railways_Java_Project.PassengerRegistration;
import java.util.*;
public class BookingQueueService {

    Queue<Passenger> bookingQueue = new LinkedList<>();

    public void addBookingRequest(Passenger passenger) {
        bookingQueue.offer(passenger);
        System.out.println("Booking Added Successfully");
    }

    public void processBooking() {
        if (bookingQueue.isEmpty()) {
            System.out.println("No booking requests");
            return;
        }

        Passenger p = bookingQueue.poll();
        System.out.println("Booking Processed For: " + p.getName());
    }

    public void viewNextBooking() {
        if (bookingQueue.isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println(bookingQueue.peek());
    }

    public void displayPendingQueue() {
        for (Passenger p : bookingQueue) {
            System.out.println(p);
        }
    }
}