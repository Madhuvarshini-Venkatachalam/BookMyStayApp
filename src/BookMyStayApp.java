import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rooms: ");

        try
        {
            int rooms = sc.nextInt();
            System.out.println("Rooms requested: " + rooms);
        }
        catch(Exception e)
        {
            System.out.println("Invalid input. Please enter number.");
        }

    }
}