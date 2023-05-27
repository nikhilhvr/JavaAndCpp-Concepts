import java.util.Scanner;

public class areaOfCircle {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        float Pi = 3.14f;
        float Radius = scn.nextFloat();

        float areaOfCircle = Pi * Radius *Radius;

        System.out.println(areaOfCircle);
        

    }
}

