package Dsa_Basics.Railways_Java_Project;

public class CircularPassengerService {

    class Node {

        String passengerName;
        Node next;

        Node(String passengerName) {
            this.passengerName = passengerName;
        }
    }
    Node head = null;
    Node tail = null;

    public void addPassenger(String name) {

        Node newNode = new Node(name);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {

            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Passenger Added To Circular Route");
    }

    public void removePassenger(String name) {

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        Node current = head;
        Node previous = tail;

        do {

            if (current.passengerName.equals(name)) {

                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }

                System.out.println("Passenger Removed");
                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println("Passenger Not Found");
    }

    public void displayCircularJourney() {

        if (head == null) {
            System.out.println("No Passengers");
            return;
        }

        Node temp = head;

        do {

            System.out.print(temp.passengerName + " -> ");
            temp = temp.next;

        } while (temp != head);

        System.out.println("(Back To Start)");
    }
}