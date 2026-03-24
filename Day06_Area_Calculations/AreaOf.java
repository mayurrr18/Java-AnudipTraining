import java.util.Scanner;

public class AreaOf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1,num2,ans;
        System.out.println("Select choice from given menu");
        System.out.println("1,Circle \t 2.recTriangle\t 3.sqaure");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();

        switch(ch)
        {
          case 1:
            System.out.println("enter radius");
            num1=sc.nextDouble();
            double pie=3.14;
            ans=pie*num1*num1;
            System.out.println("area of cirle:"+ans);
            break;

           case 2:
            System.out.println("enter length and breadth");
            num1=sc.nextDouble();
            num2=sc.nextDouble();
            ans=num1*num2;
            System.out.println("area of rectangle:"+ans);
            break;
           
            case 3:
            System.out.println("length of square ");
            num1=sc.nextDouble();
            ans=num1*num1;
            System.out.println("Area of Square:"+ans);
            break;

            default:
                System.out.println("invalid ");
                break;
        }

    }

    
}