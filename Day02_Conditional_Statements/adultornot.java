import java.util.Scanner;
class person {
    String name,city;
    int age;
    Scanner sc=new Scanner(System.in);
    public void accept(){
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter city:");
        city=sc.next();
        System.out.println("Enter age:");
        age=sc.nextInt();
        

    }
    public void check(){
        if(age>18){
            System.out.println("The person is Adult");
        }
        else{
            System.out.println("The person is not Adult");
        }
    }
}
public class adultornot{
    public static void main(String[] args) {
        person p1=new person();
        p1.accept();
        p1.check();
    }
}