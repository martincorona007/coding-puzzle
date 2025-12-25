//Runtime: 223 ms, faster than 100.00% of JavaScript online submissions for Find the Pivot Integer.
//Memory Usage: 42.5 MB, less than 100.00% of JavaScript online submissions for Find the Pivot Integer.
 var pivotInteger = function(n) {
  let left = 0;
  let right = 0;
  let aux =0;
  for(let i = 0; i <= n; i++ ){
      left +=i;
      for(let j = i; j <=n;j++){
          right += j
          if(j ===n){
              aux = right;
              right = 0;
          }
      }
      if(left === aux){
          return i
      }
      if(i === n){
          return -1;
      }
  }
};