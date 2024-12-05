package oops;

public class Rectangle extends Shape
{

    public void getArea()
    {
        int length=10;
        int width=20;
        System.out.println(length*width);

    }

    public static void main(String[] args)
    {

         Shape shape=new Rectangle();
         shape.getArea();

        Shape test=new Shape();
        test.getArea();



    }

}
