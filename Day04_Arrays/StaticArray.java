/* 
public class StaticArray {

    public static void main(String[] args) {
        int i;
        int marks[]={78,45,78,45,36,98};
        for(i=0;i<6;i++)
        {
            System.out.println(marks[i]);
            

        }

    }
}*/

/*Accept value from the user 

*/

import java.util.Scanner;
public class StaticArray {

    public static void main(String[] args) {
        int a[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 value:");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("you have entered");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
