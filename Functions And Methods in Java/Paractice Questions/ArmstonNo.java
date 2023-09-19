import java. util.Scanner;
public class ArmstonNo {
    public static void main(String[] args) {
           Scanner in = new Scanner (System.in);
           int n = in.nextInt();
           System.out.println(IsAmston(n));

        
    }
    static boolean IsAmston (int n){
        int originalNo = n;
        int sum = 0;
        while (n >0) {
              int rem = n %10;
              n = n / 10;
              sum = sum + rem * rem * rem;
        }
         return  sum == originalNo;
           

            
        }

      


    }


    

