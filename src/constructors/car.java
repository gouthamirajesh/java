package constructors;

//Create a Car Class
//        Attributes: make (String), model (String), year (int), and mileage (double).
//        Constructor: Initialize all attributes.
//        Methods:
//        drive(double miles): Add the miles to the mileage.
//        getCarDetails(): Return a string with the car's details.

public class car
{
    String make;
    String model;
    int year;
    double milage;

    car(String m,String mo,int i,double k)
    {
        make=m;
        model=mo;
        year=i;
        milage=k;

    }

    public void drive(double miles){
             milage +=miles;
        System.out.println(milage);

    }

    public  String getCarDetails(){

        return "car make"+make+"car model" +model+"car year"+year+"car milage"+milage;
    }

    public static void main(String[] args) {
         car test=new car("audi","q7",2019,15000);
         test.drive(500);
         test.getCarDetails();
        System.out.println(test.getCarDetails());


    }
}
