// Time Complexity: O(n)
// Space Complexity: O(1)
var reverseList = function(head) {
  let prev = null;
  let currentNode = head;
  while(currentNode){
      let temp = currentNode.next;
      currentNode.next = prev;
      prev = currentNode;
      currentNode = temp;    
  }
  return prev;
};