import java.util.*;

public class BookMyStayApp {

    static HashMap<String,Integer> rooms = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        rooms.put("Single",5);
        rooms.put("Double",3);
        rooms.put("Suite",2);

        System.out.print("Enter room type: ");
        String type = sc.nextLine();

        if(rooms.containsKey(type) && rooms.get(type) > 0)
        {
            rooms.put(type, rooms.get(type)-1);
            System.out.println("Room booked successfully");
        }
        else
        {
            System.out.println("Room not available");
        }

    }
}