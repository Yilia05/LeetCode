/**
 * Created by yzhang46 on 2017/11/1.
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 */
public class No167_TwoSumII_Inputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if(target<numbers[0] || numbers == null || numbers.length < 2){
            return res;
        }
        int left = 0, right = numbers.length - 1;
        while (left<right){
            if(numbers[left]+numbers[right] == target){
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            else if(numbers[left]+numbers[right] >target){
                right--;
            }
            else {
                left++;
            }
        }
        return res;

    }
}
