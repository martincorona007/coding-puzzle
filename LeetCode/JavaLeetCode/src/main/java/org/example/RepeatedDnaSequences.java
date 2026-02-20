package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> repeated = new ArrayList<>();
        Map<String,Integer> sequences = new HashMap<>();
        int right;
        if(s.length() < 10){
            return repeated;
        }else {
            right = 10;
        }
        int left = 0;
        while(right != s.length()+1){
            //   System.out.println(s.substring(left,right));
            //  System.out.println(" "+left+" "+right);
            //System.out.println(left + " -> " + s.substring(left, right));
            if(sequences.containsKey(s.substring(left,right))){
                sequences.put(s.substring(left,right),sequences.get(s.substring(left,right))+1);
            }else{
                sequences.put(s.substring(left,right),1);
            }

            left++;
            right++;
        }
        for(Map.Entry<String,Integer> it: sequences.entrySet()){
            if(it.getValue() > 1){
                repeated.add(it.getKey());
            }
        }

        return repeated;
    }
}
