public class ClassRoom{
  private String className;
  private String[] students;

  public ClassRoom(String className,String[] students){
    this.className = className;
    this.students = students;
  }
  public void printClasses(){
    for(String studentI : students){
      System.out.println(" "+studentI);
    }
  }
  public static void main(String []args){
    String[] alumni = {"student1","student2","student3","student4"};
    ClassRoom cls = new ClassRoom("Test",alumni);

    cls.printClasses();
  }
}