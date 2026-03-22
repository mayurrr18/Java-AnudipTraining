import java.util.Scanner;
public class E1 {

    public static void main(String[] args) 
    {
        float A,Bill;
        System.out.println("Enter THE BILL");
        Scanner maScanner=new Scanner(System.in);
        A=maScanner.nextFloat();
        if (A<100)
            {
            Bill=150;
            System.out.println("your bill"+Bill);
        }
        else if(A>100 && A<199)
        {
            Bill=400;
            System.out.println("your bill"+Bill);
        }
        else if(A>200 && A<=300)
        {
            Bill=550;
            System.out.println("your bill :"+Bill);
        }
        else if(A>300)
        {
            Bill=1000;
            System.out.println("your bill :"+Bill);
        }
        else{
            System.err.println("invalidSS");
        }
    }
}