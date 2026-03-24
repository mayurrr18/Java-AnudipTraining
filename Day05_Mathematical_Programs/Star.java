
import java.util.*;
class Cricket{
    int a;
	public void match() {
		System.out.println("Today is match");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
		
	}
    public void live() {
    	System.out.println("match is live");
    	
    }
}

public class Star {
	public static void main(String[]args) {
    Cricket ob=new Cricket();
    ob.match();

}
}