package Toutiao;

/**
 * Created by yzhang46 on 2018/3/24.
 */
import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int hight = scan.nextInt();
        int[] t = new int[101];
        for (int i = 0; i < 101; i++) {
            t[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            t[scan.nextInt()] = 1;
        }
        int h = 0;
        for(int i=0; i<k; i++){
            for(int j = h+hight; j> h; j--){
                if(t[j]!=0){
                    h = 2*j - h;
                    break;
                }
            }
        }
        System.out.println(h);


    }
}