public class Point{

  private int pointX;
  private int pointY;

  // private double pointX;
  // private double pointY;

  public Point(int pointX,int pointY){
    this.pointX = pointX;
    this.pointY = pointY;
  }
  public Point(double pointX,double pointY){
    this.pointX = (int)pointX;
    this.pointY = (int)pointY;
  }
  public int getPointX(){
   return pointX; 
  }
  public int getPointY(){
   return pointY; 
  }
  
  public static void main(String []args){
    Point obj1 = new Point(1,1);
    System.out.println(" "+obj1.getPointX()+" "+obj1.getPointY());
    Point obj2 = new Point(12.0,12.0);
    System.out.println(" "+obj2.getPointX()+" "+obj2.getPointY());
  }
}