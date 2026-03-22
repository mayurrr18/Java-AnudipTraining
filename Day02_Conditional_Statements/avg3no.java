import java.util.Scanner;
class avg3 {
    double a1,a2,a3,avg,sum;
    Scanner sc=new Scanner(System.in);

    public void accept(){
        System.out.println("Enter three numbers:");
        a1=sc.nextDouble();
        a2=sc.nextDouble();
        a3=sc.nextDouble();
    }
    public void calculate(){
        sum=a1+a2+a3;
        avg=sum/3;
        System.out.println("The average of three number is="+avg);
    }
}
public class avg3no{
    public static void main(String[] args) {
        avg3 av=new avg3();
        av.accept();
        av.calculate();
    }
}