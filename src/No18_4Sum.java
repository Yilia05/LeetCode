import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yzhang46 on 2017/9/Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * Note: The solution set must not contain duplicate quadruplets.
 */
public class No18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();

        if(nums.length<4)
            return lists;
        Arrays.sort(nums);
        if(nums[0]*4>target || nums[nums.length-1]*4<target)
            return lists;

        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int tempTarget = target-nums[i];
            for(int j = i+1; j<nums.length-1; j++){
                if(j>1 && j-1!=i && nums[j]==nums[j-1]){
                    continue;
                }
                int tempTarget2 = tempTarget-nums[j];
                int lo = j + 1, hi = nums.length-1;
                while (lo<hi){
                    if(nums[lo]+nums[hi] == tempTarget2){
                        lists.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                        lo++;
                        hi--;
                        while (lo < hi && nums[lo] == nums[lo - 1]) lo++;
                        while (lo < hi && hi<nums.length-1 && nums[hi] == nums[hi + 1]) hi--;
                    }else if(nums[lo]+nums[hi] > tempTarget2){
                        hi--;
                    }else {
                        lo++;
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        No18_4Sum no18 = new No18_4Sum();
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        System.out.println(no18.fourSum(nums, 0));
    }
}
