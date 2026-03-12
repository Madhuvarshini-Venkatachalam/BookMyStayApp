public class BookMyStayApp {

    static int rooms = 1;

    public static void main(String[] args) {

        Thread user1 = new Thread(() -> bookRoom());
        Thread user2 = new Thread(() -> bookRoom());

        user1.start();
        user2.start();
    }

    public synchronized static void bookRoom()
    {
        if(rooms > 0)
        {
            System.out.println(Thread.currentThread().getName()+" booked room");
            rooms--;
        }
        else
        {
            System.out.println("No rooms available");
        }
    }
}