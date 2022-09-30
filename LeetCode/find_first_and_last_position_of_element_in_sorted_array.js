//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

//Runtime: 61 ms, faster than 96.49% of JavaScript online submissions for Find First and Last Position of Element in Sorted Array.
//Memory Usage: 42 MB, less than 98.27% of JavaScript online submissions for Find First and Last Position of Element in Sorted Array.
//https://leetcode.com/submissions/detail/812104599/
var searchRange = function(nums, target) {
  let arrayIndex = [];
  let aux1 = 1;//flag to find first position
  let aux2 = 0;//flag to find last position
  let left = 0; 
  let right = nums.length - 1;
  let middle = 0;
  
  while(left <= right){
      middle = Math.floor((left + right)/2)
      if(nums[middle] == target && nums[middle - 1 ] != target && aux1 == 1){//find first position
          aux1 = 0;
          aux2 = 1;
          left = middle;
          right = nums.length - 1;
          arrayIndex.push(middle);
          middle = right;
      }
      if(nums[middle] == target && nums[middle + 1 ] != target && aux2 == 1){//find last position
          aux2 = 0;
          left = middle + 1;
          right = 0;
          arrayIndex.push(middle);
      }
      if(aux1 == 1){
          if(nums[middle] < target ){
              left = middle + 1;
          }else{
              right = middle - 1;
          }
      }
      if(aux2 == 1){
          if(nums[middle] > target ){
              right = middle - 1;
          }else{
              left = middle + 1;
          }
      }
   }
  return (arrayIndex.length)? arrayIndex : [-1,-1];  
};