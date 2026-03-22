import java.util.*;
public class Table {
    public static void main(String[] args) {
        int num,i=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table:");
      num = sc.nextInt();
        while (i<=10) {
            System.out.println(num + " x " + i +"="+ num*i );
            i++;
            
         }

        }
    }
    

