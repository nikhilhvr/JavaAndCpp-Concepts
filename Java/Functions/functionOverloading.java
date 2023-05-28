public class functionOverloading {

    
    public static int sum(int numOne,int numTwo) {

        return numOne+numTwo;
        
    }
    public static int sum(int numOne,int numTwo,int numThree) {

        return numOne+numTwo+numThree;
        
    }
    public static void main(String[] args) {
        System.out.println("sumThree ="+ (sum(10, 10, 10)));
        System.out.println("sumTwo="+ sum(10, 10));
        
    }
}