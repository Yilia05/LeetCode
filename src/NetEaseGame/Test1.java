package NetEaseGame;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] num=new int[4];
        int[] weight=new int[4];
        for(int i=0;i<4;i++){
            num[i]=scanner.nextInt();
        }
        for(int i=0;i<4;i++){
            weight[i]=scanner.nextInt();
        }

        int res=fill(0,0,num,weight);

        System.out.println(res);
    }

    public static int fill(int sum,int total,int num[],int[] weight){
        int max=0;
        for(int i=0;i<4;i++){
            int[] newNum=num.clone();
            int res=0;
            if(newNum[i]==0){
                res=sum;
            }else {
                newNum[i]--;
                int u=total%10;
                res=fill(sum+weight[i]*u,total+weight[i],newNum,weight);
            }
            if(max<res){
                max=res;
            }
        }
        return max;
    }
}