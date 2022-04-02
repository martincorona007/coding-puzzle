#
#
#
#

class Solution {
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