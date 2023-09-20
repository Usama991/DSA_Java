import java.util.Scanner;
public class CircumfiranceRadius {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         System.out.println("Type your Radius number for circumfirance "  + ":") ;
        int r = in.nextInt();
        

        int circumference = calculateCircumference(r);
   
        System.out.println(   "Here is Your Cirumference of Circle of Given Radius"   + " " +     circumference);

        


    }

    static int calculateCircumference (int r){
        int circumference = 0;
        if ( r >0){
          circumference = (int) (2 * Math.PI *r);
            

        } return circumference;

    }
}
