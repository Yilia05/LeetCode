/**
 * Created by yzhang46 on 2017/10/28.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 */
public class No136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        int n = nums.length;
        for (int i = 0; i<n; i++)
        {
            result ^=nums[i];
        }
        return result;
    }
}
