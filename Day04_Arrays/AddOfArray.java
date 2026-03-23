import java.util.Scanner;

public class AddOfArray {
     public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 value of a:");
         for(i=0;i<5;i++)
        {
               a[i]=sc.nextInt();

         }
            System.out.println("Enter 5 value of b:");
               for(i=0;i<5;i++)
         {
               b[i]=sc.nextInt();

         }
        for(i=0;i<5;i++)
         {
               c[i]=a[i]+b[i];
         }
             System.out.println("Addition of two array is:");
        for(i=0;i<5;i++)
         {
              System.out.println(c[i]);
         }   

    }

}
