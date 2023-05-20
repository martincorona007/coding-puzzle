import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int n = A.length() -1;
        int right =  n;
        boolean flag = true;//control the flow when it not palindrome
        for(int left = 0 ; left <= n; left++){
            if(A.charAt(left) == A.charAt(right) &&  n/2 == left){    
              // n/2 = divide the word in half and verify the length is equal to iterator variables either left or right we can use.
              // e.g. aabbbbaa the half is [aabb][bbaa] the length of both sides is 4 therefore we can compare to left or right optional.
              //              
                    System.out.println("Yes");
                    flag = false;
                    break;
            }
            right--;   
            
            
        }
        if(flag == true){
            System.out.print("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

