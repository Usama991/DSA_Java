public class Count{
public static void main(String[] args) {
    int n = 13585559;
    int count = 0;
  while (n > 0) {
    int reminder = n %10;
    if (  reminder == 5 ){
        count++;
    
    }
    n = n / 10;

    
  }

  System.out.println(count);
}
    
}