//https://leetcode.com/submissions/detail/834852768/
//Runtime: 103 ms, faster than 38.96% of JavaScript online submissions for Sort Colors.
//Memory Usage: 43.7 MB, less than 6.70% of JavaScript online submissions for Sort Colors.
var sortColors = function(nums) {
  let n = nums.length;
  let swapped = true;
  do{
      swapped = false;
      for(let i = 0 ; i < n; i++){
          if(nums[i] > nums[i + 1]){
               [nums[i],nums[i + 1]] = [nums[i+ 1],nums[i]]
              swapped = true;
          }
      }
  }while(swapped);

};

//Runtime: 105 ms, faster than 28.73% of JavaScript online submissions for Sort Colors.
//Memory Usage: 42.2 MB, less than 51.11% of JavaScript online submissions for Sort Colors.
//https://leetcode.com/submissions/detail/810587282/
var sortColors = function(nums) {
  let n = nums.length;
  let swapped = true;
  do{
      swapped = false;
      for(let i = 0 ; i < n; i++){
          if(nums[i] > nums[i + 1]){
              let aux = nums[i];
              nums[i] = nums[i + 1];
              nums[i + 1] = aux;
              swapped = true;
          }
      }
  }while(swapped);
};
