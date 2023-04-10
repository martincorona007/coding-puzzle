// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
                System.out.println("-> "+count+" "+nums[i]+" "+i);
            }
        }
        return count;
    }
}