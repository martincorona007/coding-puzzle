//Runtime: 206 ms, faster than 18.95% of JavaScript online submissions for First Unique Character in a String.
//Memory Usage: 46.1 MB, less than 33.21% of JavaScript online submissions for First Unique Character in a String.
/**
 * @param {string} s
 * @return {number}
 */
 var firstUniqChar = function(s) {
  let table = new Map()
  for(let i = 0 ; i < s.length; i++){
      if(table.get(s.charAt(i))){
          table.set(s.charAt(i),table.get(s.charAt(i))+1)
      }else{
          table.set(s.charAt(i),1)
      }
  }
  let nonRepeating = ''; 
  for(const [key,index] of table){
      if(index == 1){
          nonRepeating = key
          break
      }
  }
  return (nonRepeating)?s.indexOf(nonRepeating): -1
};