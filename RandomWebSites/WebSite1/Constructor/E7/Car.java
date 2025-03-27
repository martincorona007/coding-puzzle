public class Car{
  private String model;
  private int year;
  private String make;
 // almost
  // public Car(){
  //   this.model = "unknown";
  //   this.year = "0000";
  //   this.make = "0000";
  // }
  // public Car(String model,int year,String make){
  //   this.model = "unknown";
  //   this.year = "0000";
  //   this.make = "0000";
  // }
  public Car(String model, String make, int year){
    this.model = (model == null || model.isEmpty())? "Unknown": model ;
    this.make = (make == null || make.isEmpty())?"Unknown" : make ;
    this.year = ( year <= 1000 )? 0 :year;
  }
  public static void main(String[]args){
      Car obj = new Car("","",0);
      Car obj1 = new Car("RAM","Skynet",2050);
  }
}