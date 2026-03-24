/*WAp to display salary of a [person]
Accept basic salary 
12% of basic salary 
10% HRA of basic salary
12% DA of basic salary
calculTE net salary */


import java.util.*;
 class SalCal {
  public static void main(String args[])
  {
   double bSalary,hra,da,pf,netSal;
   Scanner vedantScanner=new Scanner(System.in);
   System.out.println("Enter the basic salary: ");
   bSalary=vedantScanner.nextDouble();

   pf=bSalary*0.12;
   System.out.println("THE PF IS CALCULATED IS "+pf);
   hra=bSalary*0.10;
  System.out.println("THE HRA IS CALCULATED IS "+hra);
  da=bSalary*0.12;
  System.out.println("THE DA IS CALCULATED IS "+da);

  netSal=(bSalary+hra+da)-pf;
  System.out.println("------------Your salary slip----------");
  System.out.println();
  System.out.println("Your basic salary"+bSalary);
  System.out.println("Your HRA is "+hra);
  System.out.println("Your DA is "+da);
  System.out.println("Your pf is "+pf);
  System.out.println("Your netSalary is "+netSal);

  }

}
