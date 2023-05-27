public class typeCasting {

    public static void main(String[] args) {

        // Type Casting can cause possible lossy conversion.

        float numOne = 8.888f;
        int numTwo = (int) numOne;
        System.out.println(numTwo);

        char ch = 'a';
        int number = ch;
        System.out.println(number);

    }
}
