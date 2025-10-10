import java.util.HashSet;
import java.util.Set;
//T.C. O(n)
//S.C. O(n)
public class containsDuplicate {
     public boolean containsDuplicate(int[] nums) {
       Set<Integer> setInstance = new HashSet<>();

       for(int i = 0 ; i < nums.length;i++){
            if(setInstance.contains(nums[i])){
                return true;
            }else{
                setInstance.add(nums[i]);
            }
       }
       return false;
    }
}
