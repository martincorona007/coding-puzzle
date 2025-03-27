public class Singlenton{
  private static Singlenton singleInstance= null;
  //prevent instatiation
  private Singlenton(){
    System.out.println("Instance created");
  }
  public static Singlenton getInstance(){
    if(singleInstance == null){
      singleInstance = new Singlenton();
    }
    return singleInstance;
  }
  public static void main(String[] args){
    Singlenton instance1 = new Singlenton();
    Singlenton instance2 = new Singlenton();
    if(instance1 == instance2){
      System.out.println("Same");
    }else{
      System.out.println("diff");
    }
  }
}
// public class Singlenton{
//   private Singlenton instance;
//   private Singlenton(){

//   }
//   public getInstance(){
//     return this.instance;
//   }
// }