// Time complexity:O(n)
// Space complexity:O(1)
class MoveZeros {

    public void moveZeros(int[] nums){
        if(nums.length == 0){
            return;
        }
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right]!= 0){
                nums[left] = nums[right];
                left++;
            }
        }
        for(int i = left; i < nums.length; i++){
            nums[i] = 0;
        }
        print(nums);
    }
    public void print(int[] nums){
        System.out.println();
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
    }
    public static void main(String [] args){
      int numbers0[] = {0};
      int numbers1[] = {0,1,0,3,12};
      MoveZeros sol = new MoveZeros();
      sol.moveZeros(numbers0);
      sol.moveZeros(numbers1);
      
    }
}
