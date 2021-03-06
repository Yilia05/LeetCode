/**
 * Created by yzhang46 on 2017/05/16.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6
 *
 */

public class No53_MaximumSubarray {
    public int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum < 0){
                sum = A[i];
            }
            else{
                sum += A[i];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
