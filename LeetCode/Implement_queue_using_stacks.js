//Problem: https://leetcode.com/problems/implement-queue-using-stacks/
//Runtime: 63 ms, faster than 92.32% of JavaScript online submissions for Implement Queue using Stacks.
//Memory Usage: 41.8 MB, less than 67.38% of JavaScript online submissions for Implement Queue using Stacks.

//https://leetcode.com/submissions/detail/818233570/

var MyQueue = function() {
  this.items = [];
};

/** 
* @param {number} x
* @return {void}
*/
MyQueue.prototype.push = function(x) {
  this.items.push(x);
};

/**
* @return {number}
*/
MyQueue.prototype.pop = function() {
  if(this.items.length === 0){
      return "NOP"
  }
  return this.items.shift();
};

/**
* @return {number}
*/
MyQueue.prototype.peek = function() {
  return this.items[0];
};

/**
* @return {boolean}
*/
MyQueue.prototype.empty = function() {
  return this.items.length === 0;
};

/** 
* Your MyQueue object will be instantiated and called as such:
* var obj = new MyQueue()
* obj.push(x)
* var param_2 = obj.pop()
* var param_3 = obj.peek()
* var param_4 = obj.empty()
*/