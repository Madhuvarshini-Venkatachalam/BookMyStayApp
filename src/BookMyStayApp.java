import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Add-On Services");
        System.out.println("1. Breakfast");
        System.out.println("2. Airport Pickup");
        System.out.println("3. Extra Bed");

        System.out.print("Choose service: ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Breakfast added");
                break;

            case 2:
                System.out.println("Airport pickup added");
                break;

            case 3:
                System.out.println("Extra bed added");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}