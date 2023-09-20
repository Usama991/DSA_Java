import java.util.Scanner;
public class VotingMember {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println(" Plz Enter Your Age"  + ":");
        int Age = n.nextInt();

        if (Age > 18 ){
            System.out.println(" Person is Eligible for vote");
        } else {
            System.out.println(" Person is not Eligible for vote ");
        }
    }

    
}
