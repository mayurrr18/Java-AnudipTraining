//check number is even or not
import java.util.*;

class EvenOdd {

    Scanner sc=new Scanner(System.in);
    int a;

    public void accept(){
        System.out.println("Enter  numbers");
        a=sc.nextInt();
    }


    public void result(){
        if( a % 2 == 0 ){
                System.out.println("the Enter number is Even"+a);
            }
        else{
            System.out.println("Enter number is odd"+a);
        }    
    }  
}
public class EvenOddNo{
    public static void main(String[] args) {
        EvenOdd ma=new EvenOdd();
        ma.accept();
        ma.result();
    }
}

