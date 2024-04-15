public class Troll {
    public static String disemvowel(String str) {

        String newString = "";
      for(int i = 0; i < str.length();i++){
          switch(str.charAt(i)){
            case 'a':break;
            case 'e':break;
            case 'i':break;
            case 'o':break;
            case 'u':break;
            case 'A':break;
            case 'E':break;
            case 'I':break;
            case 'O':break;
            case 'U':break;
                
            default:
              newString+= str.charAt(i);
          }
      }
      System.out.println("=> "+newString);
      return newString;
      
    }
}