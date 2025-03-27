public class Cat{
  private String name;
  private int age;

  public Cat(){
    this.name = "Unkown";
    this.age = 0;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public static void main(String[]args){
    Cat obj =  new Cat();
    System.out.println(" "+obj.getName()+" "+obj.getAge());
  }
}

