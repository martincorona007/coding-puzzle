//https://leetcode.com/submissions/detail/674790761/
//https://leetcode.com/problems/max-consecutive-ones/
//Runtime: 64 ms, faster than 97.22% of JavaScript online submissions for Max Consecutive Ones.
//Memory Usage: 44.9 MB, less than 35.94% of JavaScript online submissions for Max Consecutive Ones.
/**
 * @param {number[]} nums
 * @return {number}
 */
 var findMaxConsecutiveOnes = function(nums) {
  let aux=0;
  let maxOnes = 0;
  for(let i = 0 ; i < nums.length;i++){
      //console.log("o ",nums.length);
      switch(nums[i]){
              case 0:
                  maxOnes = 0;
                 // console.log("N  "+i+" nums["+nums[i] +"] aux "+aux+" maxOnes "+maxOnes);
                  break;
              case 1:
                  maxOnes++;
                  maxOnes > aux ? aux = maxOnes: 0 ;
                  //console.log("Y "+i+" nums["+nums[i] +"] aux "+aux+" maxOnes "+maxOnes);
                  break;
      }
  }
  return aux;
};