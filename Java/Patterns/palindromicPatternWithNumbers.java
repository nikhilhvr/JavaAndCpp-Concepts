 public class palindromicPatternWithNumbers {
    public static void main(String[] args) {
        short n = 5;
        for (short i = 1; i <= n; i++) {
            for (short j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (short j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (short j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

