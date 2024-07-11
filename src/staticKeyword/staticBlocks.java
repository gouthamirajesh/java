package staticKeyword;

//Task 3: Static Blocks
//        Create a class DatabaseConfig with a static block to initialize some configuration settings. Print these settings in the main method.
//
//        Steps:
//        Define a class DatabaseConfig.
//        Use a static block to initialize static variables like url, username, and password.
//        Create a static method printConfig to print these settings.
//        In the main method, call printConfig without creating an object of DatabaseConfig

 class databaseConfig {

    static  String url;
    static  String username;
    static  String password;

    static{

        url="rajesh";
        username="ra";
        password="ma";


    }

  static   public void printConfig(){

      System.out.println(url + "    "+username + "   "+password);

    }


    public static void main(String[] args) {

        databaseConfig.printConfig();

    }


}
