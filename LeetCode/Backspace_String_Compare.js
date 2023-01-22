
// Time Complexity: O(n + m)
// Space Complexity: O(n)
//Runtime 54 ms Beats 98.50% Memory 42.5 MB Beats 68.9%

var backspaceCompare = function(s, t) {
  return getResult(s).toString() === getResult(t).toString(); 
};
function getResult(w){
 let  right = w.length-1;
 let left = 0;
 let backSpace = 0;
 let finalW = '';
 while(right >= left){

   if(w[right] === '#'){
     backSpace++;
   }else{
     if(backSpace === 0){
       finalW += w.charAt(right);
     }
     if(backSpace > 0){
       backSpace--;
     }
   }
   right--;
 }
 return finalW;
}
console.log(backspaceCompare("ab#c","ad#c"))
console.log(backspaceCompare("ab##","c#d#"))
console.log(backspaceCompare("a#c","b"))
console.log(backspaceCompare("bxj##tw","bxo#j##tw"))
console.log(backspaceCompare("a#c","b"))

//Using DRY principle
// Time Complexity: O(n + m)
// Space Complexity: O(n)
//Runtime 99 ms Beats 30.51% Memory 42.2 MB Beats 79.48%

var backspaceCompare = function(s, t) {
  return getResult(s).toString() === getResult(t).toString();
};
function getResult(item){
  let arrayItem = [];
  for(let i = 0; i < item.length; i++){
    if(item.charAt(i) === '#'){
      arrayItem.pop();
    }else{
      arrayItem.push(item.charAt(i))
    }
  }
  return arrayItem;
}



// Time Complexity: O( n + m)
//  Space Complexity: O(n + m) 
// Runtime 87 ms Beats 41.16% Memory 42.6 MB Beats 56.39%

var backspaceCompare = function(s, t) {
  let arrayS = [];
  let arrayT = [];
  for(let i = 0; i < s.length; i++){
    if(s.charAt(i) === '#'){
      arrayS.pop();
    }else{
      arrayS.push(s.charAt(i))
    }
  }
  for(let j = 0; j < t.length; j++){
    if(t.charAt(j) === '#'){
      arrayT.pop();
    }else{
      arrayT.push(t.charAt(j))
    }
  }
  console.log({arrayS,arrayT})
  return arrayS.toString() === arrayT.toString();
};

