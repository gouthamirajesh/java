//A scholl has following rules for grdaing
// a)below 25 fail
//b) 25 to below 45 E
//c)45 to below 50 D
//d) 50 to below 60 c
//e) 60 to  below 80 b
//f)above 80 A
// Take a parametrized method which takes marks as input and print the correscponding grade

package controllstatements;

public class classB {

    public void meth(int marks){

        if (marks<25){

            System.out.println("you are failed ");
        }

        if (marks<=25 || marks<45){
            System.out.println("you got E grade ");
        }

        if (marks<=45 || marks<50){

            System.out.println("you got D grade");
        }

        if (marks<=50 || marks<60){
            System.out.println("c grade");
        }

        else if (marks <=60 || marks<80){
            System.out.println("B grade");
        }

        else {
            System.out.println("you got A grade");
        }
    }

    public static void main(String[] args) {

        new classB().meth(56);

    }
}
