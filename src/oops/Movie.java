//Write a Java program to create a class called Movie with private instance variables title, director, and duration.
//        Provide public getter and setter methods to access and modify these variables.
//        Add a method called getMovieDetails() that returns a formatted string containing the movie details.


package oops;

public class Movie {

    private String title;
    private  String director;
    private String duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    public String getMovieDetails()
    {




        return title+" "+director+duration;
    }


    public static void main(String[] args)
    {

         Movie aobj=new Movie();
         aobj.setTitle("movie");
         aobj.setDirector("director");
         aobj.setDuration("minutes");

        System.out.println(aobj.getMovieDetails());

    }
}
