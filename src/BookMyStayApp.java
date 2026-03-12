import java.util.*;

public class BookMyStayApp {

    static HashMap<String,Integer> rooms = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        rooms.put("Single",5);
        rooms.put("Double",3);
        rooms.put("Suite",2);

        System.out.print("Enter room type to search: ");
        String type = sc.nextLine();

        if(rooms.containsKey(type))
        {
            System.out.println("Available rooms: " + rooms.get(type));
        }
        else
        {
            System.out.println("Room type not available");
        }

    }
}