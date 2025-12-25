
//Time Complexity: O(n)
//Space Complexity: O(1)
var isPalindrome = function(s) {
  s = s.replace(/[^A-Za-z0-9]/g,"").toLowerCase();
  for(let i = 0; i < s.length; i++){
      //console.log(s[i],s[s.length-1 - i])
      if(s[i] != s[s.length-1 - i]){
         // left = s[i]
         // right = s[s.length-1 - i]
         // left and right of the string
          return false;
      }
  }
  return true;
}