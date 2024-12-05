//  A student will not allowed to sit in exam if his attendence is less than 75 percent
// Take a parametrized method which allows
// . no of classes held
//. no of classes attended
// And print the percentage of class attendence if the student allowed to sit in exma or not

package controllstatements;

public class classD {


    public void meth(double noch,double noca){

        double percentageOfClassAttendence=(noca/noch)*100;

        if (percentageOfClassAttendence>75){

            System.out.println(percentageOfClassAttendence);

        }

        else{
            System.out.println("you are not allowed for the exam");
            System.out.println(percentageOfClassAttendence);

        }

    }

    public static void main(String[] args) {

        new classD().meth(20,19);

    }
}
