import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("this number is even");
        }else{
            System.out.println("this number is odd");
        }
    }
}
