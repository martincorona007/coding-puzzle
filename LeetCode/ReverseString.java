// Time Complexity: O(n)
// Space Complexity: O(1)
class ReverseString {
    public static void reverseString(char[] s) {
        
        int left = 0;
        int right = s.length - 1 ;
        while(left < right){
          
          char aux = s[left];
          s[left] = s[right];
          s[right] = aux;
          left++;
          right--;
        }
       // return new String(s);//this make S.C O(n)

        //Solution 1 - Alternative first approach
        // char[] word=new char[s.length];
        // for(int i = s.length-1;i >= 0;i--){
        //     word[i] = s[i];
        // }
    }
    public static void testReverse(char[] word,String testName){
      System.out.println(testName+" : ");
      System.out.println("Before : "+new String(word));
      reverseString(word);
      System.out.println("After : "+new String(word));
      
      
    }
    public static void main(String []args){
      // Test case 1
      char word1[] = {'H','e','l','l','o'};
      testReverse(word1,"Test case 1 - Hello");
      // Test case 2
      char word2[] = {'H','a','n','n','a','h'};
      testReverse(word2,"Test case 2 - Hannah");
    }
}