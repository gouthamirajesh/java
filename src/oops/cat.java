package oops;

public class cat extends Animal
{

    public void makeSound(){

        System.out.println("bark");
    }

    public static void main(String[] args)
    {

        Animal test =new cat();
        test.makeSound();



    }


}
