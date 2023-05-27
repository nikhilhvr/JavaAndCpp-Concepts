import java.util.Scanner;

public class questionTwo {
 
    public static void main(String[] args) {
        
        //You have a fever if your temperature is above 100 and otherwise prints You don't have a fever

        Scanner scn = new Scanner(System.in);
        float temp = scn.nextFloat();

        if (temp > 100 ) {

            System.out.println("Fever 🤧");

        }
        else{

            System.out.println("Everthing is alright 😉");

        }

    }
}
