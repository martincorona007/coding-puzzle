public class Student{
  private int studentId;
  private String studentName;
  private double grade;
  public Student(){
    this(0,"unknown",0.0);
    // this.studentId = 0;
    // this.studentName = "Unknown";
    // this.grade = 0.0;
  }
  public Student(int studentId,String studentName,double grade){
    this.studentId = studentId;
    this.studentName = studentName;
    this.grade = grade;
  }
  public int getStudentId(){
    return studentId;
  }
  public String getStudentName(){
    return studentName;
  }
  public double getGrade(){
    return grade;
  }
  public static void main(String[]args){
    Student obj1 = new Student();
    System.out.println(" "+obj1.getStudentId()+" "+obj1.getStudentName()+" "+obj1.getGrade());

    Student obj2 = new Student(2,"Mark",32332);
    System.out.println(" "+obj2.getStudentId()+" "+obj2.getStudentName()+" "+obj2.getGrade());
  }
}