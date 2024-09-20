//WAP ask the user to take emp name, emp salary ,emp id and emp experience if the employe is having experience less than or equal to 5 years we need to increase the salary the 10 percent
// if the exp is more than 5 increase the salary by 30 percent

package oops;

public class classA
{

   private String employeeName;
   private int employeeSalary;
   private int employeeid;
   private  int employeeExperience;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {

        if(employeeExperience<=5)
        {
            int a=(employeeSalary*10)/100;
            employeeSalary=employeeSalary+a;


        }

        else {
            int b=(employeeSalary*30)/100;

         employeeSalary=employeeSalary+b;
        }

        return employeeSalary;

    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getEmployeeExperience() {
        return employeeExperience;
    }

    public void setEmployeeExperience(int employeeExperience) {
        this.employeeExperience = employeeExperience;
    }











}
