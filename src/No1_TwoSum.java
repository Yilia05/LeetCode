/**
Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/
//my solution:

public class No1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
	        int i = 0;
	        int j = 0;
	        int ele = 0;
	        int[] a = new int[2];
	        for(i=0;i<nums.length;i++){
	            ele = target - nums[i];
	            for(j = i+1;j<nums.length;j++){
	                if(ele == nums[j]){
	                	//System.out.println(i);
	        			//System.out.println(j);
	        			a[0]=i;
	        			a[1]=j;
	        			return a;
	            }
	        }
	    }
	        return a;
    }
}



//O(n) solution:using hashmap

//public int[] twoSum(int[] numbers, int target) {
//    int[] result = new int[2];
//    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//    for (int i = 0; i < numbers.length; i++) {
//        if (map.containsKey(target - numbers[i])) {
//            result[1] = i + 1;
//            result[0] = map.get(target - numbers[i]);
//            return result;
//        }
//        map.put(numbers[i], i + 1);
//    }
//    return result;
//}


