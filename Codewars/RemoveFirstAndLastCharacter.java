// Time Complexity: O(n2)
// Space Complexity: O(n)
public class RemoveChars {
    public static String remove(String str) {
      String aux = "";
      
      for(int i = 1; i<str.length()-1; i++){
        aux += str.charAt(i);
      }
      
      return aux;
    }
}