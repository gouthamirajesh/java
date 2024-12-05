package typeCasting;

public class implecit {

    byte b=127;
    int i=b;

    implecit(){

        System.out.println("implicit type casting");
        System.out.println(b);
        System.out.println(i);

        long l=500L;
        float f=l;
        System.out.println(l);
        System.out.println(f);
    }



    public static void main(String[] args) {

        new implecit();

    }
}
