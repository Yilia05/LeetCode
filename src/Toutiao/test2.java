package Toutiao;

/**
 * Created by yzhang46 on 2018/3/24.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        int flag=0;
        List<Integer> list=new ArrayList<>();
        while(n>1){
            for(int i=2;i<Math.sqrt(n)+1;i++){
                flag=0;
                if(n%i==0){
                    flag=1;
                    n=n/i;
                    list.add(i);
                    break;
                }
            }
            if(flag==0){
                break;
            }
        }
        list.add(n);
        for (Integer aList : list) {
            sum = sum + aList - 1;
        }
        System.out.println(sum);

    }
}