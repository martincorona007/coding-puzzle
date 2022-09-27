//https://leetcode.com/problems/find-target-indices-after-sorting-array/

//Runtime: 97 ms, faster than 63.80% of JavaScript online submissions for Find Target Indices After Sorting Array.
//Memory Usage: 43.3 MB, less than 80.37% of JavaScript online submissions for Find Target Indices After Sorting Array.
//https://leetcode.com/submissions/detail/809447552/
var targetIndices = function(nums, target) {
  let listIndex = [];
  nums.sort((a,b)=> a - b).forEach((element,index)=>{
      if(element == target){
          listIndex.push(index);
      }
  })
  return  listIndex ;
};

//Runtime: 115 ms, faster than 29.74% of JavaScript online submissions for Find Target Indices After Sorting Array.
//Memory Usage: 47.9 MB, less than 5.02% of JavaScript online submissions for Find Target Indices After Sorting Array.
//https://leetcode.com/submissions/detail/809230159/
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 var targetIndices = function(nums, target) {
  nums.sort((a,b)=> a - b)
  let listIndex = [];
  nums.forEach((element,index)=>{
      if(element == target){
          listIndex.push(index);
      }
  })
  return (listIndex.length == 0)? [] : listIndex ;
};