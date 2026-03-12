import java.util.HashMap;

public class BookMyStayApp {

    static HashMap<String,Integer> rooms = new HashMap<>();

    public static void main(String[] args) {

        rooms.put("Single",5);
        rooms.put("Double",3);
        rooms.put("Suite",2);

        System.out.println("Room Inventory");

        for(String room: rooms.keySet())
        {
            System.out.println(room + " : " + rooms.get(room));
        }

    }
}
