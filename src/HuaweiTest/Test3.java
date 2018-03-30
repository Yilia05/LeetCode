package HuaweiTest;

/**
 * Created by yzhang46 on 2018/3/28.
 */
import java.util.*;

public class Test3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String[] ss=s.split(",");
        long[] a=new long[ss.length];
        for(int i=0;i<a.length;i++){
            a[i]=Long.parseLong(ss[i]);
        }
        long res=FindGreatestSumOfSubArray(a);
        System.out.println(res);
    }

    public static long FindGreatestSumOfSubArray(long[] array) {
        if (array.length==0 || array==null) {
            return 0;
        }
        long currentSum = 0;
        long max = 0;
        for (int i = 0; i < array.length; i++) {
            if(currentSum<=0){
                currentSum = array[i];
            }else{
                currentSum += array[i];
            }
            if(currentSum>max){
                max = currentSum;
            }
        }
        return max;
    }

    public static int function(int[] arr) {
        int len = arr.length;
        int[] sum = new int[len];
        int ans = 0;
        for (int i = 0; i < len; i++) {
            //右边界
            sum[i] = arr[i];
            for (int j = i+1; j < len; j++) {
                if (arr[j] >= arr[i]) {
                    sum[i] += arr[j];
                } else { break;
                }
            } //左边界
            for (int j = i-1; j >= 0;j--) {
                if (arr[j] >= arr[i]) {
                    sum[i] += arr[j];
                }
                else {
                    break;
                }
            }
            ans = Math.max(ans,sum[i]);
        }
        return ans;
    }
}