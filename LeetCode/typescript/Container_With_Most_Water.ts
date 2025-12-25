//Runtime 89 ms Beats 68.12% Memory 51.5 MB Beats 43.80%
//Time Complexity: O(n)
//Space Complexity: O(1)
function maxArea(height: number[]): number {
  let maxArea = 0;
  let left = 0;
  let right = height.length -1;//select last index from the array

  while(left < right){
      let heightt = height[left] > height[right]? height[right] : height[left];//get the lowest value
      let width = right - left;//get the distance between left and right 
      let area = heightt * width;//formula
      maxArea =maxArea < area? area : maxArea;//compare max value from the previous one
      if(height[left] <= height[right]){//compare arrays' value and move left and right 
          left++;
      }else{
          right--;
      }
//       console.log(" L ",left," R ",right," w ",width," a ",area,"h ",heightt," ma ",maxArea);
  }
  return maxArea;
};


//Time Complexity: O(n^2)
//Space Complexity: O(1)

//When the array of heights is short it works, otherwise throw Time Out Exceeded
// 56 / 61 testcases passed
function maxArea(height: number[]): number {
  let maxArea = 0;
  for(let i = 0; i < height.length; i++){
      for(let j = i + 1; j < height.length; j++){
          let heightt = (height[i] < height[j])? height[i] : height[j];
          let width = j - i;
          let area = heightt * width;
          maxArea = (maxArea < area)? area : maxArea;
      }
  }
  return maxArea;
};