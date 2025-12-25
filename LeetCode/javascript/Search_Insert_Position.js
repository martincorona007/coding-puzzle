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

//Runtime: 99 ms, faster than 31.09% of JavaScript online submissions for Search Insert Position.
//Memory Usage: 42.3 MB, less than 48.98% of JavaScript online submissions for Search Insert Position.
var searchInsert = function(nums, target) {
  let right = nums.length - 1;
  let left = 0;
  let middle = 0; 
  while(left <= right){
      middle = Math.floor((left + right)/2);
      if(nums[middle]===target) return middle;
      if(nums[middle] < target) left = middle + 1;
      else right = middle - 1
  }
  console.log("out 1 ",middle);
  console.log("out 2 ",left);
  console.log("out 3 ",right);
  return left;
  
};