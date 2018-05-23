package Meituan;

import java.util.Scanner;

/**
 * Created by yzhang46 on 2018/3/22.
 */
public class Meituan {
    public static void test(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String s = scan.nextLine();
            String t = scan.nextLine();

            int sum = 0;
            int end = t.length();
            while (end<=s.length()){
                for(int i=0; i<t.length(); i++){
                    if(s.charAt(end-t.length()+1)!=t.charAt(i)){
                        sum+=1;
                    }
                }
                end++;
            }
            System.out.println(sum);
        }
    }

    public int solve(String s, String t){
        int res = 0;

        for(int i = 0; i< s.length()-t.length(); i++){

        }

        return res;
    }

    public static void test11(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while(scan.hasNext()){
            String s = scan.nextLine();
            String t = scan.nextLine();
            int len1 = s.length();
            int len2 = t.length();
            int n = len1 - len2 + 1;

            for(int i=0; i<n; i++){
                String str = s.substring(1,i+len2);
                sum += solve(s, t, len2);
            }
        }
        System.out.println(sum);
    }

    private static int solve(String s1, String s2, int n){
        int k = 0;
        for(int i = 0; i<n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                k++;
            }
        }
        return k;
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        int[] a = new int[10];
//        char[] c = s.toCharArray();
//        for(int i = 0; i<a.length; i++){
//            a[i] = 0;
//        }
//        for(int i = 0; i<c.length; i++){
//            a[c[i]-'0']++;
//        }
//        int index = 0;
//        int flag = 0;
//        int max = 0;
//        for(int i = 0; i<a.length; i++){
//            if(a[i] == 0){
//                flag = 1;
//                index = i;
//                break;
//            }
//            if(a[i]>max){
//                index=i;
//                max = a[i];
//            }
//        }
//        if(flag == 1){
//            System.out.println(index);
//        }
//        else{
//            StringBuffer buffer = new StringBuffer();
//            for(int i = 0; i<max; i++){
//                buffer.append(index);
//            }
//            System.out.println(buffer);
//        }
//    }

    public static void solve2(String s) {
        int[] a = new int[10];
        char[] c = s.toCharArray();
        for(int i = 0; i<a.length; i++){
            a[i] = 0;
        }
        for(int i = 0; i<c.length; i++){
            a[c[i]-'0']++;
        }
        int index = 0;
        int flag = 0;
        int max = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] == 0){
                flag = 1;
                index = i;
                break;
            }
            if(a[i]>max){
                index=i;
                max = a[i];
            }
        }
        if(flag == 1){
            System.out.println(index);
        }
        else{
            StringBuffer buffer = new StringBuffer();
            for(int i = 0; i<max; i++){
                buffer.append(index);
            }
            System.out.println(buffer);
        }
    }

}
