import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
       String name;
       char inputData;
       Scanner sc=new Scanner(System.in);
       System.out.println("what is your name");
       name=sc.nextLine();
       System.out.println("enter index");
       int mayur=sc.nextInt();
       inputData=name.charAt(mayur);
       System.out.println("Your name is:"+name);
        System.out.println(" Index  "+ mayur +" is "+inputData);
    }

}
/*    
wap to create traffic highter/indicator which show u about spped of
 the vehcile based on input given by users

*/