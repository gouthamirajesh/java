package oops;

import java.util.Scanner;

public class classB
{

    public static void main(String[] args)
    {

        classA details=new classA();

         Scanner rajesh=new Scanner(System.in);
        System.out.println("enter Employee name");
        details.setEmployeeName(rajesh.next());
        System.out.println("enter Employee Salary ");
        details.setEmployeeSalary(rajesh.nextInt());
        System.out.println("enter Employee id");
        details.setEmployeeid(rajesh.nextInt());
        System.out.println("enter employee experience");
        details.setEmployeeExperience(rajesh.nextInt());




        System.out.println("here are the employee details ");
        System.out.println(details.getEmployeeName()) ;
        System.out.println(details.getEmployeeSalary()) ;
        System.out.println(details.getEmployeeid());
        System.out.println(details.getEmployeeExperience()) ;


    }
}
