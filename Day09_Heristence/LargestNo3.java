//java largest among 3number 
import java.util.*;

class Largest3 {

    Scanner sc=new Scanner(System.in);
    int a,b,c;

    public void accept(){
        System.out.println("Enter the 3 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    }


    public void result(){
        if(a>b){
            if(a>c)
            System.out.println("It is largest number"+a);
        }
        else if(b>c){
            System.out.println("It is largest number"+b);
        }
        else{
            System.out.println("it largest number"+c);
        }
    }  
}
public class LargestNo3
{
    public static void main(String[] args) {
        Largest3 ma=new Largest3();
        ma.accept();
        ma.result();
    }
}





