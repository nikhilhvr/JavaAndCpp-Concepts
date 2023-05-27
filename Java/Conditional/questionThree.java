import java.util.*;
public class questionThree {

    public static void main(String[] args) {
        
        // Write a Java program to input week number(1-7) and print day of week name using switch case
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        switch (number) {
            case 1: System.out.println("Monday");
                
                break;
            case 2: System.out.println("Tuseday");
                
                break;
            case 3: System.out.println("Wednesday");
                
                break;
            case 4: System.out.println("Thursday");
                
                break;
            case 5: System.out.println("Friday");
                
                break;
            case 6: System.out.println("Saturday");
                
                break;
            case 7: System.out.println("Sunday");
                
                break;
        
            default:System.out.println("Wrong Number");
                break;
        }

    }
}
