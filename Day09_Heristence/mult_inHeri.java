
/*implement multi 
take 3 clases 
rectangle[to acceot data] class compute[calculation] class result[to print op of rectangle] */


import java.util.*;

class rectangle{
    int l,b;
    public void accept(){
        
       Scanner sc= new Scanner(System.in);
     System.out.println("Enter length and breadth");
     l=sc.nextInt();
     b=sc.nextInt();

    }
}
class compute extends rectangle{
    int result;
    public void calculate(){
         result=l*b;
    }
    
}
class result extends compute{
    public void output(){
        System.out.println("result is :"+result);
    }
}




public class mult_inHeri {
    public static void main(String[] args) {
        result ob=new result();
        ob.accept();
        ob.calculate();
        ob.output();
    }
    
}
