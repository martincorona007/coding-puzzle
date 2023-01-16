//https://leetcode.com/problems/increment-submatrices-by-one/submissions/879532565/
/**
 * @param {number} n
 * @param {number[][]} queries
 * @return {number[][]}
 */
var rangeAddQueries = function(n, queries) {
  var mat = Array.from(Array(n), () => new Array(n).fill(0));
  for(let [row1,col1,row2,col2] of queries){
      for(let i = row1; i <= row2;i++){
          for(let j = col1; j <= col2;j++){
              mat[i][j] += 1 
          }
      }
  }
  

  
  return mat;
};