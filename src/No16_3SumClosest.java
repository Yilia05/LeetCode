import java.util.Arrays;

/**
 * Created by YiliaZhang on 2017/5/6.
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class No16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0]+nums[1]+nums[2];
        for(int i = 0; i<nums.length-2; i++){
            int lo = i+1;
            int hi = nums.length-1;
            while(lo < hi){
                if((nums[i]+nums[lo]+nums[hi]) == target)
                    return target;
                else if((nums[i]+nums[lo]+nums[hi]) < target){
                    if(Math.abs(target-(nums[i]+nums[lo]+nums[hi])) < Math.abs(target-res))
                        res = nums[i]+nums[lo]+nums[hi];
                    lo++;
                }
                else if((nums[i]+nums[lo]+nums[hi]) > target){
                    if(Math.abs(target-(nums[i]+nums[lo]+nums[hi])) < Math.abs(target-res))
                        res = nums[i]+nums[lo]+nums[hi];
                    hi--;
                }
            }

        }return res;
    }

    public static void main(String[] args) {
        No16_3SumClosest no16 = new No16_3SumClosest();
        int[] nums = {1,2,4,8,16,32,64,128};
        int target = 82;
        System.out.print(no16.threeSumClosest(nums,target));
    }



}
