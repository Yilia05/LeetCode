//package NetEase;
//
//import java.util.*;
//
//
//public class test3 {
//    public static void main(String[] args){
//        HashMap<Integer, Integer> map
//        Scanner scanner=new Scanner(System.in);
//
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//
//        Map map=new HashMap<Integer,Integer>();
//
//        List<Integer> l=new ArrayList();
//
//
//        for(int i=0;i<n;i++){
//            int Di=scanner.nextInt();
//            int Pi=scanner.nextInt();
//            if (map.get(Di)==null){
//                l.add(Di);
//                map.put(Di,Pi);
//            }else{
//                int temp=(int)map.get(Di);
//                if(temp<Pi){
//                    map.put(Di,Pi);
//                }
//            }
//        }
//
//        int[] mems=new int[m];
//
//        for(int i=0;i<m;i++){
//            mems[i]=scanner.nextInt();
//        }
//
//
//        Collections.sort(l);
//        int[] a=new int[l.size()];
//        for(int i=0;i<l.size();i++){
//            a[i]=l.get(i);
//        }
//
//
//
//        for(int i=0;i<m;i++){
//            int index=biSearch(a,mems[i]);
//            int pi=(int)map.get(a[index]);
//            for(int j=0;j<index;j++){
//                if(pi<(int)map.get(a[j])){
//                    pi=(int)map.get(a[j]);
//                }
//            }
//            System.out.println(pi);
//        }
//    }
//
//    public static int biSearch(int []array,int a){
//        int lo=0;
//        int hi=array.length-1;
//        int mid;
//        while(lo<=hi){
//            mid=(lo+hi)/2;
//            if(array[mid]==a){
//                return mid;
//            }else if(array[mid]<a){
//                lo=mid+1;
//            }else{
//                hi=mid-1;
//            }
//        }
//        return lo-1;
//    }
//}