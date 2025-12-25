var validPalindrome = function(s) {
  s = s.replace(/[^A-Za-z0-9]/g,"").toLowerCase();
  let left = 0;
  let right = s.length-1;
  while(left < right){
      //console.log(">> ",{left,right})
      if(s[left] != s[right]){
          return isValidSubPalindrome(s,left+1,right) || isValidSubPalindrome(s,left,right-1);
      }
       
      left++;
      right--;
      
  }
  return true;
};
isValidSubPalindrome = (s,a,b) => {
  while(a < b){
      if(s[a] !== s[b]){
          return false;      
      }
      a++;
      b--;
  }
  return true
} 