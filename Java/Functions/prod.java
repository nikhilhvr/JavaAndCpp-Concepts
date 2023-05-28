import java.util.Scanner;

public class prod {

    public static int productTwoNum(int numOne, int  numTwo) {

        int sum =numOne*numTwo;
        return sum;
        
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numOne = scn.nextInt();
        int numTwo = scn.nextInt();
        int prod = productTwoNum(numOne,numTwo);
        System.out.println("numOne * numbTwo =" + (numOne*numTwo));

    }
    
}
