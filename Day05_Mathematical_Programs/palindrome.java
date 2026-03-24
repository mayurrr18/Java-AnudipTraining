import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int rem,rev=0,n,ori;
         Scanner mayurSystem=new Scanner(System.in);
         System.out.println("Enter the number");
         n=mayurSystem.nextInt();
         ori=n;
         while(n>0)
         {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
         }
         if(ori==rev){
            System.out.println("Number is palindrome");
         }
         else
         {
            System.out.println("not palindrome");
         }
         }
    }

