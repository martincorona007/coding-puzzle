// Time complexity:O(n*n)
// Space complexity:O(1)
package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new  ArrayList();
        Map<Integer,Integer> list = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(list.containsKey(nums[i])){
                list.put(nums[i],list.get(nums[i])+1);
            }else{
                list.put(nums[i],1);
            }    
        }
        for(Map.Entry<Integer,Integer> entry: list.entrySet()){
            System.out.println(" K "+entry.getKey()+" "+entry.getValue());

            if(entry.getValue()>1){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
