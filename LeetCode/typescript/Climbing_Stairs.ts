

//Runtime: 55 ms, faster than 99.38% of TypeScript online submissions for Climbing Stairs.
//Memory Usage: 43.1 MB, less than 41.64% of TypeScript online submissions for Climbing Stairs.
https://leetcode.com/submissions/detail/843553902/
function climbStairs(n: number): number {//Top-down [memoization] approach
  let cache = {};
  let climb = function(step){
      if(cache[step])return cache[step]//if the solution is stored in cache return it
      if(step == 2) return 2;
      if(step <= 1) return 1;
      cache[step] = climb(step-1) + climb(step-2);
      return cache[step]
  };
  return climb(n);
};


//Runtime: 85 ms, faster than 79.13% of TypeScript online submissions for Climbing Stairs.
//Memory Usage: 48.4 MB, less than 5.04% of TypeScript online submissions for Climbing Stairs.
https://leetcode.com/submissions/detail/843528091/
let cache = {
  '0':0,
  '1':1,
};
function climbStairs(n: number): number {//Bottom-up approach
  let cache = [1,2];
  if(n<=1) return 1;
  for(let i = 2;i < n; i++){
      cache.push(cache[i-2]+cache[i-1]);
      console.log("BU ",cache)
  }
  return cache.pop()|| 1;
};