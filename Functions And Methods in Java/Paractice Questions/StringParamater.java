public class StringParamater {
    public static void main(String[] args) {
        String entry = Greet( "Usama");
        System.out.println(entry);
        
    }
    static String Greet(String name){
        String greeting = " Hey" + " " + name;
        return greeting;
    }
    
}
