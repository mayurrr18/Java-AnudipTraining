import java.util.Scanner;
public class ReverseOfArray {
    public static void main(String[] args) {
         
        int a[]=new int[5];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 value:");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("Reverse of array");
        for(j = 4; i>= 0 ;j--)
        {
            System.out.println(a[j]);
        }
    }
}
