package org.example;

import java.util.HashSet;

class SingleNumber {
//Runtime: 21 ms, faster than 22.14% of Java online submissions for Single Number.
//Memory Usage: 53.4 MB, less than 24.58% of Java online submissions for Single Number.

    HashSet<Integer> singleNumber = new HashSet<Integer>();
    public int singleNumberV1(int[] nums) {
        
        for(int i = 0; i < nums.length;i++){
           if(singleNumber.contains(nums[i])){
                singleNumber.remove(nums[i]);
            }else{
                singleNumber.add(nums[i]);
            }
        }
        for(Integer iter: singleNumber){
            return iter;
        }
        return -1;
    }

//Runtime: 41 ms, faster than 8.87% of Java online submissions for Single Number.
//Memory Usage: 53.7 MB, less than 23.31% of Java online submissions for Single Number.

    HashSet<Integer> singleNumber = new HashSet<Integer>();
    public int singleNumberV2(int[] nums) {

        for(int i = 0; i < nums.length;i++){
            if(singleNumber.size() == 0){
                singleNumber.add(nums[i]);
            }else if(singleNumber.contains(nums[i])){
                singleNumber.remove(nums[i]);
            }else{
                singleNumber.add(nums[i]);
            }
        }
        for(Integer iter: singleNumber){
            return iter;
        }
        return 0;
    }
}