//Objective: Create a Car class that encapsulates the car's make, model, and year.
//        Steps:
//        Declare private fields for make, model, and year.
//        Create a constructor that initializes these fields.
//        Create getter methods for all fields, but no setters (making the class read-only).
//        Test this by creating a few Car objects and printing their values using the getters.


package oops;

public class car
{

    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    car(String make, String model, int year)

    {
        this.make=make;
        this.model=model;
        this.year=year;



    }

    public static void main(String[] args)
    {

        car object =new car("bmw","q4",1994);
        car test =new car("ford","mustang",2019);

        System.out.println(object.getMake());
        System.out.println(object.getModel());
        System.out.println(object.getYear());

        System.out.println(test.getMake());


    }
}
