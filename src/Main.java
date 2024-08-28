import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//  A class should always start with an uppercase first letter.
public class Main {
    public static void main(String[] args) {

        // know the print syntax , we can use printf either instead of println
        System.out.println("you can call me simo");
        System.out.println(5);
        System.out.println(5+5); // this will output the sum of 5+5
        // Variables
        String name = "Mohamed";
        System.out.println("hello my name is " +name);
        // final variables : when you assign a value to them you can't change it back in the next lines
        final int num = 5;
        // num = 6 ; <== if you wanna change it's value like this it will output an error , because the variable is final

        // simple operations:
        int num1 = 5;
        int num2 = 5;
        System.out.println(num1 + num2);
        System.out.println(num1 * num2);


    }
}