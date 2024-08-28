import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = sn.nextInt();
        System.out.print("enter the calculation : + , % , * , - , / ");
        String operation = sn.next();
        System.out.println("enter a second number");
        int secondNumber = sn.nextInt();
        switch (operation){
            case "+": System.out.println(number  + secondNumber);
            break;
            case "-": System.out.println(number - secondNumber);
            break;
            case "*": System.out.println(number * secondNumber);
            break;
            case "/": System.out.println(number /  secondNumber);
            break;
            case "%": System.out.println(number %  secondNumber);
            break;
        }
    }
}
