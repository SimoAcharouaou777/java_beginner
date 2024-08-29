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
        hotel.makeReservation(client1,1,"29-08-2024", "30-08-2024");
        hotel.makeReservation(client2,2,"29-08-2024", "31-08-2024");
        hotel.makeReservation(client2,1,"29-08-2024", "31-08-2024");

//        hotel.editeReservation(client2,2,"22-22-22", "23-23-23");
//        hotel.deleteReservation(client2,2);
//        hotel.displayReservations();

    }
}

class Reservation {
    private int reservationId;
    private String clientName;
    private int roomToReserve;
    private String startDate;
    private String endDate;
    public Reservation(int reservationId ,String clientName, int roomToReserve, String startDate,String endDate){
        this.reservationId = reservationId;
        this.clientName = clientName;
        this.roomToReserve = roomToReserve;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public int getReservationId(){
        return reservationId;
    }
    public String getClientName(){
        return clientName;
    }
    public int roomToReserve(){
        return roomToReserve;
    }
    public String getStartDate(){
        return startDate;
    }
    public String getEndDate(){
        return endDate;
    }
    public void setReservationId(int reservationId){
        this.reservationId = reservationId;
    }
    public void setClientName(String clientName){
        this.clientName = clientName;
    }
    public void setroomToReserve(int roomToReserve){
        this.roomToReserve = roomToReserve;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    public void setEndDate(String endDate){
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
    public void makeReservation(Client client ,int roomToReserve,String startDate,String endDate){
        int reservationId = Reservations.size()+1;
        if(numberOfRooms >= roomToReserve){
            Reservation reservation = new Reservation(reservationId,client.getName(),roomToReserve,startDate,endDate);
            Reservations.add(reservation);
             numberOfRooms -=  roomToReserve;
            System.out.println("Reservation done successfully");
        }else{
            System.out.println("there is no enough rooms ");
        }

    }
    public void displayReservations(){
        System.out.println("reservations informations: ");
        for(Reservation reservation : Reservations){
            System.out.println("reservation ID : " + reservation.getReservationId() + "\nclient name : " + reservation.getClientName() + "\nreservation start date : " + reservation.getStartDate() + "\nreservation end date : " + reservation.getEndDate());
        }
    }

    public void editeReservation(Client client , int reservationId,String newStartDate ,String newEndDate){
        for(Reservation reservation : Reservations){
            if(reservation.getReservationId() == reservationId && reservation.getClientName().equals(client.getName())){
                reservation.setStartDate(newStartDate);
                reservation.setEndDate(newEndDate);
                System.out.println("Reservation edited successfully");
            }else{
                System.out.println("Reservation does not exist");
            }
        }
    }

    public void deleteReservation(Client client , int reservationId){
        for(Reservation reservation : Reservations){
            if(reservation.getReservationId() == reservationId && reservation.getClientName().equals(client.getName())){
                Reservations.remove(reservation);
                return;
            }else{
                System.out.println("Reservation does not exist");
            }
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

