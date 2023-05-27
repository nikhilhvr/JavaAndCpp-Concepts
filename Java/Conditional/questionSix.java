import java.util.*;

public class questionSix {

    public static void main(String[] args) {
        // Income tax calculator

        Scanner scn = new Scanner(System.in);
        long Income = scn.nextLong();

        if (Income <= 200000) {
            System.out.println("No tax to be paid");

        }
        if (Income >= 200000 && Income <= 500000) {
            System.out.println("" + (Income * (0.05)));
        }
        if (Income >= 500000 && Income <= 1500000) {
            System.out.println("" + (Income * (0.15)));
        }

    }
}
