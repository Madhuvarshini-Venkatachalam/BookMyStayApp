import java.io.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        try
        {
            FileWriter writer = new FileWriter("booking.txt");

            writer.write("Ravi booked Single Room");

            writer.close();

            System.out.println("Booking saved to file");

        }
        catch(Exception e)
        {
            System.out.println("Error saving booking");
        }

    }
}