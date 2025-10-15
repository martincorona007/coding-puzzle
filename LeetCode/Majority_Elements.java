class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> element = new HashMap<>();
        
        for(int i = 0; i < nums.length; i ++){
            if(element.containsKey(nums[i])){
                    element.put(nums[i],element.get(nums[i])+1);
            }else{
                element.put(nums[i],1);
            }
        }
        int maxValue  = 0;
        int result = 0;
        for(HashMap.Entry<Integer,Integer> iter : element.entrySet()){
            if(iter.getValue() > maxValue){
                maxValue = iter.getValue();
                result = iter.getKey();
            }
        }
        return result;
    }
}