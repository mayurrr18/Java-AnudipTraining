import java.util.*;
public class Seriess {
    public static void main(String[] args) {
        int a=0,b=1,sum,i;
        System.out.println(a+"\t");
        System.out.println(b+"\t");
        for(i=1;i<=10;i++)
        {
            sum=a+b;
            System.out.println(sum+"\t");
            a=b;
            b=sum;
        }
        
    }
    
}
