import java.util.*;

public class BookMyStayApp {

    static HashMap<String,Integer> rooms = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        rooms.put("Single",5);
        rooms.put("Double",3);
        rooms.put("Suite",2);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter room type: ");
        String type = sc.nextLine();

        if(rooms.containsKey(type))
        {
            System.out.println("Booking request received for " + name);
        }
        else
        {
            System.out.println("Invalid room type");
        }

    }
}