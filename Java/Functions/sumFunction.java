import java.util.Scanner;

public class sumFunction {
    
    public static int calculateSum(int numOne , int numTwo) { //parameters or formal parameter

        int sum =numOne+numTwo;

        return sum;
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = calculateSum(a, b); //Actual parameters or arguments
        System.out.println("sum :-" + (a+b));
    }
}
