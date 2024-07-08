package pack2;
//
////Task 2: Create a BankAccount Class
////        Attributes: accountNumber (String), balance (double), and accountHolder (Person).
////        Constructor: Initialize all attributes.
////        Methods:
////        deposit(double amount): Add the amount to the balance.
////        withdraw(double amount): Subtract the amount from the balance, if sufficient funds are available.
////        getBalance(): Return the current balance.
////        getAccountDetails(): Return a string with the account details and account holder's details.
//
public class bankAccount {

    String accountNumber;
    double balance;
    String person;


    public bankAccount(String s,double d,String p ){
              accountNumber=s;
              balance=d;
              person=p;
    }

    public void deposit(double q){
        balance +=q;

        System.out.println(balance);

    }

    public  void withdraw(double e){

        balance -= e;
        System.out.println(balance);

    }

    public  void getBalance(){
        System.out.println(balance);

    }

    public String getAccountDetails(){
        System.out.println();
        return accountNumber +balance +person ;
    }

    public static void main(String[] args) {
         bankAccount aobj1=new bankAccount("11003170",1000,"rajesh");
         aobj1.deposit(1000);
         aobj1.withdraw(500);
         aobj1.getBalance();
        System.out.println(aobj1.getAccountDetails());



    }
}


//public class bankAccount {
//
//    String accountNumber;
//    double balance;
//    String person;
//
//
//    public bankAccount(String s,double d,String p ){
//        accountNumber=s;
//        balance=d;
//        person=p;
//    }
//
//    public void deposit(double q){
//        balance += q;  // Update balance with deposit amount
//        System.out.println("New balance after deposit: $" + balance);
//    }
//
//    public  void withdraw(double e){
//        if (balance >= e) {  // Check if sufficient balance before withdrawal
//            balance -= e;  // Update balance with withdrawal amount
//            System.out.println("New balance after withdrawal: $" + balance);
//        } else {
//            System.out.println("Insufficient funds for withdrawal.");
//        }
//    }
//
//    public  void getBalance(){
//        System.out.println("Current balance: $" + balance);
//    }
//
//    public String getAccountDetails(){
//        System.out.println();
//        return accountNumber + balance + person ;
//    }
//
//    public static void main(String[] args) {
//        bankAccount aobj1=new bankAccount("11003170",1000,"rajesh");
//        aobj1.deposit(1000);
//        aobj1.withdraw(500);
//        aobj1.getBalance();
//        System.out.println(aobj1.getAccountDetails());
//    }
//}