import java.util.Scanner;
class Mobile {
    String brand;
    int battery;
    Scanner sc = new Scanner(System.in);

    public void accept(){
        System.out.println("enter brand and battery");
        brand = sc.next();
        battery = sc.nextInt();
    }

    public void makeCall(){
    System.out.println("Making a call");
    }

    public void showDetails(){
        System.out.println("brand is"+brand);
        System.out.println("battery is "+battery);
    }
}

class smartPhone extends Mobile{
    public void takePhoto(){
        System.out.println("Taking photo using Camera!!!!");
    }
}

public class Mobile1{
    public static void main(String[] args) {
        
        smartPhone smt = new smartPhone();
        smt.accept();
        smt.showDetails();
        smt.takePhoto();
     
}
}