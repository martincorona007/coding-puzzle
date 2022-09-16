//Runtime: 112 ms, faster than 26.60% of JavaScript online submissions for Count Negative Numbers in a Sorted Matrix.
//Memory Usage: 44.4 MB, less than 30.38% of JavaScript online submissions for Count Negative Numbers in a Sorted Matrix.
/**
 * @param {number[][]} grid
 * @return {number}
 */
 var countNegatives = function(grid) {
  let sum = 0;
  for(let i = 0 ; i < grid.length; i++){
      for(let j = 0 ; j < grid[i].length; j++){
          (grid[i][j] < 0)? sum += 1 : 0;
      }
  }
  return sum;
};