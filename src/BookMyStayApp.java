import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        ArrayList<String> history = new ArrayList<>();

        history.add("Ravi booked Single Room");
        history.add("Arun booked Double Room");

        System.out.println("Booking History");

        for(String h : history)
        {
            System.out.println(h);
        }
    }
}