import java.util.Scanner;

public class MaxRange {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    in.close();
    System.out.println(getMax(arr, 0, n - 1));
    System.out.println(test.function(arr));
  }

  private static int getMax(int[] arr, int start, int end) {
    if (arr == null || start > end) {
      return 0;
    }
    int n = arr.length;
    int[][] min = new int[n + 1][n + 1];
    int[] sum = new int[n + 1];
    sum[0] = 0;
    // sum[i]即从第一个数加到第i个数的和，也就是arr[0]+...+arr[i-1]

    for(int i = 1; i<=end+1; i++){
      sum[i] += arr[i-1];
    }

    int max = -1;
    for (int k = 0; k <= end - start; k++)
      // 左右下标的差，k==0时,区间内有1个数
      for (int i = 0; i <= end - start - k; i++) {
        int j = i + k;
        if (k == 0) {
          min[i][j] = arr[i];
        } else {
          if (arr[j] < min[i][j - 1]) {
            min[i][j] = arr[j];
          } else {
            min[i][j] = min[i][j - 1];
          }
        }
        max = Math.max(max, min[i][j] * (sum[j + 1] - sum[i]));
      }

    return max;
  }
}

class test {
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
