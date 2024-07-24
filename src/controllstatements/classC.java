//A company decided to give 5% of bonus to employee
// if he/her serivice  is more than 5 yeras
// Take a parameterized method which takes users salery and year of service and print the bonus amount and the updated salary

package controllstatements;

public class classC {


    private void meth(int salary,int ys){
        int bonusamount=(salary*5)/100;
        if (ys>5){

            System.out.println(bonusamount);
            System.out.println(bonusamount+salary);
        }

        else
        {
            System.out.println("less than 4");
        }

    }


    public static void main(String[] args) {
        new classC().meth(1000,6);

    }
}
