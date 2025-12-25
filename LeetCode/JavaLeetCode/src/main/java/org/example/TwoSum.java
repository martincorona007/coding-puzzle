package org.example;


import java.util.HashMap;

class TwoSum {
// Time Complexity: O(n)
// Space Complexity: O(1)
    public int[] twoSumV1(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i = 0; i < nums.length;i++){
             if(map.containsKey(nums[i])){
                index[0] = map.get(nums[i]);
                index[1] = i;
                return index;
            }
            int numberTwoFind = target - nums[i];
            map.put(numberTwoFind,i);
        }
       // System.out.println(map);
    return null;
    }
    //Time Complexity: O(n^2)
// Space Complexity: O(1)
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int aux = 1;
        int arrayLength = nums.length;
        System.out.println("N "+arrayLength);

        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1; j < nums.length;j++){
                if(nums[j]== target - nums[i]){
                    result[0] = i;
                    result[1] = j;

                    return result;

                }
            }
            System.out.println("N "+nums[i]);
        }
        return result;
    }
}
