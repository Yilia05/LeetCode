package ZhaoHangCreditCardCenter;

import java.util.Scanner;

/**
 * Created by yzhang46 on 2018/3/29.
 */
public class Test2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

	int[] nums = new int[n + 8];
        nums[1] = 1;
        nums[2] = 1;

        for (int i = 1; i <= n; i++){
            int max = 1;
            for (int j = 1; j <= (i / 2) + 1 ; j++){
                if (max < nums[j] * nums[i - j]){
                    max = nums[j] * nums[i - j];
                }
                if (max < j * nums[i - j]){
                    max = j * nums[i - j];
                }
                if (max < j * (i - j)){
                    max = j * (i - j);
                }
            }
            nums[i] = max;
        }

        System.out.print(nums[n]);
    }
}
