package org.example;

//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/submissions/877075498/
class MaxiumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int positive = 0;
        int negative = 0;
        for(int i = 0; i < nums.length; i++){
                if( nums[i] < 0){
                     negative++;
                }
                if(nums[i] > 0){
                    positive++;
                } 
             
        }
        return (positive >= negative)? positive : negative;
    }
}