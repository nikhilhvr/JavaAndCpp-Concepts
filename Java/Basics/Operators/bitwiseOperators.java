public class bitwiseOperators {
    
    public static void main(String[] args) {
        
                // Bitwise AND operator
                int a = 10; // 1010 in binary
                int b = 15; // 1111 in binary
                int c = a & b; // 1010 in binary
                System.out.println("a & b = " + c);
        
                // Bitwise OR operator
                c = a | b; // 1111 in binary
                System.out.println("a | b = " + c);
        
                // Bitwise XOR operator
                c = a ^ b; // 0101 in binary
                System.out.println("a ^ b = " + c);
        
                // Bitwise NOT operator
                c = ~a; // 0101 in binary
                System.out.println("~a = " + c);
        
                // Bitwise shift left operator
                c = a << 1; // 20 in binary
                System.out.println("a << 1 = " + c);
        
                // Bitwise shift right operator
                c = a >> 1; // 5 in binary
                System.out.println("a >> 1 = " + c);
            }
        
        
    }

