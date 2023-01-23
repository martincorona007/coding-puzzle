// Time Complexity: O(n^2)
// Space Complexity: O(1)

var differenceOfSum = function(nums) {
  let x = 0;
  let y = 0;
  nums.forEach((element,index)=>{
      x += element;
      if(element >= 10){
          while(element > 0){
              y += Math.floor(element%10);
              element/=10;
          }
      }
      y += element
  })
  return x - y

};