import java.util.Scanner;

interface RoomBillComponent {
    double FOOD_CHARGE = 800;
    double EXTRA_PERSON_CHARGE = 500;
    double TAX = 0.12; 
}

class RoomDetails implements RoomBillComponent {
    private static int counter = 100; 
    private int billId;
    private String customerName;
    private String typeOfRoom;
    private int noOfExtraPersons;
    private int noOfDaysOfStay;

    public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
        this.billId = ++counter;
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom;
        this.noOfExtraPersons = noOfExtraPersons;
        this.noOfDaysOfStay = noOfDaysOfStay;
    }

    public void validateNoOfExtraPerson() {
        if (noOfExtraPersons < 0 || noOfExtraPersons > 2) {
            System.out.println("Error: Only 0 to 2 extra persons are allowed.");
        }
    }

    public void validateTypeOfRoom() {
        if (!typeOfRoom.equals("Standard") && !typeOfRoom.equals("Deluxe") && !typeOfRoom.equals("Cottage")) {
            System.out.println("Error: Invalid room type.");
        }
    }

    public void validateNoOfDaysOfStay() {
        if (noOfDaysOfStay < 1 || noOfDaysOfStay > 15) {
            System.out.println("Error: Number of days must be between 1 and 15.");
        }
    }

    public double calculateBill() {
        validateTypeOfRoom();
        validateNoOfDaysOfStay();
        validateNoOfExtraPerson();

        double baseFare = getBaseFare();
        double totalBill = (noOfDaysOfStay * baseFare) 
                         + (noOfDaysOfStay * FOOD_CHARGE) 
                         + (EXTRA_PERSON_CHARGE * noOfExtraPersons);
        totalBill += (TAX * totalBill); // Adding tax

        return totalBill;
    }

    private double getBaseFare() {
        switch (typeOfRoom) {
            case "Standard":
                return 2500; // Base fare for Standard
            case "Deluxe":
                return 3500; // Base fare for Deluxe
            case "Cottage":
                return 5500; // Base fare for Cottage
            default:
                return 0;
        }
    }

    public void displayDetails() {
        System.out.println("BillId: " + billId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("No. of days of Stay: " + noOfDaysOfStay);
        System.out.printf("Total Bill: %.2f%n", calculateBill());
    }
}

public class NATURE_VALLEY_Homestay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example input
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("Enter Type of Room (Standard/Deluxe/Cottage): ");
        String typeOfRoom = scanner.nextLine();
        
        System.out.print("Enter No. of Extra Persons (0-2): ");
        int noOfExtraPersons = scanner.nextInt();
        
        System.out.print("Enter No. of Days of Stay (1-15): ");
        int noOfDaysOfStay = scanner.nextInt();

        RoomDetails roomDetails = new RoomDetails(customerName, typeOfRoom, noOfExtraPersons, noOfDaysOfStay);
        roomDetails.displayDetails();

        scanner.close();
    }
}
