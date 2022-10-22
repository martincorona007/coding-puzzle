//Problem https://leetcode.com/problems/implement-stack-using-queues/

//Runtime: 95 ms, faster than 46.30% of JavaScript online submissions for Implement Stack using Queues.
//Memory Usage: 42.3 MB, less than 6.50% of JavaScript online submissions for Implement Stack using Queues.
//https://leetcode.com/submissions/detail/819697559/

var MyStack = function() {
  this.element = [];
};

/** 
* @param {number} x
* @return {void}
*/
MyStack.prototype.push = function(x) {
  this.element.push(x);
};

/**
* @return {number}
*/
MyStack.prototype.pop = function() {
  return this.element.pop();
};

/**
* @return {number}
*/
MyStack.prototype.top = function() {
  return this.element[this.element.length-1];
};

/**
* @return {boolean}
*/
MyStack.prototype.empty = function() {
  return this.element.length == 0;
};
