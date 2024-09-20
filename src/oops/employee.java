//objective: Create an Employee class that encapsulates both fields and methods related to salary.
//        Steps:
//        Create private fields name, position, and salary.
//        Provide getter and setter methods for name and position, but only provide a getter for salary.
//        Create a method increaseSalary that increases the salary by a percentage.
//        Write code to test the salary increase functionality while keeping the salary field private.


package oops;

public class employee
{

    private String name;
    private  String position;
    private int salary;


    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    public void increaseSalary(int x)
    {

       int a= (x*5)/100;

       this.salary=x;






    }


    public static void main(String[] args)
    {
       new employee().increaseSalary(10000);

       employee obj=new employee();

        obj.setName("rajesh");
        obj.setPosition("ghdshs");

        System.out.println(obj.getName());
        System.out.println(obj.getPosition());
        System.out.println(obj.getSalary());



    }

}
