package constructors;

//Task 3: Create a Book Class
//        Attributes: title (String), author (String), price (double), and stock (int).
//        Constructor: Initialize all attributes.
//        Methods:
//        sellBook(): Decrease stock by one, if stock is greater than zero.
//        restock(int amount): Increase stock by the specified amount.
//        getBookInfo(): Return a string with the book's details.

public class book
{
   String title;
   String author;
   double price;
   int stock;

   book(String btitle,String bauthor,double bprice,int bstock)
   {
       title=btitle;
       author=bauthor;
       price=bprice;
       stock=bstock;
   }
   void  sellbook()
   {
       if (stock>0)

           System.out.println("Decrease stock by one is: "+ --stock);
       else
           System.out.println(stock);
   }
   void restock(int amount)
   {
       stock += amount;
       System.out.println("Increased stock: "+(stock));
   }
   String getbookinfo()
   {
       return "title:" + title + " " + "Author:" + author + " " + "Price:" + price + " " + "Stock:" + stock;
   }

    public static void main(String[] args)
    {
       book obj=new book("Dream","Gou",20.0,5);
       obj.sellbook();
       obj.restock(5);
        System.out.println(obj.getbookinfo());
    }
}
