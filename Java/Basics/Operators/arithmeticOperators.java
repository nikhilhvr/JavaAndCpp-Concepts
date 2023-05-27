public class arithmeticOperators {
    public static void main(String[] args) {
        
        //Types of arithmeticOperators
        // Binary           Unary
        //   +               ++ 
        //   -               -- 
        //   *
        //   /   
        //   %

        int numOne = 51;
        int numTwo = 45;
        System.out.println("Addtion =" + (numOne+numTwo));
        System.out.println("Substration =" + (numOne-numTwo) );
        System.out.println("Multiplication =" + (numOne*numTwo));
        System.out.println("Divide =" + (numOne/numTwo) );
        System.out.println("Modulo =" + (numOne%numTwo));
        System.out.println("substration" + (numOne+numTwo) );

        //Unary
        
        //Post Increment
        System.out.println(numOne++);
        System.out.println(numTwo--);
        
        //Pre Increment
        System.out.println(++numOne);
        System.out.println(--numTwo);


    }
}
