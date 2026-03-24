
import java.util.Scanner;
public class MinOfArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 value:");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();

        }
        int min=a[0];
        for(i=0;i<5;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }

        System.out.println("Minimum value in the array is: " + min);
        int max =a[0];
        for(i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }

}