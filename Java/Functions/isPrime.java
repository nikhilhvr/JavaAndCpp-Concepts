public class isPrime {

    // Only for num>=2
    public static boolean isPrime(int num) {
        // if num ==2 then it will return true

        if (num == 2) {

            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {

        System.out.println("for num = 5 :-" + (isPrime(6)));
        System.out.println("for num = 2 :-" + (isPrime(2)));

    }
}