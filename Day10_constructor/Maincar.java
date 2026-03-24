class Car {
    String  carName;
    int price;
    String custumerName;
    Car(String cname,int p,String custName)
       {
    carName=cname;
    price=p;
    custumerName=custName;
       }

       public void display()
       {
        System.out.println("Car:"+carName);
        System.out.println("price:"+price);
        System.out.println("Custumer name:"+custumerName);
      }
    }
public class Maincar{
        public static void main(String[] args) {
         Car c1 = new Car("BMW", 50000,"Mayur");
         Car c2 = new Car("Mercedes", 9000000, "mitheel");
       
       
         c1.display();
        c2.display();
        
        }
      }


