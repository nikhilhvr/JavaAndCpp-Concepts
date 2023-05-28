public class callByValue {

public static void swap(int numOne,int numbTwo) {
    int temp =numOne;
    numOne =numbTwo;
    numbTwo=temp;
    //In Java never pass the original value it pass just a copy of it.
    //copy values.
    System.out.println("copyValueOfNumOne :-"+ (numOne));
    System.out.println("copyValueOfNumTwo :-"+ (numbTwo));
    

}
    public static void main(String[] args) {
        //Original values.
        int numOne =21;
        int numbTwo= 27;
        swap(numOne, numbTwo);
        System.out.println("originalValueOfNumOne :-"+ (numOne));
        System.out.println("originalValueOfNumTwo :-"+ (numbTwo));
      
        
    }
}
