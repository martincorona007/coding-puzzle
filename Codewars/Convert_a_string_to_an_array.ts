//Convert a string to an array - 8kyu
//Write a function to split a string and convert it into an array of words.
//Examples
//"Robin Singh" ==> ["Robin", "Singh"]
//"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

export function stringToArray(s: string): string[] {
  let newArray = [];
  let lastPosition = 0;
  for(let i = 0; i < s.length;i++){
    if(s.charAt(i) === " "){//check the spaces in the string
      //take the word and push it into to the array
      newArray.push(s.slice(lastPosition,i))
      lastPosition = i + 1;//When a space is found, I take the index and increment it to 1, to get the next index of the word
    }
    if(i === s.length-1){//check for the last position of the array
      newArray.push(s.slice(lastPosition,i+1))// i + 1 = increment it to take the last character
    }
    
  }
  return newArray;