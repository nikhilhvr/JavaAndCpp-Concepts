import java.util.*;

public class questionOne {

    public static void main(String[] args) {
        // Write a Java program to get a number from the user and print whether it is
        // positive or negative

        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        if (number > 0) {

            System.out.println("Its a positive number 😎");

        }
        if (number < 0) {

            System.out.println("Its a negative number 😎");

        }

        else{
            System.out.println("Zero 💀");
        }

    }

}
