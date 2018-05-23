//package NetEase;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * Created by yzhang46 on 2018/3/27.
// */
//public class test1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] leftX = new int[n];
//        int[] leftY = new int[n];
//        int[] rightX = new int[n];
//        int[] rightY = new int[n];
//
//        for(int i = 0; i<n; i++){
//            leftX[i] = scan.nextInt();
//        }
//        for(int i = 0; i<n; i++){
//            leftY[i] = scan.nextInt();
//        }
//        for(int i = 0; i<n; i++){
//            rightX[i] = scan.nextInt();
//        }
//        for(int i = 0; i<n; i++){
//            rightY[i] = scan.nextInt();
//        }
//
//        solve(n, leftX, leftY, rightX, rightY);
//
//    }
//
//    public static void solve(int n, int[] leftX, int[] leftY, int[] rightX, int[] rightY) {
//        int[][] dp = new int[n][n];
//        for(int i = 0; i<n; i++){
//
//        }
//        for i in range(n):
//        for j in range(d[x1[i]], d[x2[i]]):
//        for k in range(d[y1[i]], d[y2[i]]):
//        a[j][k] += 1
//        ans = max(ans, a[j][k])
//        List<int[]> pointList = new LinkedList<>();
//        int[][] points = new int[n][4];
//        for(int i = 0; i<n; i++){
//            int[] point = new int[4];
//            point[0] = leftX[i];
//            point[1] = leftY[i];
//            point[2] = rightX[i];
//            point[3] = rightY[i];
//            pointList.add(point);
//        }
//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] points.get, int[] o2) {
//                return 0;
//            }
//        });
//        int minLeftX = leftX[0];
//        int maxLeftX = leftX[n-1];
//
//        for(int i = 0; i<n; i++){
//            if(pointList.get(i)[0] == minLeftX){
//
//            }
//        }
//
//    }
//    private static boolean isChongdie(int x10, int y10, int x20, int y20, int x11, int y11, int x21, int y21) {
//        boolean isChong = false;
//
//        if(x20 > x11 && x21 > x10 && y20 > y21 && y21 > y20)
//            isChong = true;
//
//        return isChong;
//    }
//}
