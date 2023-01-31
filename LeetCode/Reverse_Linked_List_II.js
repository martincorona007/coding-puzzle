// Time Complexity: O(n)
// Space Complexity: O(1)
var reverseBetween = function(head, left, right) {
    
  let prevNode = null;//previos node
  let currentNode = head;
  let newList = null;//list to reverse
  let nNodes = 0;//nodes in the list
  let isFirstNode = left === 1? 1: 0;//i
  if(left === right){//same size, no necesary steps
      return head;
  }
  if(left - 1){//<first node> is after first node from the head list
      while(nNodes < left - 1){//iterate to get the <first node>
          prevNode = currentNode;
          currentNode = currentNode.next
          nNodes++;
      }
  }else{//first node its the head
          prevNode = head;
  }
  let tail = currentNode;//node points to the tail on newList
  while(left <= right){//iterate and swap from left node to right
      let temp =  currentNode.next;
      currentNode.next = newList;
      newList = currentNode;
      currentNode = temp;
      left++;
  }
  prevNode.next = newList//point the first node to new list
  tail.next = currentNode;// point to the end to the rest of the list
  if(isFirstNode){//when left = 1, and return from the second node
      return newList;
  }else{ //when left = 0, and return from the first node
      return head;
  }
  
};