//https://leetcode.com/submissions/detail/794988642/
//Runtime: 107 ms, faster than 32.33% of JavaScript online submissions for Binary Search.
//Memory Usage: 45 MB, less than 69.73% of JavaScript online submissions for Binary Search.
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
 var search = function(nums, target) {
  let left = 0;
  let right = nums.length -1; 
  let middle = 0;
  
  while(left<=right){
      middle = Math.floor((left + right)/2);
      if(nums[middle] === target) return middle;
      if(nums[middle] < target) left = middle + 1;  
      else right = middle - 1;
  }
  return -1
};