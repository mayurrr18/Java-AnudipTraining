import java.util.Scanner;

public class AscendingOrder {
    
    public static void main(String[] args) {
        int a[]=new int[5];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 value:");
        for(i=0;i<5;i++)
        {
             a[i]=sc.nextInt();

        }
          for(i=0;i<5;i++)
           {
            for(j=i+1;j<5;j++)
            {
               if(a[i]<a[j])
               {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               }
            }
        }
             System.out.println("sorted element ");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
     }
}

