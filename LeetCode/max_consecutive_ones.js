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