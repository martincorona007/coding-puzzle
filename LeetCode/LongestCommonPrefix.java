// Time complexity:O(n*n)
// Space complexity:O(1)
class LongestCommonPrefix{
  public static String longestCommonPrefix(String[] strs) {
      if(strs.length == 0 ) return "";
      String prefix = strs[0];
      
      for(int i = 1; i < strs.length;i++){
        while(strs[i].indexOf(prefix)!= 0){
          prefix = prefix.substring(0,prefix.length() - 1);
          if(prefix.isEmpty()) return "";
        }
      }

      return prefix;
  }

  public static void main(String []args){
    LongestCommonPrefix sol = new LongestCommonPrefix();
    //Test Case 1
    String[] test1 ={""};
    System.out.println("Test case 1: "+sol.longestCommonPrefix(test1));

    //Test Case 2
    String[] test2 ={"flower","flow","flight"};
    System.out.println("Test case 2: "+sol.longestCommonPrefix(test2));

    //Test Case 3
    String[] test3 ={"dog","racecar","car"};
    System.out.println("Test case 3: "+sol.longestCommonPrefix(test3));
    //Test Case 4
    String[] test4 ={"abc", "ab", "abcd"};
    System.out.println("Test case 4: "+sol.longestCommonPrefix(test4));
   //Test Case 5
    String[] test5 ={"interstellar", "internet", "internal"};
    System.out.println("Test case 5: "+sol.longestCommonPrefix(test5));

  }
}