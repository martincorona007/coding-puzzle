//https://leetcode.com/submissions/detail/794355736/
//https://leetcode.com/problems/search-insert-position/
//Runtime: 69 ms, faster than 84.52% of JavaScript online submissions for Search Insert Position.
//Memory Usage: 42.1 MB, less than 73.57% of JavaScript online submissions for Search Insert Position.
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
 var searchInsert = function(nums, target) {
    
  for(let i = 0 ; i < nums.length; i++){
      if(nums[i]>=target) return i;
  }
  return nums.length;
};