/**
 * Created by yzhang46 on 2018/3/23.
 */
public class ToutiaoLastYear {
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
                } else {
                    break;
                }
            }
            //左边界
            for (int j = i-1; j >= 0;j--) {
                if (arr[j] >= arr[i]) {
                    sum[i] += arr[j];
                } else {
                    break;
                }
            }
            ans = Math.max(ans,sum[i]*arr[i]);
        }
        return ans;
    }

}
