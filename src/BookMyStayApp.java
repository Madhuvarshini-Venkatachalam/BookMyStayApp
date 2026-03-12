import java.util.*;

public class BookMyStayApp {

    static HashMap<String,Integer> rooms = new HashMap<>();

    public static void main(String[] args) {

        rooms.put("Single",5);

        System.out.println("Cancelling booking for Single Room");

        rooms.put("Single", rooms.get("Single")+1);

        System.out.println("Room added back to inventory");
        System.out.println("Available Single Rooms: " + rooms.get("Single"));

    }
}