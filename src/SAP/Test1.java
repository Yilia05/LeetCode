package SAP;

import java.util.Scanner;

/**
 * Created by yzhang46 on 2018/4/12.
 */
public class Test1 {
    public static long[] getUglyNumber(int index){
        if(index <0){
            return null;
        }
        long[] uglyArray = new long[index];
        uglyArray[0] = 1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        int multiply7 = 0;
        for(int i = 1;i<index;i++){
            long min = min(uglyArray[multiply2]*2,uglyArray[multiply3]*3,uglyArray[multiply5]*5, uglyArray[multiply7]*7);
            uglyArray[i] = min;
            while(uglyArray[multiply2]*2 == uglyArray[i]){
                multiply2++;
            }
            while(uglyArray[multiply3]*3 == uglyArray[i]){
                multiply3++;
            }
            while(uglyArray[multiply5]*5 == uglyArray[i]){
                multiply5++;
            }
            while(uglyArray[multiply7]*7 == uglyArray[i]){
                multiply7++;
            }
        }
        return uglyArray;
    }
    public static long min(long number1,long number2,long number3,long number4){
        long min = (number1<number2)?number1:number2;
        long minmin = min<number3?min:number3;
        return minmin <number4?minmin:number4;
    }

    public static long find(long x, long[] res){
        int n = res.length;
        int low = 0;
        int high = n - 1;
        int middle = 0;         //定义middle
        long result = 0L;

        if(x < res[low] || low > high){
            return res[low];
        }

        while(low <= high){
            middle = (low + high) / 2;
            //System.out.print(middle);
            if(res[middle-1] > x){
                high = middle - 1;
            }else if(res[middle+1] < x){
                low = middle + 1;
            }else{
                if(x>=res[middle]){
                    result = x-res[middle]>res[middle+1]-x?res[middle+1]:res[middle];
                }
                if(x<res[middle]) {
                    result = x - res[middle-1] > res[middle] - x ? res[middle] : res[middle-1];
                }
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            long x = scanner.nextLong();
            long[] res;
            if(x<2048L){
                res = getUglyNumber(110);
//                System.out.println(res.length);
//                System.out.println(res[2]);
                System.out.print(find(x, res));
            }
            else {
                res = getUglyNumber(4024);
                System.out.print(find(x, res));
            }
        }

//        long[] a=new long[99999];
//        int count=0;
//        while(scanner.hasNext()){
//            a[count]=scanner.nextLong();
//            count++;
//        }
//        for(int i=0;i<=count;i++){
//            long[] res;
//            if(a[i]<2048){
//                res = getUglyNumber(110);
//                System.out.print(find(a[i], res));
//            }
//            else {
//                res = getUglyNumber(4024);
//                System.out.print(find(a[i], res));
//            }
//        }

    }
}
