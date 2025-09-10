//Second approach
public class Kata {
    public static boolean isUpperCase(String s) {
      for(int i = 0; i < s.length();i++){
        if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
          return false;
        }
      }
      return true;
    }
}
//First approach
public class Kata {
    public static boolean isUpperCase(String s) {
     boolean test = false;
      for(int i = 0; i < s.length();i++){
        System.out.println("-> "+s.charAt(i));
        int asciiValue = (int)s.charAt(i);
        
        if((asciiValue>=65 && asciiValue<=90) || asciiValue ==32|| asciiValue ==00){
          test = true;
        }else{
          
          test = false;
          break;
        }
      }
      System.out.print(" -> "+test);
      
      return test;
    }
}