// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int[] plusOne(int[] digits) {
        int plus = 0;
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1] += 1;
        }else{
            for(int i = digits.length - 1; i >= 0 ; i--){
                if(digits[i] < 9){
                    digits[i] += 1;
                    plus = 1;
                    break;
                }else{
                    digits[i] = 0;
                    
                }
                
            }
            if(plus == 0){
                int temp = digits[0];
                if(temp++ < 9){
                            digits = new int[digits.length + 1];
                            digits[0] = 1;
                }
            }
            
        }
        return digits;
    }
}