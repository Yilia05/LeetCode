import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yzhang46 on 2017/11/17.
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the absolute difference between i and j is at most k.
 */
public class No219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i])==null) {
                map.put(nums[i], i);
            }
            else {
                int res = i - map.get(nums[i]);
                if(res>k){
                    map.put(nums[i], i);
                }
                else
                    return true;
            }
        }
        return false;
    }
}
