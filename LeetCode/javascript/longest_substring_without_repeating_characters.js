//Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/

//Runtime: 86 ms, faster than 96.90% of JavaScript online submissions for Longest Substring Without Repeating Characters.
//Memory Usage: 45.5 MB, less than 86.00% of JavaScript online submissions for Longest Substring Without Repeating Characters.
//https://leetcode.com/submissions/detail/833494146/

var lengthOfLongestSubstring = function(s) {
  let window = []; 
  let left = 0;
  let longestSubtring = 0;
  for(let right = 0 ; right < s.length ; right ++){
    if(window.includes(s[right]) ){
        window.splice(left,window.indexOf(s[right])+ 1);
        window.push(s[right]);
     }else{
      window.push(s[right]);
    }
    aux = window.length;//aux save the length
    longestSubtring = aux > longestSubtring? aux: longestSubtring;//get the gratest value
   }
  return longestSubtring;
};