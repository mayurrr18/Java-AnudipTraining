//wap largest among 2 program

import java.util.*;

class Largest2 {

    Scanner sc=new Scanner(System.in);
    int a,b;

    public void accept(){
        System.out.println("Enter the 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }


    public void result(){
        if(a>b){
            System.out.println("It is largest number"+a);
        }
        else{
            System.out.println("It is largest number"+b);
        }
    }  
}
public class Largest2no{
    public static void main(String[] args) {
        Largest2 ma=new Largest2();
        ma.accept();
        ma.result();
    }
}
