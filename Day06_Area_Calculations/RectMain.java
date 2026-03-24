import java.util.Scanner;

 class Rec {
    int len,width,area;
    Scanner sc=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter length and breadth ");
        len=sc.nextInt();
        width=sc.nextInt();
    }
    public void calculate()
    {
        area=len*width;
        System.out.println("the area of rec is :"+area);

    }
}
public class RectMain 
{
    public static void main(String[] args) {
        Rec obj=new Rec();
        obj.accept();
        obj.calculate();
    }

    
}
