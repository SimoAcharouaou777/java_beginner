import java.util.ArrayList;

public class HotelManagment {
    public static void main(String[] args) {
        Client client1 = new Client("Mohamed",21);
        Client client2 = new Client("Soufian", 23);
        Client client3 = new Client("Lahcen",22);
        ArrayList<Reservation> Reservations = new ArrayList<>();
        ArrayList<Client> Clients = new ArrayList<>();
        Clients.add(client1);
        Clients.add(client2);
        Clients.add(client3);
        Hotel hotel = new Hotel("HotelAl-Adarissa", 4, Reservations, Clients);
        hotel.displayClients();

    }
}

class Reservation {
    private int reservationId;
    private String clientName;
    private int roomNumber;
    private String startDate;
    private String endDate;
    public Reservation(int reservationId ,String clientName, int roomNumber, String startDate,String endDate){
        this.reservationId = reservationId;
        this.clientName = clientName;
        this.roomNumber = roomNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
class Hotel{
    private String hotelName;
    private int numberOfRooms;
    private ArrayList<Reservation> Reservations;
    private ArrayList<Client> Clients;
    public Hotel(String hotelName, int numberOfRooms, ArrayList<Reservation> Reservations, ArrayList<Client> Clients){
        this.hotelName = hotelName;
        this.numberOfRooms = numberOfRooms;
        this.Reservations = Reservations;
        this.Clients = Clients;
    }
    public void displayClients(){
        System.out.println("clients informations : ");
        for( Client client : Clients){
            System.out.println("client name : "+ client.getName() + " \nclient age : " + client.getAge() +".");
        }
    }

}

class Client{
    private String name;
    private int age;
    public Client(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

