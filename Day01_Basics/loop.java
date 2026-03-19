import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner mayurSystem=new Scanner(System.in);
    
        int n = mayurSystem.nextInt();
        int fact = 1;
        
       for (int i = 1; i <= n ; i++) {
             fact = fact*i;
       }
    System.out.println(fact);
    mayurSystem.close();
    }
}
