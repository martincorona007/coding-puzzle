public class Dog{
  private String name;
  private String color;
  public Dog(String name, String color){
    this.name = name;
    this.color = color;
  }
  public String getName(){
    return name;
  }
  public String getColor(){
    return color;
  }
  public static void main(String[]args){
    Dog obj = new Dog("Scoobe","brown");
    System.out.println(""+obj.getName()+" "+obj.getColor());
  }
}