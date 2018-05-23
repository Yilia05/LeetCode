package Toutiao;

import java.util.Scanner;

/**
 * Created by yzhang46 on 2018/3/24.
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String s = "a";
        String m = s;

    }

    public static void solve(int n) {
        if(n == 1){
            System.out.println(0);
        }
        if(n == 3){
            System.out.println(2);
        }
        int m = n&(n-1);
        if(m==0){
            System.out.println();
        }



    }
}
