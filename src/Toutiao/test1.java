package Toutiao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by yzhang46 on 2018/3/24.
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] num = new int[n];

        for(int i = 0; i<n; i++){
            num[i] = scan.nextInt();
        }

        solve(k, num);

    }

    public static void solve(int k, int[] num){

        int[] newNum = new int[num.length];
        for(int  i = 0 ;i<num.length; i++){
            newNum[i] = num[i] + k;
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0;i<num.length; i++){
            set1.add(num[i]);
            set2.add(newNum[i]);
        }


        Set<Integer> res = new HashSet<>();
        res.addAll(set1);
        res.retainAll(set2);

        System.out.println(res.size());
    }
}
