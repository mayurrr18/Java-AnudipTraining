class Car {
    String brand;
    String model;
    int year;
    void displaydetails()
    {
        System.out.println("Brand:="+brand);
        System.out.println("Model:="+model);
        System.out.println("Year:="+year);
    }
}
public class carobj{
    public static void main(String[] args) {
        Car car1=new Car();
        car1.brand="Toyota";
        car1.model="innova";
        car1.year=2022;

        Car car2=new Car();
        car2.brand="suzuki";
        car2.model="Alto";
        car2.year=1999;

        car1.displaydetails();
        car2.displaydetails();
    }
    
}
