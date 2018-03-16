/**
 * Created by yzhang46 on 2017/12/4.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 *
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 */
public class No268_MissingNumber {
    // a^b^b =a
    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }
}

