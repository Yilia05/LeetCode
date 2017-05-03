import sun.reflect.generics.tree.SimpleClassTypeSignature;

/**
 * Created by Yilia05 on 2017/5/2.
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class No4_MedianofTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(n==0){
            if(m%2 == 1)
                return nums2[(int) Math.floor(m/2)];
            else
                return (nums2[(m-1)/2]+nums2[(m+1)/2])/2.0;
        }
        if(m==0){
            if(n%2 == 1)
                return nums1[(int) Math.floor(n/2)];
            else
                return (nums1[(n-1)/2]+nums1[(n+1)/2])/2.0;
        }
        if(n>m) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int mid = (m+n+1)/2;
        int imin = 0,imax = n;
        int maxOfLeft, minOfRight;

        while(true){
            int i = (imin+imax)/2;
            int j = mid-i;
            if(i<n && nums2[j-1]>nums1[i]){
                imin = i+1;
            }
            else if(i>0 && nums1[i-1]>nums2[j])
                imax = i-1;
            else{
                if(i==0)
                    maxOfLeft = nums2[j-1];
                else if (j==0){
                    maxOfLeft = nums1[i-1];
                }
                else{
                    maxOfLeft = Math.max(nums1[i-1],nums2[j-1]);
                }

                if((m+n)%2 == 1){
                    System.out.println(maxOfLeft);
                    return maxOfLeft;
                }
                if(n == i){
                    minOfRight = nums2[j];
                }
                else if(j == m){
                    minOfRight = nums1[i];
                }
                else{
                    minOfRight = Math.min(nums1[i],nums2[j]);
                }
                System.out.println("end else");
                return (maxOfLeft + minOfRight)/2.0;
            }
        }
    }

    public static void main(String[] args){
        int[] nums1 = {};
        int[] nums2 = {2,3};
        double re = findMedianSortedArrays(nums1,nums2);
        System.out.println(re);

    }
}
