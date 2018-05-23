package NetEase;

/**
 * Created by yzhang46 on 2018/3/27.
 */
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k == 0) {
            int sum = 1;
            for (int i = 1; i <= n; i++) {
                sum *= n;
            }
            System.out.print(sum);
            return;
        }
        int sum = 0;
        for (int i = k + 1; i <= n; i++) {
            sum += ((n / i) * (i - k));
            int t = n % i;
            if (t >= k) {
                sum += (t - k + 1);
            }
        }
        System.out.print(sum);

    }
}