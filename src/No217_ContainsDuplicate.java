import java.util.HashSet;
import java.util.Set;

/**
 * Created by yzhang46 on 2017/11/16.
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class No217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
