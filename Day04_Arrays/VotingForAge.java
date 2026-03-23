//wap to check wheather a person is eligible for voting or not*
import java.util.*;

class Age{

    Scanner sc=new Scanner(System.in);
    int a;

    public void accept(){
        System.out.println("Enter your Age");
        a=sc.nextInt();
       
    }


    public void result(){
        if(a>18){
            System.out.println("The person is eligible for voting :"+a);
        }
        else{
            System.out.println("The person is not eligible for voting, Age is less:"+a);
        }
    }  
}
public class VotingForAge{
    public static void main(String[] args) {
        Age ma=new Age();
        ma.accept();
        ma.result();
    }
}




