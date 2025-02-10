public class Book{
  private String tittle;
  private String author;
  private double price;

  public Book(){
     this.tittle = "Unknown";
    this.author = "Unknown";
    this.price = 0.0;
  }

  public Book(String tittle, String author){
    this.tittle = tittle;
    this.author = author;
  }
  public Book(String tittle, String author,double price){
    this.tittle = tittle;
    this.author = author;
    this.price = price;
  }
  
  public String getTittle(){
    return tittle;
  }
  public String getAuthor(){
    return author;
  }
  public double getPrice(){
    return price;
  }
  public static void main(String []args){
    Book obj0 = new Book("Food","Bob");
    
    System.out.println(" "+obj0.getTittle()+" "+obj0.getAuthor());
    
    Book obj1 = new Book("Why is why?","Simon");
    
    System.out.println(" "+obj1.getTittle()+" "+obj1.getAuthor());

    Book obj2 = new Book("witches","Voldemort",323);
    
    System.out.println(" "+obj2.getTittle()+" "+obj2.getAuthor()+" "+obj2.getPrice());
  }
}