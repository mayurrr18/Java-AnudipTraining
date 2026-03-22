import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1,num2,ans;
        System.out.println("Select choice from given menu");
        System.out.println("1,ADDITION\t 2.SUBTRACTION\t 3.MULTIPLICATION\t 4.  DIVISION \t 5. modulo");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();

        switch(ch)
        {
          case 1:
            System.out.println("enter two number");
            num1=sc.nextDouble();
            num2=sc.nextDouble();
            ans=num1+num2;
            System.out.println("Addition is :"+ans);
            break;

           case 2:
            System.out.println("enter two number");
            num1=sc.nextDouble();
            num2=sc.nextDouble();
            ans=num1-num2;
            System.out.println("Subtrtaction is:"+ans);
            break;
           
            case 3:
            System.out.println("enter two number");
            num1=sc.nextDouble();
            num2=sc.nextDouble();
            ans=num1*num2;
            System.out.println("multiplication is:"+ans);
            break;

            case 4:
            System.out.println("enter two number");
            num1=sc.nextDouble();
            num2=sc.nextDouble();
            ans=num1/num2;
            System.out.println("divisionis:"+ans);
            break;
             
            case 5:
            System.out.println("enter two number");
            num1=sc.nextDouble();
            num2=sc.nextDouble();
            ans=num1%num2;
            System.out.println("modulo is:"+ans);
            break;



            default:
                System.out.println("invalid ");
                break;
        }

    }

    
}