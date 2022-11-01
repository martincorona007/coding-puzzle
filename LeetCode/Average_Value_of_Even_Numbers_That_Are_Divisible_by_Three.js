//Runtime: 118 ms, faster than 100.00% of JavaScript online submissions for Average Value of Even Numbers That Are Divisible by Three.
//Memory Usage: 42.5 MB, less than 100.00% of JavaScript online submissions for Average Value of Even Numbers That Are Divisible by Three.
var averageValue = function(nums) {
  let times = 0;
  let sumNumbers = 0;
  let result = 0;
  nums.forEach((element)=>{
      if(element% 2 == 0 && element % 3 == 0){
          sumNumbers +=element;
          times++;
      }
  })
  result = sumNumbers / times;
  //console.log("LL ",isNaN(result))
  //console.log("LL ",result)
  return (isNaN(result))? 0 : Math.floor(result) ;
  
};
//Runtime: 177 ms
//Memory Usage: 47.1 MB
var averageValue = function(nums) {
  let dN = [];
  let allNumbers = 0;
  for(let i = 0; i < nums.length; i++){
      if(nums[i]% 2 == 0 && nums[i]% 3 == 0){
          dN.push(nums[i]);
      }
      
  }
  for(let i = 0; i < dN.length; i++){
      
      allNumbers+= dN[i];
      
  }
  console.log("A ",dN);
  let result = allNumbers / dN.length;
  console.log("LL ",isNaN(result))
  console.log("LL ",result)
  return (isNaN(result))? 0 : Math.floor(result) ;
  
};