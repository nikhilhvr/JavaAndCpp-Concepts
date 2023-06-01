public class arrayFunction {


    public static void update(String[] language) {
        for (int i = 0; i < language.length; i++) {
            language[i] = language[i] + " I am the best";
        }
        
    }
    public static void main(String[] args) {
        String language[] ={"Rust","Go","C++","Java","yaml"};
        update(language);

        for (int i = 0; i < language.length; i++) {
            System.out.println(language[i]);
            
        }
        
    }
}
