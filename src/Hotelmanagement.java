import java.util.ArrayList;
import java.util.Scanner;

public class Hotelmanagement {
    private String name;
    private int numberOfRooms;
    private ArrayList<ClientH> Clients;
    public Hotelmanagement(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.Clients =  new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public static void main(String[] args) {
        Hotelmanagement hotel = new Hotelmanagement("Hotel Al Adarissa",2);
        while(true){
            System.out.println("Hotel Management System");
            System.out.println("1- Sign Up if you are new to this hotel\n");
            System.out.println("2- Log in if you already have an account");
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Welcome to Hotel Management System\n");
                    System.out.println("Please enter your name :");
                    String name = sc.next();
                    System.out.println("Please enter your age : ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    if(age < 18){
                        System.out.println("You must be  older than 18 years old\n");
                    }else{
                        System.out.println("Please enter your password");
                        String password = sc.next();
                        ClientH client = new ClientH(name, age , password);
                        hotel.Clients.add(client);
                        System.out.println("you have successfully signed up\n");
                    }
                    break;
                case 2:
                    System.out.println("Welcome to Hotel Management System\n");
                    System.out.println("Please enter your name :");
                    String loginName = sc.next();
                    System.out.println("Please enter your password : ");
                    String password = sc.next();
                    boolean loggedIn = false;
                    for(ClientH client : hotel.Clients){
                        if(loginName.equals(client.getName()) && password.equals(client.getPassword())){
                            loggedIn = true;
                            if(loggedIn == true){
                                System.out.println("-------------------------------------");
                                System.out.println("1- See how many rooms are availabe in our hotel\n");
                                System.out.println("2- reserve a room\n");
                                System.out.println("3- see your reservations\n");
                                int answer2 = sc.nextInt();
                                switch (answer2) {
                                    case 1:
                                        System.out.println(" the number of rooms availabe are : "+ hotel.getNumberOfRooms());
                                        break;
                                    case 2:
                                        System.out.println(" enter the number of rooms you wanna reserve");
                                        int numberOfreservations = sc.nextInt();
                                }
                            }else{
                                System.out.println("you are logged out");
                            }


                        }else{
                            loggedIn = false;
                            System.out.println("You do not have the correct information\n");
                        }
                    }
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
        }


    }
}
 class ClientH{
    private String name;
    private int age;
    private String password;
    public ClientH(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPassword() {
        return password;
    }

}
