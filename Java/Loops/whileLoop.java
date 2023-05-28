import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        while (number<100) {
            System.out.println(number);
            number++;
        }
    }
}
