import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int rem,rev=0,n;
         Scanner mayurSystem=new Scanner(System.in);
         System.out.println("Enter the number");
         n=mayurSystem.nextInt();
         while(n>0)
         {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
         }System.out.println(rev);
         }
    }

