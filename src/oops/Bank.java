//Create a class named Student that has the following private fields:
//
//        studentID (int)
//        studentName (String)
//        gpa (double)
//        Write public methods to:
//
//        Set and get the studentID.
//        Set and get the studentName.
//        Provide a getter for gpa and a setter for modifying it. Ensure the GPA is in the range of 0.0 to 4.0, otherwise reject the update.
//        Write a method to print the student’s details.


package oops;

public class Bank
{
    private int studentID;
    private String studentName;
    private double gpa;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        if(gpa>=0.0 && gpa<=4.0){

        }
        else {

            System.out.println("invalid GPA value ");
        }

        this.gpa = gpa;




    }

    public static void main(String[] args)
    {

        //set and get the student id

         Bank aobj=new Bank();
         aobj.setStudentID(1);
         aobj.setStudentName("rajesh");
         aobj.setGpa(4.4);



        System.out.println("Student details ");
        System.out.println(aobj.getStudentID());
        System.out.println(aobj.getStudentName());
        System.out.println(aobj.getGpa());

    }
}
