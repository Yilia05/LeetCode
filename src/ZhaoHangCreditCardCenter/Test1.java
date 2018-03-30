package ZhaoHangCreditCardCenter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yzhang46 on 2018/3/29.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

//        solve(str);
    }

//    public static boolean solve(String str) {
//        int n = str.length();
//        int low = 0;
//        int high = n-1;
//        char start = str.charAt(low);
//        char end = str.charAt(high);
//
//        List<Integer> list = new LinkedList<>();
//        for(int i =0; i<n; i++){
//            if(str.charAt(i) == end){
//                list.add(i);
//            }
//        }
//        List<Integer> realList = new LinkedList<>();
//        for(int i = 0; i<list.size(); i++){
//            if(n%(list.get(i)+1) == 0){
//                realList.add(list.get(i));
//            }
//        }
//        if(realList.size() == 0){
//            return false;
//        }
//        for(int i = 0; i<realList.size(); i++){
//            if(str.charAt())
//        }
//    }

    public static boolean isTrue(String sub,String source){
        boolean ret = false;
        StringBuilder sb = new StringBuilder();
        if (source.length()%sub.length()==0){
            for (int i = 0;i<source.length()/sub.length();i++){
                sb.append(sub);
            }
            if (sb.toString().equals(source))
                ret = true;
            return ret;
        }else
            return ret;
    }
}
