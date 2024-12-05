package scannerClass;


import java.util.Scanner;

public class employeeDetails
{

    Scanner k=new Scanner(System.in);

    public void meth()
    {
        System.out.println("employe name");

        String s= k.nextLine();


        System.out.println("employee id");

        int a=k.nextInt();


        System.out.println("dept");

        String d= k.next();


        System.out.println("address");
        k.nextLine();

        String ad=k.next();

    }

    public static void main(String[] args) {

        new employeeDetails().meth();

    }
}
