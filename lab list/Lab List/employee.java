


/**
 * Enters Employee details like name, basic salary and calculates gross and net salary
 *
 * @author (Kishan)
 * @version (01/10/2020)
 */ 
import java.util.*;
class employee
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Employee name");
        String name=sc.nextLine();
        System.out.println("ENter Employee ID number");
        int id=sc.nextInt();
        System.out.println("Enter Employee's Basic Salary");
        int sal=sc.nextInt();
        double cca,da,hra,pf,gp=0.00,np=0.00,pt,ded;
            da=0.50*sal;
            hra=0.25*sal;
            cca=240;
            pf=0.1*sal;
            cca=240;
            pt=100;
            gp=sal+da+hra+cca;
            ded=pf+pt;
            np=gp-ded;
        System.out.println("Name of the employee"+name);
        System.out.println("Basic Salary"+sal);
        System.out.println("Gross salary"+gp);
        System.out.println("Deuction"+ded);
        System.out.println("Net  Salary"+np);
        
  }

}