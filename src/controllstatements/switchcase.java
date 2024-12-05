package controllstatements;

public class switchcase {



    public void meth(String day){

        int a=200;
        int b=57;
        final int x=10;
        int age=35;

        switch (a-135-b){ //8

            case x:
                System.out.println("case 10 executed");
                switch (day){

                    case "wednesday":
                        System.out.println("today we are dealing switch");
                        break;

                    case "thursday":
                        System.out.println("today we will deal with switch program");
                        break;
                }
                break;

            case 200:
                System.out.println("case 200 executed");
                break;
            case 'A':
                System.out.println("int and char are compatable");
                break;

//            case 40/5:
//
//                System.out.println("case 40 is executed");
//
//                if(age>=18){
//                    System.out.println("you are eligible to vote");
//                }
//                else{
//                    System.out.println("not vote");
//                }
//
//                break;

            case 50:
                System.out.println("50 executed");
                break;
//            case  8:
//                System.out.println("matched");

            default:
                System.out.println("default case got executed");
                break;



        }
    }



    public static void main(String[] args) {
        new switchcase().meth("wednesday");

    }
}
