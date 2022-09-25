//Problem: https://leetcode.com/problems/find-the-duplicate-number/

//Runtime: 52 ms, faster than 17.35% of Java online submissions for Find the Duplicate Number.
//Memory Usage: 90.5 MB, less than 14.00% of Java online submissions for Find the Duplicate Number.
class Solution {
    HashSet<Integer> duplicateNumber = new HashSet<Integer>();
    public int findDuplicate(int[] nums) {
        for(Integer index: nums){
            if(duplicateNumber.contains(index)){
                return index;
            }else{
                duplicateNumber.add(index);
            }
           
        }
        return -1;
    }
}

//Runtime: 1065 ms, faster than 5.11% of Java online submissions for Find the Duplicate Number.
//Memory Usage: 120 MB, less than 5.02% of Java online submissions for Find the Duplicate Number.
class Solution {
    HashMap<Integer,Integer> duplicateNumber = new HashMap<Integer,Integer>();
    public int findDuplicate(int[] nums) {
        for(Integer index: nums){
            if(duplicateNumber.get(index) == null){
                duplicateNumber.put(index,0);
            }else if(duplicateNumber.containsKey(index)){
                return index;
            }
        }
        return -1;
    }
}
