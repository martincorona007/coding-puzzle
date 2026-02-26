package org.example;

public class LongestPalindromicSubstring {

    // TC. O(n^3) SC O(n^2)
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        String longest = "";
        while (right <=s.length()){
            // System.out.println("T1 "+s.substring(left,right)+" "+left+" "+right);
            if (isPalindrome(s.substring(left,right))){
                // System.out.println("T2 "+s.substring(left,right));
                String aux = s.substring(left,right);
                longest = aux.length() > longest.length()? aux: longest;
            }
            if(right == s.length()){
                left++;
                right = left;
            }
            right++;
        }

        return longest;
    }
    public boolean isPalindrome(String s){
        int right = s.length()-1;
        for(int left = 0; left < s.length();left++){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            right--;
        }
        return true;
    }

    /*
        babad

        ba
        bab []
        baba
        babad
        ab
        aba []
        abad
        ba
        bad
        ad

        cbbd
        cb
        cbb
        cbbd
        bb []
        bbd
        bd

        */
}
