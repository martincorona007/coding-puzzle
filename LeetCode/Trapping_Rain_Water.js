var trap = function(height) {
  
  let left = 0;
  let right = height.length - 1;
  let maxLeft = 0;
  let maxRight = 0;
  let waterUnit = 0;
  let it = 0;
  while(left < right){
    //console.log(" it ",it,{left,right}, " ",height[left]," ",height[right]," LM ",maxLeft," RM ",maxRight," RS ",waterUnit);
    if(height[left] <= height[right]){
      if(height[left] >= maxLeft){
        maxLeft = height[left];
      }else{
        waterUnit += maxLeft - height[left];
      }
      left++;
    }else{
      if(height[right] >= maxRight){
        maxRight = height[right];
      }else{
        waterUnit += maxRight - height[right];
      }
      right--;
    }
    it++;
  }
  return waterUnit;
};
//console.log(trap([0,1,0,2,1,0,1,3,2,1,2,1]));