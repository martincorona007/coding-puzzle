package org.example;

public class LengthOfLastWord {

       public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for(int i = s.length() - 1; i >= 0 ; i--){
          if(s.charAt(i)!= ' '){
            flag = true;
            count++;        
          }
          if(s.charAt(i)==' ' && flag) break;

           
        }
        return count;
    }
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        LengthOfLastWord instance = new LengthOfLastWord();
        System.out.println(instance.lengthOfLastWord(s1));
        System.out.println(instance.lengthOfLastWord(s2));
        System.out.println(instance.lengthOfLastWord(s3));
    }
}
