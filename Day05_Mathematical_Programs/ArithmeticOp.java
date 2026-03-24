/*wap to take input from the user and does all arthmetic operation possible */


import java.util.Scanner;
public class ArithmeticOp {
    public static void main(String[] args) {
        double num1, num2,add,sub,mul,div;
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        add=num1+num2;
        System.out.println("Addition of two number:"+add);
        mul=num1*num2;
        System.out.println("multiplication of 2 number is :"+mul);
        sub=num1-num2;
        System.out.println("subtrtaction of 2 numbers:"+sub);
        div=num1/num2;
         System.out.println("div of 2 numbers:"+div);

        
    }
}
